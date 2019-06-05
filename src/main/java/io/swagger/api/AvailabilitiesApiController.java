package io.swagger.api;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import io.swagger.model.AvailabilityResult;
import io.swagger.model.AvailabilityResults;
import io.swagger.model.HotelDescriptiveInfo;
import io.swagger.model.Service;
import io.swagger.util.ModelObjectsManager;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

@Controller
public class AvailabilitiesApiController implements AvailabilitiesApi {

    private static final Logger log = LoggerFactory.getLogger(AvailabilitiesApiController.class);
    private static final Map<String, Set<String>> hotelsPerRegion = new HashMap<>();
    
    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    private ModelObjectsManager modelObjectsManager;

    @org.springframework.beans.factory.annotation.Autowired
    public AvailabilitiesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.request = request;
        Set<String> hotelIdsInRegionZH= new TreeSet<String>();
        Set<String> hotelIdsInAargau= new TreeSet<String>();
        Set<String> hotelIdsInBasel= new TreeSet<String>();
        hotelIdsInAargau.add("00U5845f022rotesh");
        hotelIdsInAargau.add("00U5556f030plb91");
        hotelIdsInAargau.add("00U5846f022marco");
        hotelIdsInAargau.add("00U5845f022gbrugg");
        hotelIdsInAargau.add("00G5846t022gotth");
        hotelIdsInAargau.add("00F5846A022nowifi");
        hotelIdsInAargau.add("00F5846A02nowifi2");
        hotelIdsInAargau.add("00B5846t02termin");
        
        hotelIdsInRegionZH.add("00U5846e0f2ukulm");
        hotelIdsInRegionZH.add("00U5846j022d291s");       
        hotelIdsInRegionZH.add("00U5844f022rigib");
        hotelIdsInRegionZH.add("00U5846f022c291a");
        hotelIdsInRegionZH.add("00U5847f022marri");
        hotelIdsInRegionZH.add("00U5845j020s210l");
        hotelIdsInRegionZH.add("00I5846a022h291r");
        hotelIdsInRegionZH.add("00U5846j022d292h");       
        hotelIdsInRegionZH.add("00B5846B02barlac");
        //Basel
        hotelIdsInBasel.add("00G5846t022easyh");
        
        hotelsPerRegion.put("Aargau", hotelIdsInAargau);
        hotelsPerRegion.put("ZH", hotelIdsInRegionZH);
        hotelsPerRegion.put("Basel", hotelIdsInBasel);
       			
       	
    }

    public ResponseEntity<AvailabilityResults> availabilitiesHotelIdGet(@ApiParam(value = "ID of the hotel",required=true) @PathVariable("hotelId") String hotelId,@NotNull @ApiParam(value = "ID of the user session", required = true) @Valid @RequestParam(value = "sessionId", required = true) String sessionId,@NotNull @ApiParam(value = "Start date of the stay (date of arrival)", required = true) @Valid @RequestParam(value = "start", required = true) LocalDate start,@NotNull @ApiParam(value = "End date of the stay (date of departure)", required = true) @Valid @RequestParam(value = "end", required = true) LocalDate end,@NotNull @ApiParam(value = "Number of adults for the stay", required = true) @Valid @RequestParam(value = "nbAdults", required = true) Integer nbAdults,@NotNull @ApiParam(value = "Number of children for the stay", required = true) @Valid @RequestParam(value = "nbChildren", required = true) Integer nbChildren,@NotNull @ApiParam(value = "Number of infants for the stay", required = true) @Valid @RequestParam(value = "nbInfants", required = true) Integer nbInfants) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
			try {
				AvailabilityResults availabilityResults = modelObjectsManager.getAvailabilityResults(hotelId);

				if (availabilityResults == null) {
					throw new RuntimeException("Unknow hotel ID");
				}

				return new ResponseEntity<AvailabilityResults>(availabilityResults, HttpStatus.OK);
			}
			catch (Exception e) {
				log.error("Error retrieving hotel descriptive info for hotel with ID '" + hotelId + "'!", e);
				return new ResponseEntity<AvailabilityResults>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
        }

        return new ResponseEntity<AvailabilityResults>(HttpStatus.NOT_IMPLEMENTED);
    }

    private ResponseEntity<List<AvailabilityResult>> findAppropriateHotels(Set<String> hotel_Ids, Integer nbAdults, Integer nbrooms,Integer maxprice, Boolean breakfast, Boolean wifi) {
    	 List<AvailabilityResult> results= new ArrayList<>();
    	 ResponseEntity<List<AvailabilityResult>> response= null;
    	 for(String each: hotel_Ids) {
	    	 try {
					AvailabilityResults availabilityResultsPerHotel = modelObjectsManager.getAvailabilityResults(each);
					HotelDescriptiveInfo descriptiveInfo= modelObjectsManager.getHotelDescriptiveInfos().get(each);
					Float available_price;
					if (availabilityResultsPerHotel == null || descriptiveInfo== null) {
						throw new RuntimeException("Unknown hotel ID");
					}else {
						if(nbAdults>=nbrooms) {
							boolean matches= true;
							AvailabilityResult availabilitysingleAdult= availabilityResultsPerHotel.get(0).getProducts().get(0);
							int availableNbRooms= availabilityResultsPerHotel.get(0).getProducts().get(0).getAvailability();
							available_price= availabilitysingleAdult.getTotalPrice();
							if((available_price <= maxprice) && (availableNbRooms >= nbrooms)) {
								List<Service> services = descriptiveInfo.getHotelInfo().getServices();
								boolean containsBreakfast = false, containsWifi=false;
								for(Service eachService:services) {									
									String code= eachService.getCode();
								    if(Integer.parseInt(code)==173) { 
								    	containsBreakfast=true;
								    }
								    if(343==Integer.parseInt(code)) {
								    	containsWifi=true;
								    }
								 }

								if(Boolean.TRUE.equals(breakfast) ) {		       								
									if(!containsBreakfast) {
										matches=false;
									}									
										
								}									
								if(Boolean.TRUE.equals(wifi)  ) {
									if(!containsWifi) {
										matches=false;
									}
												     								
     							}
							
							if(matches) {
								results.add( availabilitysingleAdult);
							}
							
	    	 				}
							
						}
						
					response= new ResponseEntity<>(results, HttpStatus.OK);
					}
				}
				catch (Exception e) {
					log.error("Error retrieving hotel descriptive info for hotel with ID '" + each + "'!", e);
					return new ResponseEntity<List<AvailabilityResult>>(HttpStatus.INTERNAL_SERVER_ERROR);
				}   
    	 }
		
	return response;
    }
    public ResponseEntity<List<AvailabilityResult>> availabilitiesInSearchRegion(@NotNull @ApiParam(value = "Region",required=true) @Valid @RequestParam(value = "region", required = true) String region,
    		@NotNull @ApiParam(value = "ID of the user session", required = true) @Valid @RequestParam(value = "sessionId", required = true) String sessionId,
    		@NotNull @ApiParam(value = "Start date of the stay (date of arrival)", required = true) @Valid @RequestParam(value = "start", required = true) LocalDate start,
    		@NotNull @ApiParam(value = "End date of the stay (date of departure)", required = true) @Valid @RequestParam(value = "end", required = true) LocalDate end,
    		@NotNull @ApiParam(value = "Number of adults for the stay", required = true) @Valid @RequestParam(value = "nbAdults", required = true) Integer nbAdults,
    		@NotNull @ApiParam(value = "Number of children for the stay", required = true) @Valid @RequestParam(value = "nbChildren", required = true) Integer nbChildren,
    		@NotNull @ApiParam(value = "Number of infants for the stay", required = true) @Valid @RequestParam(value = "nbInfants", required = true) Integer nbInfants,
    		@NotNull @ApiParam(value = "Maximum price", required = true) @Valid @RequestParam(value = "maxprice", required = true) Integer maxprice,
    		@NotNull @ApiParam(value = "Number of rooms", required = true) @Valid @RequestParam(value = "nbrooms", required = true) Integer nbrooms,
    		@ApiParam(value = "Breakfast", required = false) @Valid @RequestParam(value = "breakfast", required = false) Boolean breakfast,
    		@ApiParam(value = "Wifi", required = false) @Valid @RequestParam(value = "wifi", required = false) Boolean wifi
    		) {
        String accept = request.getHeader("Accept");               
        ResponseEntity<List<AvailabilityResult>> response= null;
        
        if (accept != null && accept.contains("application/json")) {
        	if(region.equals("ZH")) {
        		//filter the availabilities for hotels in hotelsPerRegion.get("ZH")
        		
        		response=findAppropriateHotels(  hotelsPerRegion.get("ZH"), nbAdults, nbrooms, maxprice, breakfast, wifi);
        	
        		return response;
        	}
        	if(region.equalsIgnoreCase("Aargau")) {
        		//filter the availabilities for hotels in HotelsPerRegion.get("Aargau")        		
        		
        		response=findAppropriateHotels( hotelsPerRegion.get("Aargau"), nbAdults, nbrooms, maxprice, breakfast, wifi);
        		 
        		return response;
        	}if(region.equalsIgnoreCase("Basel")) {
        		response=findAppropriateHotels( hotelsPerRegion.get("Basel"), nbAdults, nbrooms, maxprice, breakfast, wifi);
        		return response;
        	}
        }        
        return new ResponseEntity<List<AvailabilityResult>>(HttpStatus.NOT_IMPLEMENTED);       
   
    }
    
 }

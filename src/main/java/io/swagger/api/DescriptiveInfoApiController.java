package io.swagger.api;

import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import io.swagger.annotations.ApiParam;
import io.swagger.model.HotelDescriptiveInfo;
import io.swagger.util.ModelObjectsManager;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

@Controller
public class DescriptiveInfoApiController implements DescriptiveInfoApi {

    private static final Logger log = LoggerFactory.getLogger(DescriptiveInfoApiController.class);

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    private ModelObjectsManager modelObjectsManager;
    
    @org.springframework.beans.factory.annotation.Autowired
    public DescriptiveInfoApiController(HttpServletRequest request) {
        this.request = request;
    }

    public ResponseEntity<HotelDescriptiveInfo> descriptiveInfoLangHotelIdGet(@ApiParam(value = "Language",required=true, allowableValues = "\"en\", \"fr\", \"de\", \"nl\", \"es\", \"it\"") @PathVariable("lang") String lang,@ApiParam(value = "ID of the hotel",required=true) @PathVariable("hotelId") String hotelId) {
        String accept = request.getHeader("Accept");

        if (accept != null && accept.contains("application/json")) {
            try {
            	TreeMap<String, HotelDescriptiveInfo> hotelDescriptiveInfos = modelObjectsManager.getHotelDescriptiveInfos();
            	HotelDescriptiveInfo hotelDescriptiveInfo = hotelDescriptiveInfos.get(hotelId);
            	
            	if (hotelDescriptiveInfo == null) {
            		throw new RuntimeException("Unknow hotel ID");
            	}
            	
            	return new ResponseEntity<HotelDescriptiveInfo>(hotelDescriptiveInfo, HttpStatus.OK);
            } 
            catch (Exception e) {
                log.error("Error retrieving hotel descriptive info for hotel with ID '" + hotelId + "'!", e);
                return new ResponseEntity<HotelDescriptiveInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<HotelDescriptiveInfo>(HttpStatus.NOT_IMPLEMENTED);
    }

}

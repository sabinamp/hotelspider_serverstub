/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.0).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import io.swagger.model.AvailabilityResult;
import io.swagger.model.AvailabilityResults;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

@Api(value = "availabilities", description = "the availabilities API")
public interface AvailabilitiesApi {

    @ApiOperation(value = "returns the available products for the given search parameters", nickname = "availabilitiesHotelIdGet", notes = "", response = AvailabilityResults.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Availabilities", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Availability info", response = AvailabilityResults.class),
        @ApiResponse(code = 401, message = "Unauthorized - The supplied API key does not allow you to access this resource (hotel/room type/rate plan)"),
        @ApiResponse(code = 404, message = "Resource not found") })
    @RequestMapping(value = "/availabilities/{hotelId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<AvailabilityResults> availabilitiesHotelIdGet(@ApiParam(value = "ID of the hotel",required=true) @PathVariable("hotelId") String hotelId,@NotNull @ApiParam(value = "ID of the user session", required = true) @Valid @RequestParam(value = "sessionId", required = true) String sessionId,@NotNull @ApiParam(value = "Start date of the stay (date of arrival)", required = true) @Valid @RequestParam(value = "start", required = true) LocalDate start,@NotNull @ApiParam(value = "End date of the stay (date of departure)", required = true) @Valid @RequestParam(value = "end", required = true) LocalDate end,@NotNull @ApiParam(value = "Number of adults for the stay", required = true) @Valid @RequestParam(value = "nbAdults", required = true) Integer nbAdults,@NotNull @ApiParam(value = "Number of children for the stay", required = true) @Valid @RequestParam(value = "nbChildren", required = true) Integer nbChildren,@NotNull @ApiParam(value = "Number of infants for the stay", required = true) @Valid @RequestParam(value = "nbInfants", required = true) Integer nbInfants);

    @RequestMapping(value = "/availabilities/",
            produces = { "application/json" }, 
            method = RequestMethod.GET)
        ResponseEntity<List<AvailabilityResult>> availabilitiesInSearchRegion(@NotNull @ApiParam(value = "Region",required=true) @Valid @RequestParam(value = "region", required = true) String region,@NotNull @ApiParam(value = "ID of the user session", required = true) @Valid @RequestParam(value = "sessionId", required = true) String sessionId,@NotNull @ApiParam(value = "Start date of the stay (date of arrival)", required = true) @Valid @RequestParam(value = "start", required = true) LocalDate start,@NotNull @ApiParam(value = "End date of the stay (date of departure)", required = true) @Valid @RequestParam(value = "end", required = true) LocalDate end,@NotNull @ApiParam(value = "Number of adults for the stay", required = true) @Valid @RequestParam(value = "nbAdults", required = true) Integer nbAdults,@NotNull @ApiParam(value = "Number of children for the stay", required = true) @Valid @RequestParam(value = "nbChildren", required = true) Integer nbChildren,
        		@NotNull @ApiParam(value = "Number of infants for the stay", required = true) @Valid @RequestParam(value = "nbInfants", required = true) Integer nbInfants,
        		@NotNull @ApiParam(value = "Maximum price", required = true) @Valid @RequestParam(value = "maxprice", required = true) Integer maxprice,
        		@NotNull @ApiParam(value = "Number of rooms", required = true) @Valid @RequestParam(value = "nbrooms", required = true) Integer nbrooms,        		
        		@ApiParam(value = "Breakfast", required = false) @Valid @RequestParam(value = "breakfast", required = false) Boolean breakfast,
        		@ApiParam(value = "Wifi", required = false) @Valid @RequestParam(value = "wifi", required = false) Boolean wifi
        		);
}

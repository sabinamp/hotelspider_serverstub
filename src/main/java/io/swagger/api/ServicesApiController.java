package io.swagger.api;

import java.io.IOException;
import java.time.LocalDate;

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
import io.swagger.model.ServiceResults;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

@Controller
public class ServicesApiController implements ServicesApi {

    private static final Logger log = LoggerFactory.getLogger(ServicesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ServicesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ServiceResults> servicesLangHotelIdGet(@ApiParam(value = "Language",required=true, allowableValues = "\"en\", \"fr\", \"de\", \"nl\", \"es\", \"it\"") @PathVariable("lang") String lang,@ApiParam(value = "ID of the hotel",required=true) @PathVariable("hotelId") String hotelId,@NotNull @ApiParam(value = "ID of the user session", required = true) @Valid @RequestParam(value = "sessionId", required = true) String sessionId,@NotNull @ApiParam(value = "ID of the room type", required = true) @Valid @RequestParam(value = "roomId", required = true) String roomId,@NotNull @ApiParam(value = "ID of the rate plan", required = true) @Valid @RequestParam(value = "rateplanId", required = true) String rateplanId,@NotNull @ApiParam(value = "Start date of the stay (date of arrival)", required = true) @Valid @RequestParam(value = "start", required = true) LocalDate start,@NotNull @ApiParam(value = "End date of the stay (date of departure)", required = true) @Valid @RequestParam(value = "end", required = true) LocalDate end,@NotNull @ApiParam(value = "Number of adults for the stay", required = true) @Valid @RequestParam(value = "nbAdults", required = true) Integer nbAdults,@NotNull @ApiParam(value = "Number of children for the stay", required = true) @Valid @RequestParam(value = "nbChildren", required = true) Integer nbChildren,@NotNull @ApiParam(value = "Number of infants for the stay", required = true) @Valid @RequestParam(value = "nbInfants", required = true) Integer nbInfants) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ServiceResults>(objectMapper.readValue("\"\"", ServiceResults.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServiceResults>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServiceResults>(HttpStatus.NOT_IMPLEMENTED);
    }

}

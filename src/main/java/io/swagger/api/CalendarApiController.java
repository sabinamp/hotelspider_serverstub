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
import io.swagger.model.CalendarResults;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

@Controller
public class CalendarApiController implements CalendarApi {

    private static final Logger log = LoggerFactory.getLogger(CalendarApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CalendarApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<CalendarResults> calendarHotelIdGet(@ApiParam(value = "ID of the hotel",required=true) @PathVariable("hotelId") String hotelId,@NotNull @ApiParam(value = "Start date of the requested timespan", required = true) @Valid @RequestParam(value = "start", required = true) LocalDate start,@NotNull @ApiParam(value = "End date of the requested timespan", required = true) @Valid @RequestParam(value = "end", required = true) LocalDate end,@ApiParam(value = "ID of the room type") @Valid @RequestParam(value = "roomId", required = false) String roomId,@ApiParam(value = "ID of the rate plan") @Valid @RequestParam(value = "rateplanId", required = false) String rateplanId,@ApiParam(value = "Number of adults (if known)") @Valid @RequestParam(value = "nbAdults", required = false) Integer nbAdults,@ApiParam(value = "Number of children (if known)") @Valid @RequestParam(value = "nbChildren", required = false) Integer nbChildren,@ApiParam(value = "Number of infants (if known)") @Valid @RequestParam(value = "nbInfants", required = false) Integer nbInfants) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CalendarResults>(objectMapper.readValue("{  \"2018-10-02\" : {    \"price\" : 219,    \"currencyCode\" : \"CHF\",    \"bookable\" : true  },  \"2018-10-03\" : {    \"price\" : 225,    \"currencyCode\" : \"CHF\",    \"bookable\" : true  },  \"2018-10-04\" : {    \"price\" : 0,    \"currencyCode\" : \"CHF\",    \"bookable\" : false  }}", CalendarResults.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CalendarResults>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CalendarResults>(HttpStatus.NOT_IMPLEMENTED);
    }

}

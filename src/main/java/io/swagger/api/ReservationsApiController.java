package io.swagger.api;

import io.swagger.model.CancelReservationRequest;
import io.swagger.model.InlineResponse200;
import io.swagger.model.Reservation;
import io.swagger.model.ReservationRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

@Controller
public class ReservationsApiController implements ReservationsApi {

    private static final Logger log = LoggerFactory.getLogger(ReservationsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ReservationsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse200> reservationsHotelIdActionsBookPost(@ApiParam(value = "ID of the hotel",required=true) @PathVariable("hotelId") String hotelId,@ApiParam(value = "Information about the reservation to be booked" ,required=true )  @Valid @RequestBody ReservationRequest reservation) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse200>(objectMapper.readValue("{  \"reservationId\" : \"02a59ad1575b5cd8\",  \"status\" : \"Book\"}", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> reservationsHotelIdActionsCancelPost(@ApiParam(value = "ID of the hotel",required=true) @PathVariable("hotelId") String hotelId,@ApiParam(value = "Information about the reservation to be cancelled" ,required=true )  @Valid @RequestBody CancelReservationRequest reservation) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Reservation> reservationsHotelIdLangReservationIdGet(@ApiParam(value = "Language",required=true, allowableValues = "\"en\", \"fr\", \"de\", \"nl\", \"es\", \"it\"") @PathVariable("lang") String lang,@ApiParam(value = "ID of the hotel",required=true) @PathVariable("hotelId") String hotelId,@ApiParam(value = "ID of the reservation",required=true) @PathVariable("reservationId") String reservationId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Reservation>(objectMapper.readValue("{  \"lastModifyDateTime\" : \"2015-09-08T13:11:31.2567097+00:00\",  \"roomStays\" : [ {    \"total\" : {      \"amountAfterTax\" : 340.6,      \"currencyCode\" : \"CHF\"    },    \"cancelPenalties\" : \"Attention: Prepaid rate category. Booking policies differ from general hotel policy! Cancellation: Please note, if cancelled or modified, the total price of the non-refundable rate of the reservation will be charged on the credit card! Non refundable deposit of 100% of the full stay including tax is required at the time of booking.\",    \"resGuestRphs\" : [ 1 ],    \"ratePlanId\" : \"01n576bcf7dadcba\",    \"rates\" : [ {      \"date\" : \"2015-12-02\",      \"amountAfterTax\" : 170.3,      \"currencyCode\" : \"CHF\"    }, {      \"date\" : \"2015-12-03\",      \"amountAfterTax\" : 170.3,      \"currencyCode\" : \"CHF\"    } ],    \"guestCounts\" : [ {      \"count\" : 2,      \"ageQualifyingCode\" : 10    }, {      \"count\" : 2,      \"ageQualifyingCode\" : 10    } ],    \"timeSpan\" : {      \"start\" : \"2015-12-02\",      \"end\" : \"2015-12-04\"    },    \"roomId\" : \"01n576bcf7daabcd\",    \"status\" : \"Book\"  }, {    \"total\" : {      \"amountAfterTax\" : 340.6,      \"currencyCode\" : \"CHF\"    },    \"cancelPenalties\" : \"Attention: Prepaid rate category. Booking policies differ from general hotel policy! Cancellation: Please note, if cancelled or modified, the total price of the non-refundable rate of the reservation will be charged on the credit card! Non refundable deposit of 100% of the full stay including tax is required at the time of booking.\",    \"resGuestRphs\" : [ 1 ],    \"ratePlanId\" : \"01n576bcf7dadcba\",    \"rates\" : [ {      \"date\" : \"2015-12-02\",      \"amountAfterTax\" : 170.3,      \"currencyCode\" : \"CHF\"    }, {      \"date\" : \"2015-12-03\",      \"amountAfterTax\" : 170.3,      \"currencyCode\" : \"CHF\"    } ],    \"guestCounts\" : [ {      \"count\" : 2,      \"ageQualifyingCode\" : 10    }, {      \"count\" : 2,      \"ageQualifyingCode\" : 10    } ],    \"timeSpan\" : {      \"start\" : \"2015-12-02\",      \"end\" : \"2015-12-04\"    },    \"roomId\" : \"01n576bcf7daabcd\",    \"status\" : \"Book\"  } ],  \"resGlobalInfo\" : {    \"total\" : {      \"amountAfterTax\" : 340.6,      \"currencyCode\" : \"CHF\"    },    \"comments\" : [ \"We will arrive after 20h. If possible we would prefer a room in the upper floors.\", \"We will arrive after 20h. If possible we would prefer a room in the upper floors.\" ],    \"profiles\" : [ \"\", \"\" ],    \"guarantee\" : {      \"paymentCard\" : {        \"cardHolderName\" : \"Mr. John Doe\",        \"cardCode\" : \"AX\",        \"expireDate\" : \"01/18\",        \"cardNumber\" : \"xxxx xxxx xxxx 1110\"      }    },    \"timeSpan\" : {      \"start\" : \"2015-12-02\",      \"end\" : \"2015-12-04\"    },    \"guestCounts\" : [ {      \"count\" : 2,      \"ageQualifyingCode\" : 10    }, {      \"count\" : 2,      \"ageQualifyingCode\" : 10    } ]  },  \"hotelReservationId\" : \"01n576bcf7dadccb\",  \"resGuests\" : [ \"\", \"\" ],  \"status\" : \"Book\",  \"createDateTime\" : \"2015-09-08T13:11:31.2567097+00:00\"}", Reservation.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Reservation>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Reservation>(HttpStatus.NOT_IMPLEMENTED);
    }

}

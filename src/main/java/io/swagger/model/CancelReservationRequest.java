package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CancelReservationRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class CancelReservationRequest   {
  @JsonProperty("reservationId")
  private String reservationId = null;

  @JsonProperty("reservationEmail")
  private String reservationEmail = null;

  public CancelReservationRequest reservationId(String reservationId) {
    this.reservationId = reservationId;
    return this;
  }

  /**
   * Get reservationId
   * @return reservationId
  **/
  @ApiModelProperty(example = "02a59ad0678b5cd8", value = "")


  public String getReservationId() {
    return reservationId;
  }

  public void setReservationId(String reservationId) {
    this.reservationId = reservationId;
  }

  public CancelReservationRequest reservationEmail(String reservationEmail) {
    this.reservationEmail = reservationEmail;
    return this;
  }

  /**
   * Get reservationEmail
   * @return reservationEmail
  **/
  @ApiModelProperty(example = "john.doe@example.com", value = "")


  public String getReservationEmail() {
    return reservationEmail;
  }

  public void setReservationEmail(String reservationEmail) {
    this.reservationEmail = reservationEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelReservationRequest cancelReservationRequest = (CancelReservationRequest) o;
    return Objects.equals(this.reservationId, cancelReservationRequest.reservationId) &&
        Objects.equals(this.reservationEmail, cancelReservationRequest.reservationEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reservationId, reservationEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelReservationRequest {\n");
    
    sb.append("    reservationId: ").append(toIndentedString(reservationId)).append("\n");
    sb.append("    reservationEmail: ").append(toIndentedString(reservationEmail)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


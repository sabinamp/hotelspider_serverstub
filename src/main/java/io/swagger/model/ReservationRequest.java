package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Profile;
import io.swagger.model.RoomStay;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReservationRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class ReservationRequest   {
  @JsonProperty("sessionId")
  private String sessionId = null;

  @JsonProperty("roomStays")
  @Valid
  private List<RoomStay> roomStays = null;

  @JsonProperty("guestInfo")
  private Profile guestInfo = null;

  @JsonProperty("paymentCard")
  private Object paymentCard = null;

  public ReservationRequest sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * Get sessionId
   * @return sessionId
  **/
  @ApiModelProperty(example = "02b5a5f00415ca61", value = "")


  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public ReservationRequest roomStays(List<RoomStay> roomStays) {
    this.roomStays = roomStays;
    return this;
  }

  public ReservationRequest addRoomStaysItem(RoomStay roomStaysItem) {
    if (this.roomStays == null) {
      this.roomStays = new ArrayList<RoomStay>();
    }
    this.roomStays.add(roomStaysItem);
    return this;
  }

  /**
   * Get roomStays
   * @return roomStays
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RoomStay> getRoomStays() {
    return roomStays;
  }

  public void setRoomStays(List<RoomStay> roomStays) {
    this.roomStays = roomStays;
  }

  public ReservationRequest guestInfo(Profile guestInfo) {
    this.guestInfo = guestInfo;
    return this;
  }

  /**
   * Get guestInfo
   * @return guestInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Profile getGuestInfo() {
    return guestInfo;
  }

  public void setGuestInfo(Profile guestInfo) {
    this.guestInfo = guestInfo;
  }

  public ReservationRequest paymentCard(Object paymentCard) {
    this.paymentCard = paymentCard;
    return this;
  }

  /**
   * Get paymentCard
   * @return paymentCard
  **/
  @ApiModelProperty(value = "")


  public Object getPaymentCard() {
    return paymentCard;
  }

  public void setPaymentCard(Object paymentCard) {
    this.paymentCard = paymentCard;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservationRequest reservationRequest = (ReservationRequest) o;
    return Objects.equals(this.sessionId, reservationRequest.sessionId) &&
        Objects.equals(this.roomStays, reservationRequest.roomStays) &&
        Objects.equals(this.guestInfo, reservationRequest.guestInfo) &&
        Objects.equals(this.paymentCard, reservationRequest.paymentCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, roomStays, guestInfo, paymentCard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationRequest {\n");
    
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    roomStays: ").append(toIndentedString(roomStays)).append("\n");
    sb.append("    guestInfo: ").append(toIndentedString(guestInfo)).append("\n");
    sb.append("    paymentCard: ").append(toIndentedString(paymentCard)).append("\n");
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


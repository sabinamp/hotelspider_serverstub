package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ReservationResGlobalInfo;
import io.swagger.model.ReservationResGuest;
import io.swagger.model.ReservationRoomStay;
import io.swagger.model.ReservationStatus;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Reservation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class Reservation   {
  @JsonProperty("hotelReservationId")
  private String hotelReservationId = null;

  @JsonProperty("status")
  private ReservationStatus status = null;

  @JsonProperty("createDateTime")
  private String createDateTime = null;

  @JsonProperty("lastModifyDateTime")
  private String lastModifyDateTime = null;

  @JsonProperty("roomStays")
  @Valid
  private List<ReservationRoomStay> roomStays = null;

  @JsonProperty("resGuests")
  @Valid
  private List<ReservationResGuest> resGuests = null;

  @JsonProperty("resGlobalInfo")
  private ReservationResGlobalInfo resGlobalInfo = null;

  public Reservation hotelReservationId(String hotelReservationId) {
    this.hotelReservationId = hotelReservationId;
    return this;
  }

  /**
   * Get hotelReservationId
   * @return hotelReservationId
  **/
  @ApiModelProperty(example = "01n576bcf7dadccb", value = "")


  public String getHotelReservationId() {
    return hotelReservationId;
  }

  public void setHotelReservationId(String hotelReservationId) {
    this.hotelReservationId = hotelReservationId;
  }

  public Reservation status(ReservationStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ReservationStatus getStatus() {
    return status;
  }

  public void setStatus(ReservationStatus status) {
    this.status = status;
  }

  public Reservation createDateTime(String createDateTime) {
    this.createDateTime = createDateTime;
    return this;
  }

  /**
   * Get createDateTime
   * @return createDateTime
  **/
  @ApiModelProperty(example = "2015-09-08T13:11:31.2567097+00:00", value = "")


  public String getCreateDateTime() {
    return createDateTime;
  }

  public void setCreateDateTime(String createDateTime) {
    this.createDateTime = createDateTime;
  }

  public Reservation lastModifyDateTime(String lastModifyDateTime) {
    this.lastModifyDateTime = lastModifyDateTime;
    return this;
  }

  /**
   * Get lastModifyDateTime
   * @return lastModifyDateTime
  **/
  @ApiModelProperty(example = "2015-09-08T13:11:31.2567097+00:00", value = "")


  public String getLastModifyDateTime() {
    return lastModifyDateTime;
  }

  public void setLastModifyDateTime(String lastModifyDateTime) {
    this.lastModifyDateTime = lastModifyDateTime;
  }

  public Reservation roomStays(List<ReservationRoomStay> roomStays) {
    this.roomStays = roomStays;
    return this;
  }

  public Reservation addRoomStaysItem(ReservationRoomStay roomStaysItem) {
    if (this.roomStays == null) {
      this.roomStays = new ArrayList<ReservationRoomStay>();
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

  public List<ReservationRoomStay> getRoomStays() {
    return roomStays;
  }

  public void setRoomStays(List<ReservationRoomStay> roomStays) {
    this.roomStays = roomStays;
  }

  public Reservation resGuests(List<ReservationResGuest> resGuests) {
    this.resGuests = resGuests;
    return this;
  }

  public Reservation addResGuestsItem(ReservationResGuest resGuestsItem) {
    if (this.resGuests == null) {
      this.resGuests = new ArrayList<ReservationResGuest>();
    }
    this.resGuests.add(resGuestsItem);
    return this;
  }

  /**
   * Get resGuests
   * @return resGuests
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ReservationResGuest> getResGuests() {
    return resGuests;
  }

  public void setResGuests(List<ReservationResGuest> resGuests) {
    this.resGuests = resGuests;
  }

  public Reservation resGlobalInfo(ReservationResGlobalInfo resGlobalInfo) {
    this.resGlobalInfo = resGlobalInfo;
    return this;
  }

  /**
   * Get resGlobalInfo
   * @return resGlobalInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ReservationResGlobalInfo getResGlobalInfo() {
    return resGlobalInfo;
  }

  public void setResGlobalInfo(ReservationResGlobalInfo resGlobalInfo) {
    this.resGlobalInfo = resGlobalInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reservation reservation = (Reservation) o;
    return Objects.equals(this.hotelReservationId, reservation.hotelReservationId) &&
        Objects.equals(this.status, reservation.status) &&
        Objects.equals(this.createDateTime, reservation.createDateTime) &&
        Objects.equals(this.lastModifyDateTime, reservation.lastModifyDateTime) &&
        Objects.equals(this.roomStays, reservation.roomStays) &&
        Objects.equals(this.resGuests, reservation.resGuests) &&
        Objects.equals(this.resGlobalInfo, reservation.resGlobalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hotelReservationId, status, createDateTime, lastModifyDateTime, roomStays, resGuests, resGlobalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reservation {\n");
    
    sb.append("    hotelReservationId: ").append(toIndentedString(hotelReservationId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createDateTime: ").append(toIndentedString(createDateTime)).append("\n");
    sb.append("    lastModifyDateTime: ").append(toIndentedString(lastModifyDateTime)).append("\n");
    sb.append("    roomStays: ").append(toIndentedString(roomStays)).append("\n");
    sb.append("    resGuests: ").append(toIndentedString(resGuests)).append("\n");
    sb.append("    resGlobalInfo: ").append(toIndentedString(resGlobalInfo)).append("\n");
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


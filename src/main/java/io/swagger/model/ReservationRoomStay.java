package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.GuestCount;
import io.swagger.model.ReservationStatus;
import io.swagger.model.RoomRate;
import io.swagger.model.TimeSpan;
import io.swagger.model.Total;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReservationRoomStay
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class ReservationRoomStay   {
  @JsonProperty("status")
  private ReservationStatus status = null;

  @JsonProperty("roomId")
  private String roomId = null;

  @JsonProperty("ratePlanId")
  private String ratePlanId = null;

  @JsonProperty("rates")
  @Valid
  private List<RoomRate> rates = null;

  @JsonProperty("guestCounts")
  @Valid
  private List<GuestCount> guestCounts = null;

  @JsonProperty("timeSpan")
  private TimeSpan timeSpan = null;

  @JsonProperty("total")
  private Total total = null;

  @JsonProperty("cancelPenalties")
  private String cancelPenalties = null;

  @JsonProperty("resGuestRphs")
  @Valid
  private List<Integer> resGuestRphs = null;

  public ReservationRoomStay status(ReservationStatus status) {
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

  public ReservationRoomStay roomId(String roomId) {
    this.roomId = roomId;
    return this;
  }

  /**
   * Get roomId
   * @return roomId
  **/
  @ApiModelProperty(example = "01n576bcf7daabcd", value = "")


  public String getRoomId() {
    return roomId;
  }

  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }

  public ReservationRoomStay ratePlanId(String ratePlanId) {
    this.ratePlanId = ratePlanId;
    return this;
  }

  /**
   * Get ratePlanId
   * @return ratePlanId
  **/
  @ApiModelProperty(example = "01n576bcf7dadcba", value = "")


  public String getRatePlanId() {
    return ratePlanId;
  }

  public void setRatePlanId(String ratePlanId) {
    this.ratePlanId = ratePlanId;
  }

  public ReservationRoomStay rates(List<RoomRate> rates) {
    this.rates = rates;
    return this;
  }

  public ReservationRoomStay addRatesItem(RoomRate ratesItem) {
    if (this.rates == null) {
      this.rates = new ArrayList<RoomRate>();
    }
    this.rates.add(ratesItem);
    return this;
  }

  /**
   * Get rates
   * @return rates
  **/
  @ApiModelProperty(example = "[{\"date\":\"2015-12-02\",\"amountAfterTax\":170.3,\"currencyCode\":\"CHF\"},{\"date\":\"2015-12-03\",\"amountAfterTax\":170.3,\"currencyCode\":\"CHF\"}]", value = "")

  @Valid

  public List<RoomRate> getRates() {
    return rates;
  }

  public void setRates(List<RoomRate> rates) {
    this.rates = rates;
  }

  public ReservationRoomStay guestCounts(List<GuestCount> guestCounts) {
    this.guestCounts = guestCounts;
    return this;
  }

  public ReservationRoomStay addGuestCountsItem(GuestCount guestCountsItem) {
    if (this.guestCounts == null) {
      this.guestCounts = new ArrayList<GuestCount>();
    }
    this.guestCounts.add(guestCountsItem);
    return this;
  }

  /**
   * Get guestCounts
   * @return guestCounts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<GuestCount> getGuestCounts() {
    return guestCounts;
  }

  public void setGuestCounts(List<GuestCount> guestCounts) {
    this.guestCounts = guestCounts;
  }

  public ReservationRoomStay timeSpan(TimeSpan timeSpan) {
    this.timeSpan = timeSpan;
    return this;
  }

  /**
   * Get timeSpan
   * @return timeSpan
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TimeSpan getTimeSpan() {
    return timeSpan;
  }

  public void setTimeSpan(TimeSpan timeSpan) {
    this.timeSpan = timeSpan;
  }

  public ReservationRoomStay total(Total total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Total getTotal() {
    return total;
  }

  public void setTotal(Total total) {
    this.total = total;
  }

  public ReservationRoomStay cancelPenalties(String cancelPenalties) {
    this.cancelPenalties = cancelPenalties;
    return this;
  }

  /**
   * Get cancelPenalties
   * @return cancelPenalties
  **/
  @ApiModelProperty(value = "")


  public String getCancelPenalties() {
    return cancelPenalties;
  }

  public void setCancelPenalties(String cancelPenalties) {
    this.cancelPenalties = cancelPenalties;
  }

  public ReservationRoomStay resGuestRphs(List<Integer> resGuestRphs) {
    this.resGuestRphs = resGuestRphs;
    return this;
  }

  public ReservationRoomStay addResGuestRphsItem(Integer resGuestRphsItem) {
    if (this.resGuestRphs == null) {
      this.resGuestRphs = new ArrayList<Integer>();
    }
    this.resGuestRphs.add(resGuestRphsItem);
    return this;
  }

  /**
   * Get resGuestRphs
   * @return resGuestRphs
  **/
  @ApiModelProperty(example = "[1]", value = "")


  public List<Integer> getResGuestRphs() {
    return resGuestRphs;
  }

  public void setResGuestRphs(List<Integer> resGuestRphs) {
    this.resGuestRphs = resGuestRphs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservationRoomStay reservationRoomStay = (ReservationRoomStay) o;
    return Objects.equals(this.status, reservationRoomStay.status) &&
        Objects.equals(this.roomId, reservationRoomStay.roomId) &&
        Objects.equals(this.ratePlanId, reservationRoomStay.ratePlanId) &&
        Objects.equals(this.rates, reservationRoomStay.rates) &&
        Objects.equals(this.guestCounts, reservationRoomStay.guestCounts) &&
        Objects.equals(this.timeSpan, reservationRoomStay.timeSpan) &&
        Objects.equals(this.total, reservationRoomStay.total) &&
        Objects.equals(this.cancelPenalties, reservationRoomStay.cancelPenalties) &&
        Objects.equals(this.resGuestRphs, reservationRoomStay.resGuestRphs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, roomId, ratePlanId, rates, guestCounts, timeSpan, total, cancelPenalties, resGuestRphs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationRoomStay {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    ratePlanId: ").append(toIndentedString(ratePlanId)).append("\n");
    sb.append("    rates: ").append(toIndentedString(rates)).append("\n");
    sb.append("    guestCounts: ").append(toIndentedString(guestCounts)).append("\n");
    sb.append("    timeSpan: ").append(toIndentedString(timeSpan)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    cancelPenalties: ").append(toIndentedString(cancelPenalties)).append("\n");
    sb.append("    resGuestRphs: ").append(toIndentedString(resGuestRphs)).append("\n");
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


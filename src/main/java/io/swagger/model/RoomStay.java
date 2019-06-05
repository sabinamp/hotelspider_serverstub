package io.swagger.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * RoomStay
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class RoomStay   {
  @JsonProperty("guestRoomId")
  private String guestRoomId = null;

  @JsonProperty("rateplanId")
  private String rateplanId = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("nbAdults")
  private Integer nbAdults = null;

  @JsonProperty("nbChildren")
  private Integer nbChildren = null;

  @JsonProperty("nbInfants")
  private Integer nbInfants = null;

  @JsonProperty("totalPrice")
  private Float totalPrice = null;

  @JsonProperty("totalDiscount")
  private Float totalDiscount = null;

  @JsonProperty("services")
  @Valid
  private List<BasicService> services = null;

  public RoomStay guestRoomId(String guestRoomId) {
    this.guestRoomId = guestRoomId;
    return this;
  }

  /**
   * ID of the selected room type
   * @return guestRoomId
  **/
  @ApiModelProperty(example = "01W5833ffc2d3d32", value = "ID of the selected room type")


  public String getGuestRoomId() {
    return guestRoomId;
  }

  public void setGuestRoomId(String guestRoomId) {
    this.guestRoomId = guestRoomId;
  }

  public RoomStay rateplanId(String rateplanId) {
    this.rateplanId = rateplanId;
    return this;
  }

  /**
   * ID of the selected rate plan
   * @return rateplanId
  **/
  @ApiModelProperty(example = "01W5834016075d33", value = "ID of the selected rate plan")


  public String getRateplanId() {
    return rateplanId;
  }

  public void setRateplanId(String rateplanId) {
    this.rateplanId = rateplanId;
  }

  public RoomStay startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date of the stay (date of arrival)
   * @return startDate
  **/
  @ApiModelProperty(example = "2018-06-16", value = "Start date of the stay (date of arrival)")

  @Valid

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public RoomStay endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date of the stay (date of departure)
   * @return endDate
  **/
  @ApiModelProperty(example = "2018-06-18", value = "End date of the stay (date of departure)")

  @Valid

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public RoomStay nbAdults(Integer nbAdults) {
    this.nbAdults = nbAdults;
    return this;
  }

  /**
   * Number of adults for the stay
   * @return nbAdults
  **/
  @ApiModelProperty(example = "2", value = "Number of adults for the stay")


  public Integer getNbAdults() {
    return nbAdults;
  }

  public void setNbAdults(Integer nbAdults) {
    this.nbAdults = nbAdults;
  }

  public RoomStay nbChildren(Integer nbChildren) {
    this.nbChildren = nbChildren;
    return this;
  }

  /**
   * Number of children for the stay
   * @return nbChildren
  **/
  @ApiModelProperty(example = "1", value = "Number of children for the stay")


  public Integer getNbChildren() {
    return nbChildren;
  }

  public void setNbChildren(Integer nbChildren) {
    this.nbChildren = nbChildren;
  }

  public RoomStay nbInfants(Integer nbInfants) {
    this.nbInfants = nbInfants;
    return this;
  }

  /**
   * Number of infants for the stay
   * @return nbInfants
  **/
  @ApiModelProperty(example = "0", value = "Number of infants for the stay")


  public Integer getNbInfants() {
    return nbInfants;
  }

  public void setNbInfants(Integer nbInfants) {
    this.nbInfants = nbInfants;
  }

  public RoomStay totalPrice(Float totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

  /**
   * Total price for the stay
   * @return totalPrice
  **/
  @ApiModelProperty(example = "330.0", value = "Total price for the stay")


  public Float getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Float totalPrice) {
    this.totalPrice = totalPrice;
  }

  public RoomStay totalDiscount(Float totalDiscount) {
    this.totalDiscount = totalDiscount;
    return this;
  }

  /**
   * Total of the discounts on the stay
   * @return totalDiscount
  **/
  @ApiModelProperty(example = "22.2", value = "Total of the discounts on the stay")


  public Float getTotalDiscount() {
    return totalDiscount;
  }

  public void setTotalDiscount(Float totalDiscount) {
    this.totalDiscount = totalDiscount;
  }

  public RoomStay services(List<BasicService> services) {
    this.services = services;
    return this;
  }

  public RoomStay addServicesItem(BasicService servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<BasicService>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * Get services
   * @return services
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<BasicService> getServices() {
    return services;
  }

  public void setServices(List<BasicService> services) {
    this.services = services;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomStay roomStay = (RoomStay) o;
    return Objects.equals(this.guestRoomId, roomStay.guestRoomId) &&
        Objects.equals(this.rateplanId, roomStay.rateplanId) &&
        Objects.equals(this.startDate, roomStay.startDate) &&
        Objects.equals(this.endDate, roomStay.endDate) &&
        Objects.equals(this.nbAdults, roomStay.nbAdults) &&
        Objects.equals(this.nbChildren, roomStay.nbChildren) &&
        Objects.equals(this.nbInfants, roomStay.nbInfants) &&
        Objects.equals(this.totalPrice, roomStay.totalPrice) &&
        Objects.equals(this.totalDiscount, roomStay.totalDiscount) &&
        Objects.equals(this.services, roomStay.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guestRoomId, rateplanId, startDate, endDate, nbAdults, nbChildren, nbInfants, totalPrice, totalDiscount, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomStay {\n");
    
    sb.append("    guestRoomId: ").append(toIndentedString(guestRoomId)).append("\n");
    sb.append("    rateplanId: ").append(toIndentedString(rateplanId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    nbAdults: ").append(toIndentedString(nbAdults)).append("\n");
    sb.append("    nbChildren: ").append(toIndentedString(nbChildren)).append("\n");
    sb.append("    nbInfants: ").append(toIndentedString(nbInfants)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    totalDiscount: ").append(toIndentedString(totalDiscount)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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


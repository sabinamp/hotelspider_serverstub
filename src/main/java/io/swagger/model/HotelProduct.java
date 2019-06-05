package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HotelProductRatePlans;
import io.swagger.model.HotelProductRoomTypes;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HotelProduct
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class HotelProduct   {
  @JsonProperty("ID")
  private String ID = null;

  @JsonProperty("roomTypes")
  @Valid
  private List<HotelProductRoomTypes> roomTypes = null;

  @JsonProperty("ratePlans")
  @Valid
  private List<HotelProductRatePlans> ratePlans = null;

  public HotelProduct ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * Get ID
   * @return ID
  **/
  @ApiModelProperty(example = "01q578c8e62df61f", value = "")


  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public HotelProduct roomTypes(List<HotelProductRoomTypes> roomTypes) {
    this.roomTypes = roomTypes;
    return this;
  }

  public HotelProduct addRoomTypesItem(HotelProductRoomTypes roomTypesItem) {
    if (this.roomTypes == null) {
      this.roomTypes = new ArrayList<HotelProductRoomTypes>();
    }
    this.roomTypes.add(roomTypesItem);
    return this;
  }

  /**
   * Get roomTypes
   * @return roomTypes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<HotelProductRoomTypes> getRoomTypes() {
    return roomTypes;
  }

  public void setRoomTypes(List<HotelProductRoomTypes> roomTypes) {
    this.roomTypes = roomTypes;
  }

  public HotelProduct ratePlans(List<HotelProductRatePlans> ratePlans) {
    this.ratePlans = ratePlans;
    return this;
  }

  public HotelProduct addRatePlansItem(HotelProductRatePlans ratePlansItem) {
    if (this.ratePlans == null) {
      this.ratePlans = new ArrayList<HotelProductRatePlans>();
    }
    this.ratePlans.add(ratePlansItem);
    return this;
  }

  /**
   * Get ratePlans
   * @return ratePlans
  **/
  @ApiModelProperty(example = "[{\"ratePlanCode\":\"01q578c6dd5e1d4c\",\"ratePlanName\":\"Standard\",\"currencyCode\":\"CHF\",\"descriptions\":{\"texts\":[\"Rate plan description\"],\"images\":[\"http://images.example.com/00L55eee8ef46e5b.jpg\",\"http://images.example.com/00L55eee8ef46b7a.jpg\"]}},{\"ratePlanCode\":\"01q578c6dd5e1d5d\",\"ratePlanName\":\"Non-Refundable\",\"currencyCode\":\"CHF\",\"descriptions\":{}}]", value = "")

  @Valid

  public List<HotelProductRatePlans> getRatePlans() {
    return ratePlans;
  }

  public void setRatePlans(List<HotelProductRatePlans> ratePlans) {
    this.ratePlans = ratePlans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelProduct hotelProduct = (HotelProduct) o;
    return Objects.equals(this.ID, hotelProduct.ID) &&
        Objects.equals(this.roomTypes, hotelProduct.roomTypes) &&
        Objects.equals(this.ratePlans, hotelProduct.ratePlans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, roomTypes, ratePlans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelProduct {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    roomTypes: ").append(toIndentedString(roomTypes)).append("\n");
    sb.append("    ratePlans: ").append(toIndentedString(ratePlans)).append("\n");
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


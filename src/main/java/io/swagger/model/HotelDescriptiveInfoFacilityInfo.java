package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.GuestRoom;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Provides information pertaining to the hotel facility itself. Describes the facilities provided at the hotel, including meeting rooms and restaurants.
 */
@ApiModel(description = "Provides information pertaining to the hotel facility itself. Describes the facilities provided at the hotel, including meeting rooms and restaurants.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class HotelDescriptiveInfoFacilityInfo   {
  @JsonProperty("guestRooms")
  @Valid
  private List<GuestRoom> guestRooms = null;

  public HotelDescriptiveInfoFacilityInfo guestRooms(List<GuestRoom> guestRooms) {
    this.guestRooms = guestRooms;
    return this;
  }

  public HotelDescriptiveInfoFacilityInfo addGuestRoomsItem(GuestRoom guestRoomsItem) {
    if (this.guestRooms == null) {
      this.guestRooms = new ArrayList<GuestRoom>();
    }
    this.guestRooms.add(guestRoomsItem);
    return this;
  }

  /**
   * Get guestRooms
   * @return guestRooms
  **/
  @ApiModelProperty(example = "[{\"id\":\"00U5846e022f2911\",\"roomTypeName\":\"Junior Suite\",\"minOccupancy\":1,\"maxOccupancy\":2,\"maxChildOccupancy\":1,\"maxAdultOccupancy\":2,\"typeRoom\":{\"standardOccupancy\":1,\"standardNumBeds\":1,\"maxCribs\":1,\"maxRollaways\":0,\"composite\":false,\"quantity\":26},\"amenities\":[{\"roomAmenityCode\":2,\"codeDetails\":\"Air conditioning\"},{\"roomAmenityCode\":55,\"codeDetails\":\"Iron\"}],\"multimediaDescriptions\":{\"images\":[{\"imageId\":\"00U5846e022f2915\",\"imageUrl\":\"http://images.example.com/00U5846e022f2915.jpg\",\"imageWidth\":1920,\"imageHeight\":1080,\"dimensionCategory\":\"Desktop\"},{\"imageId\":\"00U5846e022e4567\",\"imageUrl\":\"http://images.example.com/00U5846e022e4567.jpg\",\"imageWidth\":720,\"imageHeight\":480,\"dimensionCategory\":\"Mobile\"},{\"imageId\":\"00U5846e022f2916\",\"imageUrl\":\"http://images.example.com/00U5846e022f2916.jpg\",\"imageWidth\":1920,\"imageHeight\":1080,\"dimensionCategory\":\"Desktop\"}]}},{\"id\":\"00U5846e022f2912\",\"roomTypeName\":\"Double deluxe\",\"minOccupancy\":1,\"maxOccupancy\":3,\"maxChildOccupancy\":2,\"maxAdultOccupancy\":3,\"typeRoom\":{\"standardOccupancy\":2,\"standardNumBeds\":1,\"maxCribs\":1,\"maxRollaways\":0,\"composite\":false,\"quantity\":14}}]", value = "")

  @Valid

  public List<GuestRoom> getGuestRooms() {
    return guestRooms;
  }

  public void setGuestRooms(List<GuestRoom> guestRooms) {
    this.guestRooms = guestRooms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelDescriptiveInfoFacilityInfo hotelDescriptiveInfoFacilityInfo = (HotelDescriptiveInfoFacilityInfo) o;
    return Objects.equals(this.guestRooms, hotelDescriptiveInfoFacilityInfo.guestRooms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guestRooms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelDescriptiveInfoFacilityInfo {\n");
    
    sb.append("    guestRooms: ").append(toIndentedString(guestRooms)).append("\n");
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


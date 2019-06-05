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
 * HotelProductRoomTypes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class HotelProductRoomTypes   {
  @JsonProperty("roomTypeCode")
  private String roomTypeCode = null;

  public HotelProductRoomTypes roomTypeCode(String roomTypeCode) {
    this.roomTypeCode = roomTypeCode;
    return this;
  }

  /**
   * Get roomTypeCode
   * @return roomTypeCode
  **/
  @ApiModelProperty(example = "01q578c6e6bdf51d", value = "")


  public String getRoomTypeCode() {
    return roomTypeCode;
  }

  public void setRoomTypeCode(String roomTypeCode) {
    this.roomTypeCode = roomTypeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelProductRoomTypes hotelProductRoomTypes = (HotelProductRoomTypes) o;
    return Objects.equals(this.roomTypeCode, hotelProductRoomTypes.roomTypeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomTypeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelProductRoomTypes {\n");
    
    sb.append("    roomTypeCode: ").append(toIndentedString(roomTypeCode)).append("\n");
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


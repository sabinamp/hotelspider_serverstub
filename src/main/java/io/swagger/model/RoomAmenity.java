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
 * Tangible room item(s) (e.g., newspaper) available to the guest.
 */
@ApiModel(description = "Tangible room item(s) (e.g., newspaper) available to the guest.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class RoomAmenity   {
  @JsonProperty("roomAmenityCode")
  private Integer roomAmenityCode = null;

  @JsonProperty("codeDetail")
  private String codeDetail = null;

  public RoomAmenity roomAmenityCode(Integer roomAmenityCode) {
    this.roomAmenityCode = roomAmenityCode;
    return this;
  }

  /**
   * Refer to OpenTravel Code List Room Amenity Type (RMA).
   * @return roomAmenityCode
  **/
  @ApiModelProperty(value = "Refer to OpenTravel Code List Room Amenity Type (RMA).")


  public Integer getRoomAmenityCode() {
    return roomAmenityCode;
  }

  public void setRoomAmenityCode(Integer roomAmenityCode) {
    this.roomAmenityCode = roomAmenityCode;
  }

  public RoomAmenity codeDetail(String codeDetail) {
    this.codeDetail = codeDetail;
    return this;
  }

  /**
   * May be used to give further detail on the code.
   * @return codeDetail
  **/
  @ApiModelProperty(value = "May be used to give further detail on the code.")


  public String getCodeDetail() {
    return codeDetail;
  }

  public void setCodeDetail(String codeDetail) {
    this.codeDetail = codeDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomAmenity roomAmenity = (RoomAmenity) o;
    return Objects.equals(this.roomAmenityCode, roomAmenity.roomAmenityCode) &&
        Objects.equals(this.codeDetail, roomAmenity.codeDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomAmenityCode, codeDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomAmenity {\n");
    
    sb.append("    roomAmenityCode: ").append(toIndentedString(roomAmenityCode)).append("\n");
    sb.append("    codeDetail: ").append(toIndentedString(codeDetail)).append("\n");
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


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MultimediaDescription;
import io.swagger.model.RoomAmenity;
import io.swagger.model.TypeRoom;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GuestRoom
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class GuestRoom   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("roomTypeName")
  private String roomTypeName = null;

  @JsonProperty("minOccupancy")
  private Integer minOccupancy = null;

  @JsonProperty("maxOccupancy")
  private Integer maxOccupancy = null;

  @JsonProperty("maxChildOccupancy")
  private Integer maxChildOccupancy = null;

  @JsonProperty("maxAdultOccupancy")
  private Integer maxAdultOccupancy = null;

  @JsonProperty("typeRoom")
  private TypeRoom typeRoom = null;

  @JsonProperty("amenities")
  @Valid
  private List<RoomAmenity> amenities = null;

  @JsonProperty("multimediaDescriptions")
  @Valid
  private List<MultimediaDescription> multimediaDescriptions = null;

  public GuestRoom id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GuestRoom roomTypeName(String roomTypeName) {
    this.roomTypeName = roomTypeName;
    return this;
  }

  /**
   * Get roomTypeName
   * @return roomTypeName
  **/
  @ApiModelProperty(value = "")


  public String getRoomTypeName() {
    return roomTypeName;
  }

  public void setRoomTypeName(String roomTypeName) {
    this.roomTypeName = roomTypeName;
  }

  public GuestRoom minOccupancy(Integer minOccupancy) {
    this.minOccupancy = minOccupancy;
    return this;
  }

  /**
   * Get minOccupancy
   * @return minOccupancy
  **/
  @ApiModelProperty(value = "")


  public Integer getMinOccupancy() {
    return minOccupancy;
  }

  public void setMinOccupancy(Integer minOccupancy) {
    this.minOccupancy = minOccupancy;
  }

  public GuestRoom maxOccupancy(Integer maxOccupancy) {
    this.maxOccupancy = maxOccupancy;
    return this;
  }

  /**
   * Get maxOccupancy
   * @return maxOccupancy
  **/
  @ApiModelProperty(value = "")


  public Integer getMaxOccupancy() {
    return maxOccupancy;
  }

  public void setMaxOccupancy(Integer maxOccupancy) {
    this.maxOccupancy = maxOccupancy;
  }

  public GuestRoom maxChildOccupancy(Integer maxChildOccupancy) {
    this.maxChildOccupancy = maxChildOccupancy;
    return this;
  }

  /**
   * Get maxChildOccupancy
   * @return maxChildOccupancy
  **/
  @ApiModelProperty(value = "")


  public Integer getMaxChildOccupancy() {
    return maxChildOccupancy;
  }

  public void setMaxChildOccupancy(Integer maxChildOccupancy) {
    this.maxChildOccupancy = maxChildOccupancy;
  }

  public GuestRoom maxAdultOccupancy(Integer maxAdultOccupancy) {
    this.maxAdultOccupancy = maxAdultOccupancy;
    return this;
  }

  /**
   * Get maxAdultOccupancy
   * @return maxAdultOccupancy
  **/
  @ApiModelProperty(value = "")


  public Integer getMaxAdultOccupancy() {
    return maxAdultOccupancy;
  }

  public void setMaxAdultOccupancy(Integer maxAdultOccupancy) {
    this.maxAdultOccupancy = maxAdultOccupancy;
  }

  public GuestRoom typeRoom(TypeRoom typeRoom) {
    this.typeRoom = typeRoom;
    return this;
  }

  /**
   * Get typeRoom
   * @return typeRoom
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TypeRoom getTypeRoom() {
    return typeRoom;
  }

  public void setTypeRoom(TypeRoom typeRoom) {
    this.typeRoom = typeRoom;
  }

  public GuestRoom amenities(List<RoomAmenity> amenities) {
    this.amenities = amenities;
    return this;
  }

  public GuestRoom addAmenitiesItem(RoomAmenity amenitiesItem) {
    if (this.amenities == null) {
      this.amenities = new ArrayList<RoomAmenity>();
    }
    this.amenities.add(amenitiesItem);
    return this;
  }

  /**
   * Get amenities
   * @return amenities
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RoomAmenity> getAmenities() {
    return amenities;
  }

  public void setAmenities(List<RoomAmenity> amenities) {
    this.amenities = amenities;
  }

  public GuestRoom multimediaDescriptions(List<MultimediaDescription> multimediaDescriptions) {
    this.multimediaDescriptions = multimediaDescriptions;
    return this;
  }

  public GuestRoom addMultimediaDescriptionsItem(MultimediaDescription multimediaDescriptionsItem) {
    if (this.multimediaDescriptions == null) {
      this.multimediaDescriptions = new ArrayList<MultimediaDescription>();
    }
    this.multimediaDescriptions.add(multimediaDescriptionsItem);
    return this;
  }

  /**
   * Get multimediaDescriptions
   * @return multimediaDescriptions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<MultimediaDescription> getMultimediaDescriptions() {
    return multimediaDescriptions;
  }

  public void setMultimediaDescriptions(List<MultimediaDescription> multimediaDescriptions) {
    this.multimediaDescriptions = multimediaDescriptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuestRoom guestRoom = (GuestRoom) o;
    return Objects.equals(this.id, guestRoom.id) &&
        Objects.equals(this.roomTypeName, guestRoom.roomTypeName) &&
        Objects.equals(this.minOccupancy, guestRoom.minOccupancy) &&
        Objects.equals(this.maxOccupancy, guestRoom.maxOccupancy) &&
        Objects.equals(this.maxChildOccupancy, guestRoom.maxChildOccupancy) &&
        Objects.equals(this.maxAdultOccupancy, guestRoom.maxAdultOccupancy) &&
        Objects.equals(this.typeRoom, guestRoom.typeRoom) &&
        Objects.equals(this.amenities, guestRoom.amenities) &&
        Objects.equals(this.multimediaDescriptions, guestRoom.multimediaDescriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, roomTypeName, minOccupancy, maxOccupancy, maxChildOccupancy, maxAdultOccupancy, typeRoom, amenities, multimediaDescriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuestRoom {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    roomTypeName: ").append(toIndentedString(roomTypeName)).append("\n");
    sb.append("    minOccupancy: ").append(toIndentedString(minOccupancy)).append("\n");
    sb.append("    maxOccupancy: ").append(toIndentedString(maxOccupancy)).append("\n");
    sb.append("    maxChildOccupancy: ").append(toIndentedString(maxChildOccupancy)).append("\n");
    sb.append("    maxAdultOccupancy: ").append(toIndentedString(maxAdultOccupancy)).append("\n");
    sb.append("    typeRoom: ").append(toIndentedString(typeRoom)).append("\n");
    sb.append("    amenities: ").append(toIndentedString(amenities)).append("\n");
    sb.append("    multimediaDescriptions: ").append(toIndentedString(multimediaDescriptions)).append("\n");
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


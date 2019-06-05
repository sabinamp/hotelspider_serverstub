package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HotelInfoPosition
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class HotelInfoPosition   {
  @JsonProperty("altitude")
  private BigDecimal altitude = null;

  @JsonProperty("latitude")
  private BigDecimal latitude = null;

  @JsonProperty("longitude")
  private BigDecimal longitude = null;

  public HotelInfoPosition altitude(BigDecimal altitude) {
    this.altitude = altitude;
    return this;
  }

  /**
   * Get altitude
   * @return altitude
  **/
  @ApiModelProperty(example = "150.0", value = "")

  @Valid

  public BigDecimal getAltitude() {
    return altitude;
  }

  public void setAltitude(BigDecimal altitude) {
    this.altitude = altitude;
  }

  public HotelInfoPosition latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(example = "47.444546", value = "")

  @Valid

  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public HotelInfoPosition longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(example = "4.161718", value = "")

  @Valid

  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelInfoPosition hotelInfoPosition = (HotelInfoPosition) o;
    return Objects.equals(this.altitude, hotelInfoPosition.altitude) &&
        Objects.equals(this.latitude, hotelInfoPosition.latitude) &&
        Objects.equals(this.longitude, hotelInfoPosition.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(altitude, latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelInfoPosition {\n");
    
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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


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
 * HotelConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class HotelConfig   {
  @JsonProperty("logoUrl")
  private String logoUrl = null;

  @JsonProperty("primaryColor")
  private String primaryColor = null;

  public HotelConfig logoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

  /**
   * Get logoUrl
   * @return logoUrl
  **/
  @ApiModelProperty(value = "")


  public String getLogoUrl() {
    return logoUrl;
  }

  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }

  public HotelConfig primaryColor(String primaryColor) {
    this.primaryColor = primaryColor;
    return this;
  }

  /**
   * Get primaryColor
   * @return primaryColor
  **/
  @ApiModelProperty(value = "")


  public String getPrimaryColor() {
    return primaryColor;
  }

  public void setPrimaryColor(String primaryColor) {
    this.primaryColor = primaryColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelConfig hotelConfig = (HotelConfig) o;
    return Objects.equals(this.logoUrl, hotelConfig.logoUrl) &&
        Objects.equals(this.primaryColor, hotelConfig.primaryColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logoUrl, primaryColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelConfig {\n");
    
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    primaryColor: ").append(toIndentedString(primaryColor)).append("\n");
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


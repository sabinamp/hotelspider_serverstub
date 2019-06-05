package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MultiDescription;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HotelProductRatePlans
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class HotelProductRatePlans   {
  @JsonProperty("ratePlanCode")
  private String ratePlanCode = null;

  @JsonProperty("ratePlanName")
  private String ratePlanName = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("descriptions")
  private MultiDescription descriptions = null;

  public HotelProductRatePlans ratePlanCode(String ratePlanCode) {
    this.ratePlanCode = ratePlanCode;
    return this;
  }

  /**
   * Get ratePlanCode
   * @return ratePlanCode
  **/
  @ApiModelProperty(value = "")


  public String getRatePlanCode() {
    return ratePlanCode;
  }

  public void setRatePlanCode(String ratePlanCode) {
    this.ratePlanCode = ratePlanCode;
  }

  public HotelProductRatePlans ratePlanName(String ratePlanName) {
    this.ratePlanName = ratePlanName;
    return this;
  }

  /**
   * Get ratePlanName
   * @return ratePlanName
  **/
  @ApiModelProperty(value = "")


  public String getRatePlanName() {
    return ratePlanName;
  }

  public void setRatePlanName(String ratePlanName) {
    this.ratePlanName = ratePlanName;
  }

  public HotelProductRatePlans currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(value = "")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public HotelProductRatePlans descriptions(MultiDescription descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  /**
   * Get descriptions
   * @return descriptions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MultiDescription getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(MultiDescription descriptions) {
    this.descriptions = descriptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelProductRatePlans hotelProductRatePlans = (HotelProductRatePlans) o;
    return Objects.equals(this.ratePlanCode, hotelProductRatePlans.ratePlanCode) &&
        Objects.equals(this.ratePlanName, hotelProductRatePlans.ratePlanName) &&
        Objects.equals(this.currencyCode, hotelProductRatePlans.currencyCode) &&
        Objects.equals(this.descriptions, hotelProductRatePlans.descriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratePlanCode, ratePlanName, currencyCode, descriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelProductRatePlans {\n");
    
    sb.append("    ratePlanCode: ").append(toIndentedString(ratePlanCode)).append("\n");
    sb.append("    ratePlanName: ").append(toIndentedString(ratePlanName)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
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


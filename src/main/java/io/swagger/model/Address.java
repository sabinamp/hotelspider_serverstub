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
 * Address
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class Address   {
  @JsonProperty("streetNmbr")
  private Integer streetNmbr = null;

  @JsonProperty("addressLine")
  private String addressLine = null;

  @JsonProperty("cityName")
  private String cityName = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  @JsonProperty("stateProv")
  private String stateProv = null;

  @JsonProperty("countryName")
  private String countryName = null;

  public Address streetNmbr(Integer streetNmbr) {
    this.streetNmbr = streetNmbr;
    return this;
  }

  /**
   * Get streetNmbr
   * @return streetNmbr
  **/
  @ApiModelProperty(example = "43", value = "")


  public Integer getStreetNmbr() {
    return streetNmbr;
  }

  public void setStreetNmbr(Integer streetNmbr) {
    this.streetNmbr = streetNmbr;
  }

  public Address addressLine(String addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  /**
   * Get addressLine
   * @return addressLine
  **/
  @ApiModelProperty(example = "Matterstrasse", value = "")


  public String getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(String addressLine) {
    this.addressLine = addressLine;
  }

  public Address cityName(String cityName) {
    this.cityName = cityName;
    return this;
  }

  /**
   * Get cityName
   * @return cityName
  **/
  @ApiModelProperty(example = "Zermatt", value = "")


  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(example = "3920", value = "")


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Address stateProv(String stateProv) {
    this.stateProv = stateProv;
    return this;
  }

  /**
   * Get stateProv
   * @return stateProv
  **/
  @ApiModelProperty(example = "Wallis", value = "")


  public String getStateProv() {
    return stateProv;
  }

  public void setStateProv(String stateProv) {
    this.stateProv = stateProv;
  }

  public Address countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

  /**
   * Get countryName
   * @return countryName
  **/
  @ApiModelProperty(example = "Schweiz", value = "")


  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.streetNmbr, address.streetNmbr) &&
        Objects.equals(this.addressLine, address.addressLine) &&
        Objects.equals(this.cityName, address.cityName) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.stateProv, address.stateProv) &&
        Objects.equals(this.countryName, address.countryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streetNmbr, addressLine, cityName, postalCode, stateProv, countryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    streetNmbr: ").append(toIndentedString(streetNmbr)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    stateProv: ").append(toIndentedString(stateProv)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
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


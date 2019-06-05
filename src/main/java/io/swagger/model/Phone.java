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
 * Phone
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class Phone   {
  @JsonProperty("phoneTechType")
  private Integer phoneTechType = null;

  @JsonProperty("countryAccessCode")
  private String countryAccessCode = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  public Phone phoneTechType(Integer phoneTechType) {
    this.phoneTechType = phoneTechType;
    return this;
  }

  /**
   * Get phoneTechType
   * @return phoneTechType
  **/
  @ApiModelProperty(example = "1", value = "")


  public Integer getPhoneTechType() {
    return phoneTechType;
  }

  public void setPhoneTechType(Integer phoneTechType) {
    this.phoneTechType = phoneTechType;
  }

  public Phone countryAccessCode(String countryAccessCode) {
    this.countryAccessCode = countryAccessCode;
    return this;
  }

  /**
   * Get countryAccessCode
   * @return countryAccessCode
  **/
  @ApiModelProperty(example = "41", value = "")


  public String getCountryAccessCode() {
    return countryAccessCode;
  }

  public void setCountryAccessCode(String countryAccessCode) {
    this.countryAccessCode = countryAccessCode;
  }

  public Phone phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "279556655", value = "")


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Phone phone = (Phone) o;
    return Objects.equals(this.phoneTechType, phone.phoneTechType) &&
        Objects.equals(this.countryAccessCode, phone.countryAccessCode) &&
        Objects.equals(this.phoneNumber, phone.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneTechType, countryAccessCode, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Phone {\n");
    
    sb.append("    phoneTechType: ").append(toIndentedString(phoneTechType)).append("\n");
    sb.append("    countryAccessCode: ").append(toIndentedString(countryAccessCode)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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


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
 * General policy information
 */
@ApiModel(description = "General policy information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class HotelDescriptiveInfoPoliciesPolicyInfo   {
  @JsonProperty("minChildAge")
  private Integer minChildAge = null;

  @JsonProperty("maxChildAge")
  private Integer maxChildAge = null;

  public HotelDescriptiveInfoPoliciesPolicyInfo minChildAge(Integer minChildAge) {
    this.minChildAge = minChildAge;
    return this;
  }

  /**
   * Get minChildAge
   * @return minChildAge
  **/
  @ApiModelProperty(example = "2", value = "")


  public Integer getMinChildAge() {
    return minChildAge;
  }

  public void setMinChildAge(Integer minChildAge) {
    this.minChildAge = minChildAge;
  }

  public HotelDescriptiveInfoPoliciesPolicyInfo maxChildAge(Integer maxChildAge) {
    this.maxChildAge = maxChildAge;
    return this;
  }

  /**
   * Get maxChildAge
   * @return maxChildAge
  **/
  @ApiModelProperty(example = "12", value = "")


  public Integer getMaxChildAge() {
    return maxChildAge;
  }

  public void setMaxChildAge(Integer maxChildAge) {
    this.maxChildAge = maxChildAge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelDescriptiveInfoPoliciesPolicyInfo hotelDescriptiveInfoPoliciesPolicyInfo = (HotelDescriptiveInfoPoliciesPolicyInfo) o;
    return Objects.equals(this.minChildAge, hotelDescriptiveInfoPoliciesPolicyInfo.minChildAge) &&
        Objects.equals(this.maxChildAge, hotelDescriptiveInfoPoliciesPolicyInfo.maxChildAge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minChildAge, maxChildAge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelDescriptiveInfoPoliciesPolicyInfo {\n");
    
    sb.append("    minChildAge: ").append(toIndentedString(minChildAge)).append("\n");
    sb.append("    maxChildAge: ").append(toIndentedString(maxChildAge)).append("\n");
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


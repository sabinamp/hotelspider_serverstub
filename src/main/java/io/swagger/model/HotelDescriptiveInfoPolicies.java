package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HotelDescriptiveInfoPoliciesPolicyInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Provides information about the hotel policies (payment, guarantees, etc.)
 */
@ApiModel(description = "Provides information about the hotel policies (payment, guarantees, etc.)")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class HotelDescriptiveInfoPolicies   {
  @JsonProperty("policyInfo")
  private HotelDescriptiveInfoPoliciesPolicyInfo policyInfo = null;

  public HotelDescriptiveInfoPolicies policyInfo(HotelDescriptiveInfoPoliciesPolicyInfo policyInfo) {
    this.policyInfo = policyInfo;
    return this;
  }

  /**
   * Get policyInfo
   * @return policyInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public HotelDescriptiveInfoPoliciesPolicyInfo getPolicyInfo() {
    return policyInfo;
  }

  public void setPolicyInfo(HotelDescriptiveInfoPoliciesPolicyInfo policyInfo) {
    this.policyInfo = policyInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelDescriptiveInfoPolicies hotelDescriptiveInfoPolicies = (HotelDescriptiveInfoPolicies) o;
    return Objects.equals(this.policyInfo, hotelDescriptiveInfoPolicies.policyInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelDescriptiveInfoPolicies {\n");
    
    sb.append("    policyInfo: ").append(toIndentedString(policyInfo)).append("\n");
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


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
 * Service
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class Service   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("codeDetails")
  private String codeDetails = null;

  public Service code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The code for a service or amenity. Refer to OpenTravel Code List Hotel Amenity Code (HAC).
   * @return code
  **/
  @ApiModelProperty(value = "The code for a service or amenity. Refer to OpenTravel Code List Hotel Amenity Code (HAC).")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Service codeDetails(String codeDetails) {
    this.codeDetails = codeDetails;
    return this;
  }

  /**
   * May be used to give further detail on the code. (Information about which list the code refers to)
   * @return codeDetails
  **/
  @ApiModelProperty(value = "May be used to give further detail on the code. (Information about which list the code refers to)")


  public String getCodeDetails() {
    return codeDetails;
  }

  public void setCodeDetails(String codeDetails) {
    this.codeDetails = codeDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.code, service.code) &&
        Objects.equals(this.codeDetails, service.codeDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, codeDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeDetails: ").append(toIndentedString(codeDetails)).append("\n");
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


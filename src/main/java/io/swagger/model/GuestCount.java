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
 * GuestCount
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class GuestCount   {
  @JsonProperty("ageQualifyingCode")
  private Integer ageQualifyingCode = null;

  @JsonProperty("count")
  private Integer count = null;

  public GuestCount ageQualifyingCode(Integer ageQualifyingCode) {
    this.ageQualifyingCode = ageQualifyingCode;
    return this;
  }

  /**
   * A code representing the age category: 10 (Adults), 8 (Children), 7 (Infants)
   * @return ageQualifyingCode
  **/
  @ApiModelProperty(example = "10", value = "A code representing the age category: 10 (Adults), 8 (Children), 7 (Infants)")


  public Integer getAgeQualifyingCode() {
    return ageQualifyingCode;
  }

  public void setAgeQualifyingCode(Integer ageQualifyingCode) {
    this.ageQualifyingCode = ageQualifyingCode;
  }

  public GuestCount count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(example = "2", value = "")


  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuestCount guestCount = (GuestCount) o;
    return Objects.equals(this.ageQualifyingCode, guestCount.ageQualifyingCode) &&
        Objects.equals(this.count, guestCount.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageQualifyingCode, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuestCount {\n");
    
    sb.append("    ageQualifyingCode: ").append(toIndentedString(ageQualifyingCode)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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


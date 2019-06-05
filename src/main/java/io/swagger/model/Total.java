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
 * Total
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class Total   {
  @JsonProperty("amountAfterTax")
  private Float amountAfterTax = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  public Total amountAfterTax(Float amountAfterTax) {
    this.amountAfterTax = amountAfterTax;
    return this;
  }

  /**
   * Get amountAfterTax
   * @return amountAfterTax
  **/
  @ApiModelProperty(example = "340.6", value = "")


  public Float getAmountAfterTax() {
    return amountAfterTax;
  }

  public void setAmountAfterTax(Float amountAfterTax) {
    this.amountAfterTax = amountAfterTax;
  }

  public Total currencyCode(String currencyCode) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Total total = (Total) o;
    return Objects.equals(this.amountAfterTax, total.amountAfterTax) &&
        Objects.equals(this.currencyCode, total.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountAfterTax, currencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Total {\n");
    
    sb.append("    amountAfterTax: ").append(toIndentedString(amountAfterTax)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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


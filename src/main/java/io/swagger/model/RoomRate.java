package io.swagger.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * RoomRate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class RoomRate   {
  @JsonProperty("date")
  private LocalDate date = null;

  @JsonProperty("amountAfterTax")
  private Float amountAfterTax = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  public RoomRate date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "2015-12-02", value = "")

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public RoomRate amountAfterTax(Float amountAfterTax) {
    this.amountAfterTax = amountAfterTax;
    return this;
  }

  /**
   * Get amountAfterTax
   * @return amountAfterTax
  **/
  @ApiModelProperty(example = "170.3", value = "")


  public Float getAmountAfterTax() {
    return amountAfterTax;
  }

  public void setAmountAfterTax(Float amountAfterTax) {
    this.amountAfterTax = amountAfterTax;
  }

  public RoomRate currencyCode(String currencyCode) {
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
    RoomRate roomRate = (RoomRate) o;
    return Objects.equals(this.date, roomRate.date) &&
        Objects.equals(this.amountAfterTax, roomRate.amountAfterTax) &&
        Objects.equals(this.currencyCode, roomRate.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, amountAfterTax, currencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomRate {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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


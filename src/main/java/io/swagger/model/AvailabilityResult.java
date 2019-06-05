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
 * AvailabilityResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class AvailabilityResult   {
  @JsonProperty("rateplanId")
  private String rateplanId = null;

  @JsonProperty("totalPrice")
  private Float totalPrice = null;

  @JsonProperty("discount")
  private Float discount = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("isBar")
  private Boolean isBar = null;

  @JsonProperty("availability")
  private Integer availability = null;

  @JsonProperty("limitedOffer")
  private Boolean limitedOffer = null;

  @JsonProperty("popularity")
  private Integer popularity = null;

  public AvailabilityResult rateplanId(String rateplanId) {
    this.rateplanId = rateplanId;
    return this;
  }

  /**
   * ID of the rate plan
   * @return rateplanId
  **/
  @ApiModelProperty(example = "01W58b92adc96446", value = "ID of the rate plan")


  public String getRateplanId() {
    return rateplanId;
  }

  public void setRateplanId(String rateplanId) {
    this.rateplanId = rateplanId;
  }

  public AvailabilityResult totalPrice(Float totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

  /**
   * Total price for the stay
   * @return totalPrice
  **/
  @ApiModelProperty(example = "330.0", value = "Total price for the stay")


  public Float getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Float totalPrice) {
    this.totalPrice = totalPrice;
  }

  public AvailabilityResult discount(Float discount) {
    this.discount = discount;
    return this;
  }

  /**
   * Discount amount offered on this product
   * @return discount
  **/
  @ApiModelProperty(example = "25.0", value = "Discount amount offered on this product")


  public Float getDiscount() {
    return discount;
  }

  public void setDiscount(Float discount) {
    this.discount = discount;
  }

  public AvailabilityResult currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public AvailabilityResult isBar(Boolean isBar) {
    this.isBar = isBar;
    return this;
  }

  /**
   * Whether this product is the Best Available Rate or not
   * @return isBar
  **/
  @ApiModelProperty(example = "false", value = "Whether this product is the Best Available Rate or not")


  public Boolean isIsBar() {
    return isBar;
  }

  public void setIsBar(Boolean isBar) {
    this.isBar = isBar;
  }

  public AvailabilityResult availability(Integer availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Number of rooms that are available through this rate
   * @return availability
  **/
  @ApiModelProperty(example = "12", value = "Number of rooms that are available through this rate")


  public Integer getAvailability() {
    return availability;
  }

  public void setAvailability(Integer availability) {
    this.availability = availability;
  }

  public AvailabilityResult limitedOffer(Boolean limitedOffer) {
    this.limitedOffer = limitedOffer;
    return this;
  }

  /**
   * Whether this product is a limited offer or not
   * @return limitedOffer
  **/
  @ApiModelProperty(example = "false", value = "Whether this product is a limited offer or not")


  public Boolean isLimitedOffer() {
    return limitedOffer;
  }

  public void setLimitedOffer(Boolean limitedOffer) {
    this.limitedOffer = limitedOffer;
  }

  public AvailabilityResult popularity(Integer popularity) {
    this.popularity = popularity;
    return this;
  }

  /**
   * The popularity of the current product compared to the others
   * minimum: 0
   * maximum: 100
   * @return popularity
  **/
  @ApiModelProperty(example = "64", value = "The popularity of the current product compared to the others")

@Min(0) @Max(100) 
  public Integer getPopularity() {
    return popularity;
  }

  public void setPopularity(Integer popularity) {
    this.popularity = popularity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailabilityResult availabilityResult = (AvailabilityResult) o;
    return Objects.equals(this.rateplanId, availabilityResult.rateplanId) &&
        Objects.equals(this.totalPrice, availabilityResult.totalPrice) &&
        Objects.equals(this.discount, availabilityResult.discount) &&
        Objects.equals(this.currency, availabilityResult.currency) &&
        Objects.equals(this.isBar, availabilityResult.isBar) &&
        Objects.equals(this.availability, availabilityResult.availability) &&
        Objects.equals(this.limitedOffer, availabilityResult.limitedOffer) &&
        Objects.equals(this.popularity, availabilityResult.popularity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateplanId, totalPrice, discount, currency, isBar, availability, limitedOffer, popularity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailabilityResult {\n");
    
    sb.append("    rateplanId: ").append(toIndentedString(rateplanId)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    isBar: ").append(toIndentedString(isBar)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    limitedOffer: ").append(toIndentedString(limitedOffer)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
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


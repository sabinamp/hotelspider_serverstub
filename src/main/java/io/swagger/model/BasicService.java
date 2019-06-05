package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BasicService
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class BasicService   {
  @JsonProperty("serviceId")
  private String serviceId = null;

  @JsonProperty("price")
  private Float price = null;

  @JsonProperty("discount")
  private Float discount = null;

  /**
   * The pricing type of the service
   */
  public enum PricingTypeEnum {
    STAY("Per stay"),
    
    PERSON("Per person"),
    
    NIGHT("Per night"),
    
    PERSON_PER_NIGHT("Per person per night"),
    
    USE("Per use");

    private String value;

    PricingTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PricingTypeEnum fromValue(String text) {
      for (PricingTypeEnum b : PricingTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("pricingType")
  private PricingTypeEnum pricingType = null;

  @JsonProperty("totalPrice")
  private Float totalPrice = null;

  @JsonProperty("totalDiscount")
  private Float totalDiscount = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("included")
  private Boolean included = null;

  public BasicService serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * ID of the service
   * @return serviceId
  **/
  @ApiModelProperty(example = "01W5834018479b73", value = "ID of the service")


  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public BasicService price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * Price of the service
   * @return price
  **/
  @ApiModelProperty(example = "25.0", value = "Price of the service")


  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public BasicService discount(Float discount) {
    this.discount = discount;
    return this;
  }

  /**
   * Discount amount offered on this service
   * @return discount
  **/
  @ApiModelProperty(example = "0.0", value = "Discount amount offered on this service")


  public Float getDiscount() {
    return discount;
  }

  public void setDiscount(Float discount) {
    this.discount = discount;
  }

  public BasicService pricingType(PricingTypeEnum pricingType) {
    this.pricingType = pricingType;
    return this;
  }

  /**
   * The pricing type of the service
   * @return pricingType
  **/
  @ApiModelProperty(example = "Per person per night", value = "The pricing type of the service")


  public PricingTypeEnum getPricingType() {
    return pricingType;
  }

  public void setPricingType(PricingTypeEnum pricingType) {
    this.pricingType = pricingType;
  }

  public BasicService totalPrice(Float totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

  /**
   * Total price for the service
   * @return totalPrice
  **/
  @ApiModelProperty(example = "25.0", value = "Total price for the service")


  public Float getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Float totalPrice) {
    this.totalPrice = totalPrice;
  }

  public BasicService totalDiscount(Float totalDiscount) {
    this.totalDiscount = totalDiscount;
    return this;
  }

  /**
   * Total discount amount offered on this service
   * @return totalDiscount
  **/
  @ApiModelProperty(example = "0.0", value = "Total discount amount offered on this service")


  public Float getTotalDiscount() {
    return totalDiscount;
  }

  public void setTotalDiscount(Float totalDiscount) {
    this.totalDiscount = totalDiscount;
  }

  public BasicService currency(String currency) {
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

  public BasicService included(Boolean included) {
    this.included = included;
    return this;
  }

  /**
   * Whether the service price is included in the roomstay price or not
   * @return included
  **/
  @ApiModelProperty(value = "Whether the service price is included in the roomstay price or not")


  public Boolean isIncluded() {
    return included;
  }

  public void setIncluded(Boolean included) {
    this.included = included;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicService basicService = (BasicService) o;
    return Objects.equals(this.serviceId, basicService.serviceId) &&
        Objects.equals(this.price, basicService.price) &&
        Objects.equals(this.discount, basicService.discount) &&
        Objects.equals(this.pricingType, basicService.pricingType) &&
        Objects.equals(this.totalPrice, basicService.totalPrice) &&
        Objects.equals(this.totalDiscount, basicService.totalDiscount) &&
        Objects.equals(this.currency, basicService.currency) &&
        Objects.equals(this.included, basicService.included);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceId, price, discount, pricingType, totalPrice, totalDiscount, currency, included);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicService {\n");
    
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    pricingType: ").append(toIndentedString(pricingType)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    totalDiscount: ").append(toIndentedString(totalDiscount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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


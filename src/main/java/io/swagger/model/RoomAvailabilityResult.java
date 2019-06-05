package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AvailabilityResult;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RoomAvailabilityResult
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class RoomAvailabilityResult   {
  @JsonProperty("guestroomId")
  private String guestroomId = null;

  @JsonProperty("products")
  @Valid
  private List<AvailabilityResult> products = null;

  public RoomAvailabilityResult guestroomId(String guestroomId) {
    this.guestroomId = guestroomId;
    return this;
  }

  /**
   * ID of the room type
   * @return guestroomId
  **/
  @ApiModelProperty(value = "ID of the room type")


  public String getGuestroomId() {
    return guestroomId;
  }

  public void setGuestroomId(String guestroomId) {
    this.guestroomId = guestroomId;
  }

  public RoomAvailabilityResult products(List<AvailabilityResult> products) {
    this.products = products;
    return this;
  }

  public RoomAvailabilityResult addProductsItem(AvailabilityResult productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<AvailabilityResult>();
    }
    this.products.add(productsItem);
    return this;
  }

  /**
   * Get products
   * @return products
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AvailabilityResult> getProducts() {
    return products;
  }

  public void setProducts(List<AvailabilityResult> products) {
    this.products = products;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomAvailabilityResult roomAvailabilityResult = (RoomAvailabilityResult) o;
    return Objects.equals(this.guestroomId, roomAvailabilityResult.guestroomId) &&
        Objects.equals(this.products, roomAvailabilityResult.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guestroomId, products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomAvailabilityResult {\n");
    
    sb.append("    guestroomId: ").append(toIndentedString(guestroomId)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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


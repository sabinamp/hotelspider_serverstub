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
 * TypeRoom
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class TypeRoom   {
  @JsonProperty("standardOccupancy")
  private Integer standardOccupancy = null;

  @JsonProperty("standardNumBeds")
  private Integer standardNumBeds = null;

  @JsonProperty("maxCribs")
  private Integer maxCribs = null;

  @JsonProperty("maxRollaways")
  private Integer maxRollaways = null;

  @JsonProperty("composite")
  private Boolean composite = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  public TypeRoom standardOccupancy(Integer standardOccupancy) {
    this.standardOccupancy = standardOccupancy;
    return this;
  }

  /**
   * Indicates the usual number of guests that occupy this room.
   * @return standardOccupancy
  **/
  @ApiModelProperty(value = "Indicates the usual number of guests that occupy this room.")


  public Integer getStandardOccupancy() {
    return standardOccupancy;
  }

  public void setStandardOccupancy(Integer standardOccupancy) {
    this.standardOccupancy = standardOccupancy;
  }

  public TypeRoom standardNumBeds(Integer standardNumBeds) {
    this.standardNumBeds = standardNumBeds;
    return this;
  }

  /**
   * Get standardNumBeds
   * @return standardNumBeds
  **/
  @ApiModelProperty(value = "")


  public Integer getStandardNumBeds() {
    return standardNumBeds;
  }

  public void setStandardNumBeds(Integer standardNumBeds) {
    this.standardNumBeds = standardNumBeds;
  }

  public TypeRoom maxCribs(Integer maxCribs) {
    this.maxCribs = maxCribs;
    return this;
  }

  /**
   * Get maxCribs
   * @return maxCribs
  **/
  @ApiModelProperty(value = "")


  public Integer getMaxCribs() {
    return maxCribs;
  }

  public void setMaxCribs(Integer maxCribs) {
    this.maxCribs = maxCribs;
  }

  public TypeRoom maxRollaways(Integer maxRollaways) {
    this.maxRollaways = maxRollaways;
    return this;
  }

  /**
   * Get maxRollaways
   * @return maxRollaways
  **/
  @ApiModelProperty(value = "")


  public Integer getMaxRollaways() {
    return maxRollaways;
  }

  public void setMaxRollaways(Integer maxRollaways) {
    this.maxRollaways = maxRollaways;
  }

  public TypeRoom composite(Boolean composite) {
    this.composite = composite;
    return this;
  }

  /**
   * Indicates that the room (suite) is a composite of smaller units.
   * @return composite
  **/
  @ApiModelProperty(value = "Indicates that the room (suite) is a composite of smaller units.")


  public Boolean isComposite() {
    return composite;
  }

  public void setComposite(Boolean composite) {
    this.composite = composite;
  }

  public TypeRoom quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Defines the number of the item in question. Used for Numeric values, from 1 to 9999 inclusive.
   * @return quantity
  **/
  @ApiModelProperty(value = "Defines the number of the item in question. Used for Numeric values, from 1 to 9999 inclusive.")


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeRoom typeRoom = (TypeRoom) o;
    return Objects.equals(this.standardOccupancy, typeRoom.standardOccupancy) &&
        Objects.equals(this.standardNumBeds, typeRoom.standardNumBeds) &&
        Objects.equals(this.maxCribs, typeRoom.maxCribs) &&
        Objects.equals(this.maxRollaways, typeRoom.maxRollaways) &&
        Objects.equals(this.composite, typeRoom.composite) &&
        Objects.equals(this.quantity, typeRoom.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standardOccupancy, standardNumBeds, maxCribs, maxRollaways, composite, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeRoom {\n");
    
    sb.append("    standardOccupancy: ").append(toIndentedString(standardOccupancy)).append("\n");
    sb.append("    standardNumBeds: ").append(toIndentedString(standardNumBeds)).append("\n");
    sb.append("    maxCribs: ").append(toIndentedString(maxCribs)).append("\n");
    sb.append("    maxRollaways: ").append(toIndentedString(maxRollaways)).append("\n");
    sb.append("    composite: ").append(toIndentedString(composite)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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


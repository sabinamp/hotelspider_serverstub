package io.swagger.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains descriptive information about a hotel.
 */
@ApiModel(description = "Contains descriptive information about a hotel.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class HotelInfo   {
  @JsonProperty("whenBuilt")
  private LocalDate whenBuilt = null;

  @JsonProperty("position")
  private HotelInfoPosition position = null;

  @JsonProperty("descriptions")
  private Descriptions descriptions = null;

  @JsonProperty("services")
  @Valid
  private List<Service> services = null;

  public HotelInfo whenBuilt(LocalDate whenBuilt) {
    this.whenBuilt = whenBuilt;
    return this;
  }

  /**
   * The date that the hotel facility was built, usually just the year.
   * @return whenBuilt
  **/
  @ApiModelProperty(example = "1969", value = "The date that the hotel facility was built, usually just the year.")

  @Valid

  public LocalDate getWhenBuilt() {
    return whenBuilt;
  }

  public void setWhenBuilt(LocalDate whenBuilt) {
    this.whenBuilt = whenBuilt;
  }

  public HotelInfo position(HotelInfoPosition position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")

  @Valid

  public HotelInfoPosition getPosition() {
    return position;
  }

  public void setPosition(HotelInfoPosition position) {
    this.position = position;
  }

  public HotelInfo descriptions(Descriptions descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  /**
   * Get descriptions
   * @return descriptions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Descriptions getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(Descriptions descriptions) {
    this.descriptions = descriptions;
  }

  public HotelInfo services(List<Service> services) {
    this.services = services;
    return this;
  }

  public HotelInfo addServicesItem(Service servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<Service>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * Get services
   * @return services
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Service> getServices() {
    return services;
  }

  public void setServices(List<Service> services) {
    this.services = services;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelInfo hotelInfo = (HotelInfo) o;
    return Objects.equals(this.whenBuilt, hotelInfo.whenBuilt) &&
        Objects.equals(this.position, hotelInfo.position) &&
        Objects.equals(this.descriptions, hotelInfo.descriptions) &&
        Objects.equals(this.services, hotelInfo.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whenBuilt, position, descriptions, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelInfo {\n");
    
    sb.append("    whenBuilt: ").append(toIndentedString(whenBuilt)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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


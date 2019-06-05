package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BasicService;
import io.swagger.model.MultiDescription;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceResultItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class ServiceResultItem extends BasicService  {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("proximityCode")
  private Integer proximityCode = null;

  @JsonProperty("descriptions")
  private MultiDescription descriptions = null;

  public ServiceResultItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the service
   * @return name
  **/
  @ApiModelProperty(example = "Breakfast", value = "Name of the service")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServiceResultItem proximityCode(Integer proximityCode) {
    this.proximityCode = proximityCode;
    return this;
  }

  /**
   * Indication about whether a service is onsite or offsite. [Here is the list of the possible Proximity Code (PRX) values](https://tourisoft.atlassian.net/wiki/spaces/HOT/pages/4325559/Proximity+PRX)
   * @return proximityCode
  **/
  @ApiModelProperty(value = "Indication about whether a service is onsite or offsite. [Here is the list of the possible Proximity Code (PRX) values](https://tourisoft.atlassian.net/wiki/spaces/HOT/pages/4325559/Proximity+PRX)")


  public Integer getProximityCode() {
    return proximityCode;
  }

  public void setProximityCode(Integer proximityCode) {
    this.proximityCode = proximityCode;
  }

  public ServiceResultItem descriptions(MultiDescription descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  /**
   * Get descriptions
   * @return descriptions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MultiDescription getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(MultiDescription descriptions) {
    this.descriptions = descriptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceResultItem serviceResultItem = (ServiceResultItem) o;
    return Objects.equals(this.name, serviceResultItem.name) &&
        Objects.equals(this.proximityCode, serviceResultItem.proximityCode) &&
        Objects.equals(this.descriptions, serviceResultItem.descriptions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, proximityCode, descriptions, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceResultItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    proximityCode: ").append(toIndentedString(proximityCode)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
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


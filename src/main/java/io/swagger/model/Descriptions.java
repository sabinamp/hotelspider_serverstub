package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MultimediaDescription;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Descriptions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class Descriptions   {
  @JsonProperty("multimediadescriptions")
  @Valid
  private List<MultimediaDescription> multimediadescriptions = null;

  public Descriptions multimediadescriptions(List<MultimediaDescription> multimediadescriptions) {
    this.multimediadescriptions = multimediadescriptions;
    return this;
  }

  public Descriptions addMultimediadescriptionsItem(MultimediaDescription multimediadescriptionsItem) {
    if (this.multimediadescriptions == null) {
      this.multimediadescriptions = new ArrayList<MultimediaDescription>();
    }
    this.multimediadescriptions.add(multimediadescriptionsItem);
    return this;
  }

  /**
   * Get multimediadescriptions
   * @return multimediadescriptions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<MultimediaDescription> getMultimediadescriptions() {
    return multimediadescriptions;
  }

  public void setMultimediadescriptions(List<MultimediaDescription> multimediadescriptions) {
    this.multimediadescriptions = multimediadescriptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Descriptions descriptions = (Descriptions) o;
    return Objects.equals(this.multimediadescriptions, descriptions.multimediadescriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multimediadescriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Descriptions {\n");
    
    sb.append("    multimediadescriptions: ").append(toIndentedString(multimediadescriptions)).append("\n");
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


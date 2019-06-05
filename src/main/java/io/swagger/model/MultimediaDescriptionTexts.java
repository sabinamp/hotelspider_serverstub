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
 * MultimediaDescriptionTexts
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class MultimediaDescriptionTexts   {
  @JsonProperty("detailsCode")
  private Integer detailsCode = null;

  @JsonProperty("text")
  private String text = null;

  public MultimediaDescriptionTexts detailsCode(Integer detailsCode) {
    this.detailsCode = detailsCode;
    return this;
  }

  /**
   * Used to designate a particular type of additional information. [Here is the list of the possible Additional Detail Type (ADT) values](https://tourisoft.atlassian.net/wiki/spaces/HOT/pages/4325600/Additional+Detail+Type+ADT)
   * @return detailsCode
  **/
  @ApiModelProperty(value = "Used to designate a particular type of additional information. [Here is the list of the possible Additional Detail Type (ADT) values](https://tourisoft.atlassian.net/wiki/spaces/HOT/pages/4325600/Additional+Detail+Type+ADT)")


  public Integer getDetailsCode() {
    return detailsCode;
  }

  public void setDetailsCode(Integer detailsCode) {
    this.detailsCode = detailsCode;
  }

  public MultimediaDescriptionTexts text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(value = "")


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultimediaDescriptionTexts multimediaDescriptionTexts = (MultimediaDescriptionTexts) o;
    return Objects.equals(this.detailsCode, multimediaDescriptionTexts.detailsCode) &&
        Objects.equals(this.text, multimediaDescriptionTexts.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detailsCode, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultimediaDescriptionTexts {\n");
    
    sb.append("    detailsCode: ").append(toIndentedString(detailsCode)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MultimediaDescriptionImages;
import io.swagger.model.MultimediaDescriptionTexts;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MultimediaDescription
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class MultimediaDescription   {
  @JsonProperty("images")
  @Valid
  private List<MultimediaDescriptionImages> images = null;

  @JsonProperty("texts")
  @Valid
  private List<MultimediaDescriptionTexts> texts = null;

  public MultimediaDescription images(List<MultimediaDescriptionImages> images) {
    this.images = images;
    return this;
  }

  public MultimediaDescription addImagesItem(MultimediaDescriptionImages imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<MultimediaDescriptionImages>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<MultimediaDescriptionImages> getImages() {
    return images;
  }

  public void setImages(List<MultimediaDescriptionImages> images) {
    this.images = images;
  }

  public MultimediaDescription texts(List<MultimediaDescriptionTexts> texts) {
    this.texts = texts;
    return this;
  }

  public MultimediaDescription addTextsItem(MultimediaDescriptionTexts textsItem) {
    if (this.texts == null) {
      this.texts = new ArrayList<MultimediaDescriptionTexts>();
    }
    this.texts.add(textsItem);
    return this;
  }

  /**
   * Get texts
   * @return texts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<MultimediaDescriptionTexts> getTexts() {
    return texts;
  }

  public void setTexts(List<MultimediaDescriptionTexts> texts) {
    this.texts = texts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultimediaDescription multimediaDescription = (MultimediaDescription) o;
    return Objects.equals(this.images, multimediaDescription.images) &&
        Objects.equals(this.texts, multimediaDescription.texts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(images, texts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultimediaDescription {\n");
    
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    texts: ").append(toIndentedString(texts)).append("\n");
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


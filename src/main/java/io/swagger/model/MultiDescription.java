package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MultiDescription
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class MultiDescription   {
  @JsonProperty("texts")
  @Valid
  private List<String> texts = null;

  @JsonProperty("images")
  @Valid
  private List<String> images = null;

  @JsonProperty("urls")
  @Valid
  private List<String> urls = null;

  public MultiDescription texts(List<String> texts) {
    this.texts = texts;
    return this;
  }

  public MultiDescription addTextsItem(String textsItem) {
    if (this.texts == null) {
      this.texts = new ArrayList<String>();
    }
    this.texts.add(textsItem);
    return this;
  }

  /**
   * Get texts
   * @return texts
  **/
  @ApiModelProperty(value = "")


  public List<String> getTexts() {
    return texts;
  }

  public void setTexts(List<String> texts) {
    this.texts = texts;
  }

  public MultiDescription images(List<String> images) {
    this.images = images;
    return this;
  }

  public MultiDescription addImagesItem(String imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<String>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
  **/
  @ApiModelProperty(value = "")


  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public MultiDescription urls(List<String> urls) {
    this.urls = urls;
    return this;
  }

  public MultiDescription addUrlsItem(String urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<String>();
    }
    this.urls.add(urlsItem);
    return this;
  }

  /**
   * Get urls
   * @return urls
  **/
  @ApiModelProperty(value = "")


  public List<String> getUrls() {
    return urls;
  }

  public void setUrls(List<String> urls) {
    this.urls = urls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiDescription multiDescription = (MultiDescription) o;
    return Objects.equals(this.texts, multiDescription.texts) &&
        Objects.equals(this.images, multiDescription.images) &&
        Objects.equals(this.urls, multiDescription.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(texts, images, urls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiDescription {\n");
    
    sb.append("    texts: ").append(toIndentedString(texts)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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


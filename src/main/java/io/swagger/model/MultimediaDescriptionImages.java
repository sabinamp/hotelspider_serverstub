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
 * MultimediaDescriptionImages
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class MultimediaDescriptionImages   {
  @JsonProperty("sort")
  private Integer sort = null;

  @JsonProperty("imageId")
  private String imageId = null;

  @JsonProperty("imageUrl")
  private String imageUrl = null;

  @JsonProperty("imageWidth")
  private Integer imageWidth = null;

  @JsonProperty("imageHeight")
  private Integer imageHeight = null;

  /**
   * Used to define the category of the image
   */
  public enum DimensionCategoryEnum {
    ORIGINAL("Original"),
    
    THUMBNAIL("Thumbnail"),
    
    MOBILE("Mobile"),
    
    DESKTOP("Desktop"),
    
    WIDE("Wide");

    private String value;

    DimensionCategoryEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DimensionCategoryEnum fromValue(String text) {
      for (DimensionCategoryEnum b : DimensionCategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("dimensionCategory")
  private DimensionCategoryEnum dimensionCategory = null;

  public MultimediaDescriptionImages sort(Integer sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   * @return sort
  **/
  @ApiModelProperty(example = "1", value = "")


  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

  public MultimediaDescriptionImages imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

  /**
   * Get imageId
   * @return imageId
  **/
  @ApiModelProperty(example = "00L55eee8ef46e5b", value = "")


  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public MultimediaDescriptionImages imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
  **/
  @ApiModelProperty(example = "http://images.example.com/00L55eee8ef46e5b.jpg", value = "")


  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public MultimediaDescriptionImages imageWidth(Integer imageWidth) {
    this.imageWidth = imageWidth;
    return this;
  }

  /**
   * Get imageWidth
   * @return imageWidth
  **/
  @ApiModelProperty(example = "350", value = "")


  public Integer getImageWidth() {
    return imageWidth;
  }

  public void setImageWidth(Integer imageWidth) {
    this.imageWidth = imageWidth;
  }

  public MultimediaDescriptionImages imageHeight(Integer imageHeight) {
    this.imageHeight = imageHeight;
    return this;
  }

  /**
   * Get imageHeight
   * @return imageHeight
  **/
  @ApiModelProperty(example = "150", value = "")


  public Integer getImageHeight() {
    return imageHeight;
  }

  public void setImageHeight(Integer imageHeight) {
    this.imageHeight = imageHeight;
  }

  public MultimediaDescriptionImages dimensionCategory(DimensionCategoryEnum dimensionCategory) {
    this.dimensionCategory = dimensionCategory;
    return this;
  }

  /**
   * Used to define the category of the image
   * @return dimensionCategory
  **/
  @ApiModelProperty(example = "Mobile", value = "Used to define the category of the image")


  public DimensionCategoryEnum getDimensionCategory() {
    return dimensionCategory;
  }

  public void setDimensionCategory(DimensionCategoryEnum dimensionCategory) {
    this.dimensionCategory = dimensionCategory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultimediaDescriptionImages multimediaDescriptionImages = (MultimediaDescriptionImages) o;
    return Objects.equals(this.sort, multimediaDescriptionImages.sort) &&
        Objects.equals(this.imageId, multimediaDescriptionImages.imageId) &&
        Objects.equals(this.imageUrl, multimediaDescriptionImages.imageUrl) &&
        Objects.equals(this.imageWidth, multimediaDescriptionImages.imageWidth) &&
        Objects.equals(this.imageHeight, multimediaDescriptionImages.imageHeight) &&
        Objects.equals(this.dimensionCategory, multimediaDescriptionImages.dimensionCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sort, imageId, imageUrl, imageWidth, imageHeight, dimensionCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultimediaDescriptionImages {\n");
    
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    imageWidth: ").append(toIndentedString(imageWidth)).append("\n");
    sb.append("    imageHeight: ").append(toIndentedString(imageHeight)).append("\n");
    sb.append("    dimensionCategory: ").append(toIndentedString(dimensionCategory)).append("\n");
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


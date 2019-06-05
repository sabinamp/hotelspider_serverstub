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
 * Award
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class Award   {
  @JsonProperty("provider")
  private String provider = null;

  @JsonProperty("rating")
  private String rating = null;

  public Award provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Get provider
   * @return provider
  **/
  @ApiModelProperty(value = "")


  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public Award rating(String rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
  **/
  @ApiModelProperty(value = "")


  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Award award = (Award) o;
    return Objects.equals(this.provider, award.provider) &&
        Objects.equals(this.rating, award.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, rating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Award {\n");
    
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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


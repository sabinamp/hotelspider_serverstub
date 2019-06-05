package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Award;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Provides information regarding affiliations, loyalty programs and award ratings.The AffiliationInfo object is used to identify the brand or franchise affiliations of the hotel.
 */
@ApiModel(description = "Provides information regarding affiliations, loyalty programs and award ratings.The AffiliationInfo object is used to identify the brand or franchise affiliations of the hotel.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class HotelDescriptiveInfoAffiliationInfo   {
  @JsonProperty("awards")
  @Valid
  private List<Award> awards = null;

  public HotelDescriptiveInfoAffiliationInfo awards(List<Award> awards) {
    this.awards = awards;
    return this;
  }

  public HotelDescriptiveInfoAffiliationInfo addAwardsItem(Award awardsItem) {
    if (this.awards == null) {
      this.awards = new ArrayList<Award>();
    }
    this.awards.add(awardsItem);
    return this;
  }

  /**
   * Get awards
   * @return awards
  **/
  @ApiModelProperty(example = "[{\"provider\":\"HotelAssociation\",\"rating\":3},{\"provider\":\"TripAdvisor\",\"rating\":3.5}]", value = "")

  @Valid

  public List<Award> getAwards() {
    return awards;
  }

  public void setAwards(List<Award> awards) {
    this.awards = awards;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelDescriptiveInfoAffiliationInfo hotelDescriptiveInfoAffiliationInfo = (HotelDescriptiveInfoAffiliationInfo) o;
    return Objects.equals(this.awards, hotelDescriptiveInfoAffiliationInfo.awards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelDescriptiveInfoAffiliationInfo {\n");
    
    sb.append("    awards: ").append(toIndentedString(awards)).append("\n");
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


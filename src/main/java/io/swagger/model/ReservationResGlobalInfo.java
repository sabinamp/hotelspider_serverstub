package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.GuestCount;
import io.swagger.model.Profile;
import io.swagger.model.ReservationResGlobalInfoGuarantee;
import io.swagger.model.TimeSpan;
import io.swagger.model.Total;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReservationResGlobalInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class ReservationResGlobalInfo   {
  @JsonProperty("timeSpan")
  private TimeSpan timeSpan = null;

  @JsonProperty("comments")
  @Valid
  private List<String> comments = null;

  @JsonProperty("guarantee")
  private ReservationResGlobalInfoGuarantee guarantee = null;

  @JsonProperty("total")
  private Total total = null;

  @JsonProperty("guestCounts")
  @Valid
  private List<GuestCount> guestCounts = null;

  @JsonProperty("profiles")
  @Valid
  private List<Profile> profiles = null;

  public ReservationResGlobalInfo timeSpan(TimeSpan timeSpan) {
    this.timeSpan = timeSpan;
    return this;
  }

  /**
   * Get timeSpan
   * @return timeSpan
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TimeSpan getTimeSpan() {
    return timeSpan;
  }

  public void setTimeSpan(TimeSpan timeSpan) {
    this.timeSpan = timeSpan;
  }

  public ReservationResGlobalInfo comments(List<String> comments) {
    this.comments = comments;
    return this;
  }

  public ReservationResGlobalInfo addCommentsItem(String commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<String>();
    }
    this.comments.add(commentsItem);
    return this;
  }

  /**
   * Get comments
   * @return comments
  **/
  @ApiModelProperty(value = "")


  public List<String> getComments() {
    return comments;
  }

  public void setComments(List<String> comments) {
    this.comments = comments;
  }

  public ReservationResGlobalInfo guarantee(ReservationResGlobalInfoGuarantee guarantee) {
    this.guarantee = guarantee;
    return this;
  }

  /**
   * Get guarantee
   * @return guarantee
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ReservationResGlobalInfoGuarantee getGuarantee() {
    return guarantee;
  }

  public void setGuarantee(ReservationResGlobalInfoGuarantee guarantee) {
    this.guarantee = guarantee;
  }

  public ReservationResGlobalInfo total(Total total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Total getTotal() {
    return total;
  }

  public void setTotal(Total total) {
    this.total = total;
  }

  public ReservationResGlobalInfo guestCounts(List<GuestCount> guestCounts) {
    this.guestCounts = guestCounts;
    return this;
  }

  public ReservationResGlobalInfo addGuestCountsItem(GuestCount guestCountsItem) {
    if (this.guestCounts == null) {
      this.guestCounts = new ArrayList<GuestCount>();
    }
    this.guestCounts.add(guestCountsItem);
    return this;
  }

  /**
   * Get guestCounts
   * @return guestCounts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<GuestCount> getGuestCounts() {
    return guestCounts;
  }

  public void setGuestCounts(List<GuestCount> guestCounts) {
    this.guestCounts = guestCounts;
  }

  public ReservationResGlobalInfo profiles(List<Profile> profiles) {
    this.profiles = profiles;
    return this;
  }

  public ReservationResGlobalInfo addProfilesItem(Profile profilesItem) {
    if (this.profiles == null) {
      this.profiles = new ArrayList<Profile>();
    }
    this.profiles.add(profilesItem);
    return this;
  }

  /**
   * Get profiles
   * @return profiles
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Profile> getProfiles() {
    return profiles;
  }

  public void setProfiles(List<Profile> profiles) {
    this.profiles = profiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservationResGlobalInfo reservationResGlobalInfo = (ReservationResGlobalInfo) o;
    return Objects.equals(this.timeSpan, reservationResGlobalInfo.timeSpan) &&
        Objects.equals(this.comments, reservationResGlobalInfo.comments) &&
        Objects.equals(this.guarantee, reservationResGlobalInfo.guarantee) &&
        Objects.equals(this.total, reservationResGlobalInfo.total) &&
        Objects.equals(this.guestCounts, reservationResGlobalInfo.guestCounts) &&
        Objects.equals(this.profiles, reservationResGlobalInfo.profiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeSpan, comments, guarantee, total, guestCounts, profiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationResGlobalInfo {\n");
    
    sb.append("    timeSpan: ").append(toIndentedString(timeSpan)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    guarantee: ").append(toIndentedString(guarantee)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    guestCounts: ").append(toIndentedString(guestCounts)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
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


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ContactInfo;
import io.swagger.model.HotelDescriptiveInfoAffiliationInfo;
import io.swagger.model.HotelDescriptiveInfoFacilityInfo;
import io.swagger.model.HotelDescriptiveInfoPolicies;
import io.swagger.model.HotelInfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HotelDescriptiveInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class HotelDescriptiveInfo   {
  @JsonProperty("hotelId")
  private String hotelId = null;

  @JsonProperty("hotelName")
  private String hotelName = null;

  @JsonProperty("areaUnitOfMeasureCode")
  private Integer areaUnitOfMeasureCode = null;

  @JsonProperty("distanceUnitOfMeasureCode")
  private Integer distanceUnitOfMeasureCode = null;

  @JsonProperty("timeZone")
  private String timeZone = null;

  @JsonProperty("weightUnitOfMeasureCode")
  private Integer weightUnitOfMeasureCode = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("hotelInfo")
  private HotelInfo hotelInfo = null;

  @JsonProperty("affiliationInfo")
  private HotelDescriptiveInfoAffiliationInfo affiliationInfo = null;

  @JsonProperty("facilityInfo")
  private HotelDescriptiveInfoFacilityInfo facilityInfo = null;

  @JsonProperty("contactInfos")
  @Valid
  private List<ContactInfo> contactInfos = null;

  @JsonProperty("policies")
  private HotelDescriptiveInfoPolicies policies = null;

  public HotelDescriptiveInfo hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

  /**
   * The hotel ID.
   * @return hotelId
  **/
  @ApiModelProperty(example = "00U5846e022f291e", value = "The hotel ID.")


  public String getHotelId() {
    return hotelId;
  }

  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  public HotelDescriptiveInfo hotelName(String hotelName) {
    this.hotelName = hotelName;
    return this;
  }

  /**
   * The hotel name.
   * @return hotelName
  **/
  @ApiModelProperty(example = "Test hotel", value = "The hotel name.")


  public String getHotelName() {
    return hotelName;
  }

  public void setHotelName(String hotelName) {
    this.hotelName = hotelName;
  }

  public HotelDescriptiveInfo areaUnitOfMeasureCode(Integer areaUnitOfMeasureCode) {
    this.areaUnitOfMeasureCode = areaUnitOfMeasureCode;
    return this;
  }

  /**
   * Provides the unit of measure in which area is provided in this message. Refer to OpenTravel Code List Unit of Measure (UOM).
   * @return areaUnitOfMeasureCode
  **/
  @ApiModelProperty(example = "14", value = "Provides the unit of measure in which area is provided in this message. Refer to OpenTravel Code List Unit of Measure (UOM).")


  public Integer getAreaUnitOfMeasureCode() {
    return areaUnitOfMeasureCode;
  }

  public void setAreaUnitOfMeasureCode(Integer areaUnitOfMeasureCode) {
    this.areaUnitOfMeasureCode = areaUnitOfMeasureCode;
  }

  public HotelDescriptiveInfo distanceUnitOfMeasureCode(Integer distanceUnitOfMeasureCode) {
    this.distanceUnitOfMeasureCode = distanceUnitOfMeasureCode;
    return this;
  }

  /**
   * Provides the unit of measure in which distance is provided in this message. Refer to OpenTravel Code List Unit of Measure (UOM).
   * @return distanceUnitOfMeasureCode
  **/
  @ApiModelProperty(example = "2", value = "Provides the unit of measure in which distance is provided in this message. Refer to OpenTravel Code List Unit of Measure (UOM).")


  public Integer getDistanceUnitOfMeasureCode() {
    return distanceUnitOfMeasureCode;
  }

  public void setDistanceUnitOfMeasureCode(Integer distanceUnitOfMeasureCode) {
    this.distanceUnitOfMeasureCode = distanceUnitOfMeasureCode;
  }

  public HotelDescriptiveInfo timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Describes the local time zone in which the hotel is located. This could include additional information regarding time zones (e.g., Daylight Saving Time observed), a proprietary code, the difference between the local time and GMT.
   * @return timeZone
  **/
  @ApiModelProperty(example = "Europe/Zurich", value = "Describes the local time zone in which the hotel is located. This could include additional information regarding time zones (e.g., Daylight Saving Time observed), a proprietary code, the difference between the local time and GMT.")


  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public HotelDescriptiveInfo weightUnitOfMeasureCode(Integer weightUnitOfMeasureCode) {
    this.weightUnitOfMeasureCode = weightUnitOfMeasureCode;
    return this;
  }

  /**
   * Provides the unit of measure in which weight is provided in this message. Refer to OpenTravel Code List Unit of Measure (UOM).
   * @return weightUnitOfMeasureCode
  **/
  @ApiModelProperty(example = "16", value = "Provides the unit of measure in which weight is provided in this message. Refer to OpenTravel Code List Unit of Measure (UOM).")


  public Integer getWeightUnitOfMeasureCode() {
    return weightUnitOfMeasureCode;
  }

  public void setWeightUnitOfMeasureCode(Integer weightUnitOfMeasureCode) {
    this.weightUnitOfMeasureCode = weightUnitOfMeasureCode;
  }

  public HotelDescriptiveInfo currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(value = "")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public HotelDescriptiveInfo hotelInfo(HotelInfo hotelInfo) {
    this.hotelInfo = hotelInfo;
    return this;
  }

  /**
   * Get hotelInfo
   * @return hotelInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public HotelInfo getHotelInfo() {
    return hotelInfo;
  }

  public void setHotelInfo(HotelInfo hotelInfo) {
    this.hotelInfo = hotelInfo;
  }

  public HotelDescriptiveInfo affiliationInfo(HotelDescriptiveInfoAffiliationInfo affiliationInfo) {
    this.affiliationInfo = affiliationInfo;
    return this;
  }

  /**
   * Get affiliationInfo
   * @return affiliationInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public HotelDescriptiveInfoAffiliationInfo getAffiliationInfo() {
    return affiliationInfo;
  }

  public void setAffiliationInfo(HotelDescriptiveInfoAffiliationInfo affiliationInfo) {
    this.affiliationInfo = affiliationInfo;
  }

  public HotelDescriptiveInfo facilityInfo(HotelDescriptiveInfoFacilityInfo facilityInfo) {
    this.facilityInfo = facilityInfo;
    return this;
  }

  /**
   * Get facilityInfo
   * @return facilityInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public HotelDescriptiveInfoFacilityInfo getFacilityInfo() {
    return facilityInfo;
  }

  public void setFacilityInfo(HotelDescriptiveInfoFacilityInfo facilityInfo) {
    this.facilityInfo = facilityInfo;
  }

  public HotelDescriptiveInfo contactInfos(List<ContactInfo> contactInfos) {
    this.contactInfos = contactInfos;
    return this;
  }

  public HotelDescriptiveInfo addContactInfosItem(ContactInfo contactInfosItem) {
    if (this.contactInfos == null) {
      this.contactInfos = new ArrayList<ContactInfo>();
    }
    this.contactInfos.add(contactInfosItem);
    return this;
  }

  /**
   * Get contactInfos
   * @return contactInfos
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ContactInfo> getContactInfos() {
    return contactInfos;
  }

  public void setContactInfos(List<ContactInfo> contactInfos) {
    this.contactInfos = contactInfos;
  }

  public HotelDescriptiveInfo policies(HotelDescriptiveInfoPolicies policies) {
    this.policies = policies;
    return this;
  }

  /**
   * Get policies
   * @return policies
  **/
  @ApiModelProperty(value = "")

  @Valid

  public HotelDescriptiveInfoPolicies getPolicies() {
    return policies;
  }

  public void setPolicies(HotelDescriptiveInfoPolicies policies) {
    this.policies = policies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelDescriptiveInfo hotelDescriptiveInfo = (HotelDescriptiveInfo) o;
    return Objects.equals(this.hotelId, hotelDescriptiveInfo.hotelId) &&
        Objects.equals(this.hotelName, hotelDescriptiveInfo.hotelName) &&
        Objects.equals(this.areaUnitOfMeasureCode, hotelDescriptiveInfo.areaUnitOfMeasureCode) &&
        Objects.equals(this.distanceUnitOfMeasureCode, hotelDescriptiveInfo.distanceUnitOfMeasureCode) &&
        Objects.equals(this.timeZone, hotelDescriptiveInfo.timeZone) &&
        Objects.equals(this.weightUnitOfMeasureCode, hotelDescriptiveInfo.weightUnitOfMeasureCode) &&
        Objects.equals(this.currencyCode, hotelDescriptiveInfo.currencyCode) &&
        Objects.equals(this.hotelInfo, hotelDescriptiveInfo.hotelInfo) &&
        Objects.equals(this.affiliationInfo, hotelDescriptiveInfo.affiliationInfo) &&
        Objects.equals(this.facilityInfo, hotelDescriptiveInfo.facilityInfo) &&
        Objects.equals(this.contactInfos, hotelDescriptiveInfo.contactInfos) &&
        Objects.equals(this.policies, hotelDescriptiveInfo.policies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hotelId, hotelName, areaUnitOfMeasureCode, distanceUnitOfMeasureCode, timeZone, weightUnitOfMeasureCode, currencyCode, hotelInfo, affiliationInfo, facilityInfo, contactInfos, policies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelDescriptiveInfo {\n");
    
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    hotelName: ").append(toIndentedString(hotelName)).append("\n");
    sb.append("    areaUnitOfMeasureCode: ").append(toIndentedString(areaUnitOfMeasureCode)).append("\n");
    sb.append("    distanceUnitOfMeasureCode: ").append(toIndentedString(distanceUnitOfMeasureCode)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    weightUnitOfMeasureCode: ").append(toIndentedString(weightUnitOfMeasureCode)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    hotelInfo: ").append(toIndentedString(hotelInfo)).append("\n");
    sb.append("    affiliationInfo: ").append(toIndentedString(affiliationInfo)).append("\n");
    sb.append("    facilityInfo: ").append(toIndentedString(facilityInfo)).append("\n");
    sb.append("    contactInfos: ").append(toIndentedString(contactInfos)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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


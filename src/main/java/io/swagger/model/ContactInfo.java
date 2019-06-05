package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Address;
import io.swagger.model.Email;
import io.swagger.model.Phone;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContactInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class ContactInfo   {
  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("addresses")
  @Valid
  private List<Address> addresses = null;

  @JsonProperty("phones")
  @Valid
  private List<Phone> phones = null;

  @JsonProperty("emails")
  @Valid
  private List<Email> emails = null;

  public ContactInfo companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(example = "Test Hotel gmbH", value = "")


  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public ContactInfo addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  public ContactInfo addAddressesItem(Address addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<Address>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

  /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  public ContactInfo phones(List<Phone> phones) {
    this.phones = phones;
    return this;
  }

  public ContactInfo addPhonesItem(Phone phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<Phone>();
    }
    this.phones.add(phonesItem);
    return this;
  }

  /**
   * Get phones
   * @return phones
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Phone> getPhones() {
    return phones;
  }

  public void setPhones(List<Phone> phones) {
    this.phones = phones;
  }

  public ContactInfo emails(List<Email> emails) {
    this.emails = emails;
    return this;
  }

  public ContactInfo addEmailsItem(Email emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<Email>();
    }
    this.emails.add(emailsItem);
    return this;
  }

  /**
   * Get emails
   * @return emails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Email> getEmails() {
    return emails;
  }

  public void setEmails(List<Email> emails) {
    this.emails = emails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactInfo contactInfo = (ContactInfo) o;
    return Objects.equals(this.companyName, contactInfo.companyName) &&
        Objects.equals(this.addresses, contactInfo.addresses) &&
        Objects.equals(this.phones, contactInfo.phones) &&
        Objects.equals(this.emails, contactInfo.emails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, addresses, phones, emails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactInfo {\n");
    
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
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


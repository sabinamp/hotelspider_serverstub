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
 * PaymentCard
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class PaymentCard   {
  /**
   * Gets or Sets cardCode
   */
  public enum CardCodeEnum {
    AX("AX"),
    
    VI("VI"),
    
    MC("MC"),
    
    EC("EC"),
    
    DN("DN"),
    
    JC("JC"),
    
    DS("DS"),
    
    MA("MA"),
    
    BL("BL"),
    
    CB("CB"),
    
    BC("BC"),
    
    CU("CU"),
    
    TP("TP");

    private String value;

    CardCodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CardCodeEnum fromValue(String text) {
      for (CardCodeEnum b : CardCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("cardCode")
  private CardCodeEnum cardCode = null;

  @JsonProperty("cardNumber")
  private String cardNumber = null;

  @JsonProperty("expireDate")
  private String expireDate = null;

  @JsonProperty("cardHolderName")
  private String cardHolderName = null;

  public PaymentCard cardCode(CardCodeEnum cardCode) {
    this.cardCode = cardCode;
    return this;
  }

  /**
   * Get cardCode
   * @return cardCode
  **/
  @ApiModelProperty(example = "AX", value = "")


  public CardCodeEnum getCardCode() {
    return cardCode;
  }

  public void setCardCode(CardCodeEnum cardCode) {
    this.cardCode = cardCode;
  }

  public PaymentCard cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

  /**
   * Get cardNumber
   * @return cardNumber
  **/
  @ApiModelProperty(example = "xxxx xxxx xxxx 1110", value = "")


  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public PaymentCard expireDate(String expireDate) {
    this.expireDate = expireDate;
    return this;
  }

  /**
   * Get expireDate
   * @return expireDate
  **/
  @ApiModelProperty(example = "01/18", value = "")


  public String getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(String expireDate) {
    this.expireDate = expireDate;
  }

  public PaymentCard cardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
    return this;
  }

  /**
   * Get cardHolderName
   * @return cardHolderName
  **/
  @ApiModelProperty(example = "Mr. John Doe", value = "")


  public String getCardHolderName() {
    return cardHolderName;
  }

  public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentCard paymentCard = (PaymentCard) o;
    return Objects.equals(this.cardCode, paymentCard.cardCode) &&
        Objects.equals(this.cardNumber, paymentCard.cardNumber) &&
        Objects.equals(this.expireDate, paymentCard.expireDate) &&
        Objects.equals(this.cardHolderName, paymentCard.cardHolderName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardCode, cardNumber, expireDate, cardHolderName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCard {\n");
    
    sb.append("    cardCode: ").append(toIndentedString(cardCode)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
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


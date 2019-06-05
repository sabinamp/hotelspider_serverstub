package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PaymentCard;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReservationResGlobalInfoGuarantee
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T18:32:34.907Z")

public class ReservationResGlobalInfoGuarantee   {
  @JsonProperty("paymentCard")
  private PaymentCard paymentCard = null;

  public ReservationResGlobalInfoGuarantee paymentCard(PaymentCard paymentCard) {
    this.paymentCard = paymentCard;
    return this;
  }

  /**
   * Get paymentCard
   * @return paymentCard
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PaymentCard getPaymentCard() {
    return paymentCard;
  }

  public void setPaymentCard(PaymentCard paymentCard) {
    this.paymentCard = paymentCard;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservationResGlobalInfoGuarantee reservationResGlobalInfoGuarantee = (ReservationResGlobalInfoGuarantee) o;
    return Objects.equals(this.paymentCard, reservationResGlobalInfoGuarantee.paymentCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentCard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationResGlobalInfoGuarantee {\n");
    
    sb.append("    paymentCard: ").append(toIndentedString(paymentCard)).append("\n");
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


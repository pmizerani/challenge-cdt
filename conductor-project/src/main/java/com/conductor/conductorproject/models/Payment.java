package com.conductor.conductorproject.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A payment for an order
 */
@ApiModel(description = "A payment for an order")
@Validated
@Entity
@EntityListeners(AuditingEntityListener.class)
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-25T17:49:38.592661-03:00[America/Sao_Paulo]")
public class Payment   {
  @JsonProperty("status")
  @Column
  @NotNull
  @Size(max = 5)
  private String status = null;

  @JsonProperty("creditCardNum")
  @Column
  @NotNull
  @Size(max = 16)
  private String creditCardNum = null;

  @JsonProperty("paymentDate")
  @Column
  @CreatedDate
  private String paymentDate = null;

  public Payment status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Represent the status of payment
   * @return status
  **/
  @ApiModelProperty(value = "Represent the status of payment")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Payment creditCardNum(String creditCardNum) {
    this.creditCardNum = creditCardNum;
    return this;
  }

  /**
   * This is a number of credit card
   * @return creditCardNum
  **/
  @ApiModelProperty(value = "This is a number of credit card")
  
    public String getCreditCardNum() {
    return creditCardNum;
  }

  public void setCreditCardNum(String creditCardNum) {
    this.creditCardNum = creditCardNum;
  }

  public Payment paymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  /**
   * effective payment date
   * @return paymentDate
  **/
  @ApiModelProperty(value = "effective payment date")
  
    public String getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.status, payment.status) &&
        Objects.equals(this.creditCardNum, payment.creditCardNum) &&
        Objects.equals(this.paymentDate, payment.paymentDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, creditCardNum, paymentDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creditCardNum: ").append(toIndentedString(creditCardNum)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
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

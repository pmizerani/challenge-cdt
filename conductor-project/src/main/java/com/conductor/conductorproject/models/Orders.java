package com.conductor.conductorproject.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This is the store model
 */
@ApiModel(description = "This is the store model")
@Validated
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "orders")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-26T11:41:11.692309-03:00[America/Sao_Paulo]")
public class Orders {
  @JsonProperty("orderId")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id = null;

  @JsonProperty("addres")
  @Column
  @NotNull
  @Size(max = 200)
  private String addres = null;

  @JsonProperty("confirmationDate")
  @Column
  private String confirmationDate = null;

  @JsonProperty("status")
  @Column
  @NotNull
  private String status = null;

  @JsonProperty("total")
  private BigDecimal total = null;

  public Orders id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of a single order
   * @return orderId
  **/
  @ApiModelProperty(value = "Identifier of a single order")
  
    public Long getOrderId() {
    return id;
  }

  public void setOrderId(Long orderId) {
    this.id = orderId;
  }

  public Orders addres(String addres) {
    this.addres = addres;
    return this;
  }

  /**
   * The addres of order
   * @return addres
  **/
  @ApiModelProperty(value = "The addres of order")
  
    public String getAddres() {
    return addres;
  }

  public void setAddres(String addres) {
    this.addres = addres;
  }

  public Orders confirmationDate(String confirmationDate) {
    this.confirmationDate = confirmationDate;
    return this;
  }

  /**
   * Represents the date this order was approved
   * @return confirmationDate
  **/
  @ApiModelProperty(value = "Represents the date this order was approved")
  
    public String getConfirmationDate() {
    return confirmationDate;
  }

  public void setConfirmationDate(String confirmationDate) {
    this.confirmationDate = confirmationDate;
  }

  public Orders status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Represents the order status, if approved, awaiting approval, payment refusal
   * @return status
  **/
  @ApiModelProperty(value = "Represents the order status, if approved, awaiting approval, payment refusal")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Orders total(BigDecimal total) {
    this.total = total;
    return this;
  }

  /**
   * Represents the total amount of this order
   * @return total
  **/
  @ApiModelProperty(value = "Represents the total amount of this order")
  
    @Valid
    public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Orders orders = (Orders) o;
    return Objects.equals(this.id, orders.id) &&
        Objects.equals(this.addres, orders.addres) &&
        Objects.equals(this.confirmationDate, orders.confirmationDate) &&
        Objects.equals(this.status, orders.status) &&
        Objects.equals(this.total, orders.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, addres, confirmationDate, status, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    orderId: ").append(toIndentedString(id)).append("\n");
    sb.append("    addres: ").append(toIndentedString(addres)).append("\n");
    sb.append("    confirmationDate: ").append(toIndentedString(confirmationDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

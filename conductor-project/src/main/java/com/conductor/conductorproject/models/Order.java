package com.conductor.conductorproject.models;

import java.util.Objects;
import com.conductor.conductorproject.models.OrderItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This is the store model
 */
@ApiModel(description = "This is the store model")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-25T17:49:38.592661-03:00[America/Sao_Paulo]")
public class Order   {
  @JsonProperty("orderId")
  private Integer orderId = null;

  @JsonProperty("addres")
  private String addres = null;

  @JsonProperty("confirmationDate")
  private String confirmationDate = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("orderItem")
  @Valid
  private List<OrderItem> orderItem = null;

  @JsonProperty("total")
  private BigDecimal total = null;

  public Order orderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Identifier of a single order
   * @return orderId
  **/
  @ApiModelProperty(value = "Identifier of a single order")
  
    public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public Order addres(String addres) {
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

  public Order confirmationDate(String confirmationDate) {
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

  public Order status(String status) {
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

  public Order orderItem(List<OrderItem> orderItem) {
    this.orderItem = orderItem;
    return this;
  }

  public Order addOrderItemItem(OrderItem orderItemItem) {
    if (this.orderItem == null) {
      this.orderItem = new ArrayList<OrderItem>();
    }
    this.orderItem.add(orderItemItem);
    return this;
  }

  /**
   * The items that make up the order
   * @return orderItem
  **/
  @ApiModelProperty(value = "The items that make up the order")
      @Valid
    public List<OrderItem> getOrderItem() {
    return orderItem;
  }

  public void setOrderItem(List<OrderItem> orderItem) {
    this.orderItem = orderItem;
  }

  public Order total(BigDecimal total) {
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
    Order order = (Order) o;
    return Objects.equals(this.orderId, order.orderId) &&
        Objects.equals(this.addres, order.addres) &&
        Objects.equals(this.confirmationDate, order.confirmationDate) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.orderItem, order.orderItem) &&
        Objects.equals(this.total, order.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, addres, confirmationDate, status, orderItem, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    addres: ").append(toIndentedString(addres)).append("\n");
    sb.append("    confirmationDate: ").append(toIndentedString(confirmationDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    orderItem: ").append(toIndentedString(orderItem)).append("\n");
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

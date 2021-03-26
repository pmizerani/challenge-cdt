package com.conductor.conductorproject.models;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The order item
 */
@ApiModel(description = "The order item")
@Validated
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-26T11:41:11.692309-03:00[America/Sao_Paulo]")
public class OrderItem   {

  @JsonProperty("orderItemId")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id = null;

  @JsonProperty("description")
  @Column
  @NotNull
  @Size(max = 200)
  private String description = null;

  @JsonProperty("unitPrice")
  @Column
  @NotNull
  private BigDecimal unitPrice = null;

  @JsonProperty("quantity")
  @Column
  @NotNull
  private Integer quantity = null;

  @JsonProperty("orderid")
  private Long orderId = null;


  public OrderItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * This is a description of the order item
   * @return description
  **/
  @ApiModelProperty(value = "This is a description of the order item")
  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrderItem unitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * Represents the unit price of this item
   * @return unitPrice
  **/
  @ApiModelProperty(value = "Represents the unit price of this item")
  
  @Valid
  public BigDecimal getUnitPrice() {
  return unitPrice;
}

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }

  public OrderItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity of this item that this order contains
   * @return quantity
  **/
  @ApiModelProperty(value = "Quantity of this item that this order contains")
  
  public Integer getQuantity() {
  return quantity;
}

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItem orderItem = (OrderItem) o;
    return Objects.equals(this.description, orderItem.description) &&
        Objects.equals(this.unitPrice, orderItem.unitPrice) &&
        Objects.equals(this.quantity, orderItem.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, unitPrice, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItem {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

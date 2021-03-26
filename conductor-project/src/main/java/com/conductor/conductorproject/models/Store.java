package com.conductor.conductorproject.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * This is the store model
 */
@ApiModel(description = "This is the store model")
@Validated
@Entity
@EntityListeners(AuditingEntityListener.class)
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-26T11:41:11.692309-03:00[America/Sao_Paulo]")
public class Store   {
  @JsonProperty("storeId")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id = null;

  @JsonProperty("name")
  @NotNull
  @Column
  @Size(max = 100)
  private String name = null;

  @JsonProperty("address")
  @NotNull
  @Column
  @Size(max = 200)
  private String address = null;

  public Store storeId(Long storeId) {
    this.id = storeId;
    return this;
  }

  /**
   * Identifier of a single store
   * @return storeId
  **/
  @ApiModelProperty(value = "Identifier of a single store")
  
    public Long getStoreId() {
    return id;
  }

  public void setStoreId(Long id) {
    this.id = id;
  }

  public Store name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of store
   * @return name
  **/
  @ApiModelProperty(value = "The name of store")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Store address(String address) {
    this.address = address;
    return this;
  }

  /**
   * The addres of store
   * @return address
  **/
  @ApiModelProperty(value = "The addres of store")
  
    public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Store store = (Store) o;
    return Objects.equals(this.id, store.id) &&
        Objects.equals(this.name, store.name) &&
        Objects.equals(this.address, store.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Store {\n");
    
    sb.append("    storeId: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

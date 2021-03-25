package com.conductor.conductorproject.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This is the store model
 */
@ApiModel(description = "This is the store model")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-25T17:39:41.818893-03:00[America/Sao_Paulo]")
public class Store   {
  @JsonProperty("storeId")
  private Integer storeId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("address")
  private String address = null;

  public Store storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

  /**
   * Identifier of a single store
   * @return storeId
  **/
  @ApiModelProperty(value = "Identifier of a single store")
  
    public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
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
    return Objects.equals(this.storeId, store.storeId) &&
        Objects.equals(this.name, store.name) &&
        Objects.equals(this.address, store.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, name, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Store {\n");
    
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
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

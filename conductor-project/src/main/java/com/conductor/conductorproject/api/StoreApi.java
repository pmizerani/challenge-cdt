/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.conductor.conductorproject.api;

import com.conductor.conductorproject.models.Store;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-26T11:41:11.692309-03:00[America/Sao_Paulo]")
@Api(value = "Store", description = "the Store API")
@RequestMapping(value = "/conductor/api/v1")
public interface StoreApi {

    @ApiOperation(value = "Return a store by parameters", nickname = "getStore", notes = "Return a store by any parameters sent in the request", response = Store.class, tags={ "Store", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operation successful", response = Store.class),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 500, message = "Internal Error") })
    @RequestMapping(value = "/Store",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Store> getStore(@NotNull @ApiParam(value = "Store ID to retrieve a store", required = true)
                                   @Valid @RequestParam(value = "storeId", required = true) Long storeId
);


    @ApiOperation(value = "Generate a new Store", nickname = "postStore", notes = "Generate a new store composed by id," +
            " name and address", response = Store.class, tags={ "Store", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Store create sucessful", response = Store.class),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 500, message = "Internal Error") })
    @RequestMapping(value = "/Store",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> postStore(@ApiParam(value = "Input data to create a new store" ,required=true )
                                    @Valid @RequestBody Store body
);


    @ApiOperation(value = "Update a existing store", nickname = "updateStore", notes = "Update a Store information", response = Store.class, tags={ "Store", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Store update successful", response = Store.class),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 500, message = "Internal Error") })
    @RequestMapping(value = "/Store",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Store> updateStore(@ApiParam(value = "Input data to update a store" ,required=true )  @Valid @RequestBody Store body
);

}

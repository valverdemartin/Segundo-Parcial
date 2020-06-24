package com.utn.parcial.controller;

import com.utn.parcial.model.Calls;
import com.utn.parcial.service.IntegrationService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    IntegrationService integrationService;

    @GetMapping()
    @ApiOperation(value = "Show last system calls", notes = "Lists size of all last calls")
    @ApiResponses(value = {@ApiResponse(code = 204, message = "No Content"),
            @ApiResponse(code = 200, message = "Success", response = Calls.class, responseContainer = "List"),
            @ApiResponse(code = 500, message = "Internal server error"),
            @ApiResponse(code = 404, message = "Table not found")})
    public ResponseEntity<String> getLastCall(){
       return integrationService.getLastCall();
    }

}
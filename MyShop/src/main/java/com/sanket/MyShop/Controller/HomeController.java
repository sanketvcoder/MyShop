package com.sanket.MyShop.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanket.MyShop.Response.ApiResponse;

@RestController
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<ApiResponse> home() {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("Welcome to MyShop!");
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
}

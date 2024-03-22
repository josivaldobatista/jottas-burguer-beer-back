package com.jfb.jottasburguerbeer.adapter.input.web.controllers;

import com.jfb.jottasburguerbeer.adapter.input.web.api.JottasBurgerCustomerApi;
import com.jfb.jottasburguerbeer.adapter.input.web.api.request.CustomerRequest;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JottasBurgerCustomersController implements JottasBurgerCustomerApi {

    @Override
    public CustomerRequest create(CustomerRequest request) {
        return request;
    }
}

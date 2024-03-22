package com.jfb.jottasburguerbeer.adapter.input.web.api;

import com.jfb.jottasburguerbeer.adapter.input.web.api.request.CustomerRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Validated
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public interface JottasBurgerCustomerApi {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/api/v1/customers", consumes = MediaType.APPLICATION_JSON_VALUE)
    CustomerRequest create(@RequestBody CustomerRequest request);
}

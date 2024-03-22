package com.jfb.jottasburguerbeer.adapter.input.web.api.request;

public record CustomerRequest(
        String name,
        String cpfOrCnpj,
        String address
) {
}

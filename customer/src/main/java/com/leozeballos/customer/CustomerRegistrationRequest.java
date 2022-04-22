package com.leozeballos.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}

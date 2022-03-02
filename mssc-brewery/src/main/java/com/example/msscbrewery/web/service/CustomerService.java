package com.example.msscbrewery.web.service;

import com.example.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

     CustomerDto getCustomerById(UUID id);

    CustomerDto saveCustomer(CustomerDto customerDto);

    void updateCustomer(UUID id, CustomerDto customerDto);

    void deletecustomer(UUID id);
}

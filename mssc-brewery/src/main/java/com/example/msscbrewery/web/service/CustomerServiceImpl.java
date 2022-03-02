package com.example.msscbrewery.web.service;

import com.example.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder().id(id).name("Haris").build();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().id(customerDto.getId()).name(customerDto.getName()).build();
    }

    @Override
    public void updateCustomer(UUID id, CustomerDto customerDto) {
//todo update the customer
        CustomerDto.builder().name(customerDto.getName()).id(id).build();
    }

    @Override
    public void deletecustomer(UUID id) {
//todo delete customer

    }




}

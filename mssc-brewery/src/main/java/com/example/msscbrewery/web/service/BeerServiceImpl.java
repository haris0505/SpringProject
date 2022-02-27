package com.example.msscbrewery.web.service;

import com.example.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(beerId)
                .beerName("Pepsi").beerStyle("Test").build();
    }
}

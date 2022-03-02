package com.example.msscbrewery.web.service;


import com.example.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {


    BeerDto getBeerById(UUID beerId);

    BeerDto savebeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteBeer(UUID beerId);
}

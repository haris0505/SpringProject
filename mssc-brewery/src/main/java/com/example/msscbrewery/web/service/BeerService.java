package com.example.msscbrewery.web.service;


import com.example.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {


    BeerDto getBeerById(UUID beerId);
}

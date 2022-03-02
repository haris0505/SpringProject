package com.example.msscbrewery.web.service;

import com.example.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Pepsi").beerStyle("Test").build();
    }

    @Override
    public BeerDto savebeer(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName(beerDto.getBeerName())
                .beerStyle(beerDto.getBeerStyle()).build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo update the beer object
         BeerDto.builder().id(beerDto.getId())
                .beerName(beerDto.getBeerName())
                .beerStyle(beerDto.getBeerStyle()).build();
    }

    @Override
    public void deleteBeer(UUID beerId) {
        //todo delete
        log.debug("Deelte a beer");
    }
}

package com.example.msscbrewery.web.model;


import lombok.*;

import java.util.UUID;

@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BeerDto {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;

}

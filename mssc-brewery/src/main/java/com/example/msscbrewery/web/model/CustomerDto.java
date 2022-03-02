package com.example.msscbrewery.web.model;

import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Data
public class CustomerDto {

    private UUID id;
    private  String name;

}

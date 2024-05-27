package com.proyectointegrador.msplace.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.Set;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class CityDTO {
    private Long id;
    private String name;
    private String zipCode;
    private Set<PlaceOnlyDTO> places;
}

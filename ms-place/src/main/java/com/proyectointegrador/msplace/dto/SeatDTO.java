package com.proyectointegrador.msplace.dto;

import com.proyectointegrador.msplace.domain.Zone;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class SeatDTO {
    private Long id;
    private Integer availability;
    private Double price;
    private Zone zone;
    private Long ticketId;
}

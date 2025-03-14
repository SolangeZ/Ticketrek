package com.proyectointegrador.msticket.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TicketRequest {
    private String userId;
    private Long paymentMethodId;
}

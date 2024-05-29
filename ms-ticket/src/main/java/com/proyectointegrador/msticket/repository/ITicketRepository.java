package com.proyectointegrador.msticket.repository;

import com.proyectointegrador.msticket.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByUserId(String id);
}

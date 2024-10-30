package com.mini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.mini.Repsonse.Ticket;
import com.mini.Request.Passenger;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TicketService {

    private static final String BOOK_TICKET_URL = "https://www.classes.ashokit.in/ticket";
    private static final String ALL_TICKETS_URL = "https://www.classes.ashokit.in/tickets";

    @Autowired
    private WebClient webClient;

    // Post Passenger Details and Get Ticket Response
    public Mono<Ticket> createTicket(Passenger passenger) {
        return webClient
                .post()
                .uri(BOOK_TICKET_URL)
                .bodyValue(passenger)
                .retrieve()
                .bodyToMono(Ticket.class);
    }

    // Get all Ticket Details
    public Flux<Ticket> getAllTickets() {
        return webClient
                .get()
                .uri(ALL_TICKETS_URL)
                .retrieve()
                .bodyToFlux(Ticket.class);
    }
}
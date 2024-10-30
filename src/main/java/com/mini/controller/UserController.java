package com.mini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mini.Repsonse.Ticket;
import com.mini.Request.Passenger;
import com.mini.service.TicketService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
public class UserController {

    private final TicketService service;

    public UserController(TicketService service) {
        this.service = service;
    }

    // Show the form for passenger details
    @GetMapping("/")
    public String passangerPage(@ModelAttribute("passenger") Passenger passenger, Model model) {
        model.addAttribute("passenger", passenger);
        return "index.html";  // Load the form from index.html
    }

    // Handle passenger form submission and show ticket details
    @PostMapping("/passenger")
    public String passangerPageHandler(@ModelAttribute("passenger") Passenger passenger, Model model) {
        model.addAttribute("passenger", passenger);

        // Call service to post passenger details and get the ticket
        Mono<Ticket> postDetails = service.createTicket(passenger);
        model.addAttribute("ticket", postDetails);

        return "ticketdetails";  // Load ticket details from ticketdetails.html
    }

    // Show all ticket details
    @GetMapping("/get")
    public String allPageHandler(Model model) {
        // Call service to fetch all tickets
        Flux<Ticket> postDetails = service.getAllTickets();
        model.addAttribute("tickets", postDetails);

        return "ticketsdetails";  // Load all tickets from ticketsdetails.html
    }
}
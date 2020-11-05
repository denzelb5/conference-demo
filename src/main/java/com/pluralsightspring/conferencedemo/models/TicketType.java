package com.pluralsightspring.conferencedemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "ticket_types")

public class TicketType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String ticket_type_code;
    private String ticket_type_name;
    private String description;
    private Boolean includes_workshop;

    public TicketType() {}

    public String getTicket_type_code() {
        return ticket_type_code;
    }

    public void setTicket_type_code(String ticket_type_code) {
        this.ticket_type_code = ticket_type_code;
    }

    public String getTicket_type_name() {
        return ticket_type_name;
    }

    public void setTicket_type_name(String ticket_type_name) {
        this.ticket_type_name = ticket_type_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIncludes_workshop() {
        return includes_workshop;
    }

    public void setIncludes_workshop(Boolean includes_workshop) {
        this.includes_workshop = includes_workshop;
    }
}

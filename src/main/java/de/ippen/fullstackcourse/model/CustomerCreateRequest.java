package de.ippen.fullstackcourse.model;

import lombok.Data;

import java.util.Date;

@Data
public class CustomerCreateRequest {
    private Long id;
    private String name;
    private Date timestamp;

    public CustomerCreateRequest() {
    }
}

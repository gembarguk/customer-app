package de.ippen.fullstackcourse.repos.modeldb;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class CustomerDB {
    @GeneratedValue
    @Id
    private Long id;
    private String name;
    private Date timestamp;

    public CustomerDB() {
    }
}

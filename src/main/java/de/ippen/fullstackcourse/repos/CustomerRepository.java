package de.ippen.fullstackcourse.repos;

import de.ippen.fullstackcourse.repos.modeldb.CustomerDB;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class CustomerRepository implements PanacheRepository<CustomerDB> {

    @Transactional //rolls back changes in case of error - used when you change the data
    public void addCustomer(CustomerDB customerDB) {
        //add customer to db
        this.persist(customerDB);
    }

    @Transactional
    public void removeCustomer(Long customerId) {
        //remove customer to db
        this.deleteById(customerId);
    }

    public List<CustomerDB> getAllCustomers() {
        //get all customers
        return this.listAll();
    }
}

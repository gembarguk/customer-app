package de.ippen.fullstackcourse;

import de.ippen.fullstackcourse.repos.CustomerRepository;
import de.ippen.fullstackcourse.repos.modeldb.CustomerDB;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/customer")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GreetingResource {

    private static final Logger LOG = Logger.getLogger(GreetingResource.class);

    @Inject
    CustomerRepository customerRepository;

    @DELETE
    @Path("/{customerId}")
    public void deleteCustomer(@PathParam("customerId") Long customerId) {
        LOG.info("User is deleted: " + customerId);
        customerRepository.removeCustomer(customerId);
    }

    @POST
    public void addCustomer(CustomerDB customerDB) {
        LOG.info("User to create" + customerDB);
        customerRepository.addCustomer(customerDB);
    }

    @GET
    public List<CustomerDB> getCustomer() {
        return customerRepository.getAllCustomers();
    }
}
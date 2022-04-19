import entity.Customer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceTest {

   private CustomerService customerService;

    //Mandana Khashayar
    //test initializer
    @Before
    public void initialize(){
         customerService = new CustomerService();
    }

    //Mandana Khashayar
    //tearDown after the test
    @After
    public void tearDown(){
        customerService.reset();
        customerService=null;
    }

    //Author : Mandana Khashayar
    //test getUniqueCustomerIdBasedOnNameAndFamily in CustomerService class
    @Test
    public void testUniqueCustomerIdBasedOnNameAndFamily(){

       String st= customerService.getUniqueCustomerIdBasedOnNameAndFamily("Mandana","Khashayar",0);
        Assert.assertEquals(st,"M0A1N2D3A4N5A6K7H8A9S10H11A12Y13A14R15");
    }

    //Author : Mandana Khashayar
    //test AddNewCustomer in CustomerService class
    @Test
    public void testAddNewCustomer(){
        Customer customer=new Customer();
        customer.setName("Mandana");
        customer.setFamily("Khashayar");
        customer.setUniqueId("M0A1N2D3A4N5A6K7H8A9S10H11A12Y13A14R15");
        customerService.addNewCustomer(customer);
        customerService.getCustomers();
        boolean exist= customerService.getCustomers().stream().anyMatch(c -> "MandanaKhashayar".equals(c.getName()+c.getFamily()))
                ;
        Assert.assertTrue(exist);

    }
    //Author : Mandana Khashayar
    //test count Customers Based On Name And Family in CustomerService class
    @Test
    public void testCountCustomerBasedOnNameAndFamily(){
        Customer customer1=new Customer();
        customer1.setName("Mandana");
        customer1.setFamily("Khashayar");
        customer1.setUniqueId("M0A1N2D3A4N5A6K7H8A9S10H11A12Y13A14R15");
        Customer customer2=new Customer();
        customer2.setName("Mandana");
        customer2.setFamily("Khashayar");
       customer2.setUniqueId("M0A1N2D3A4N5A6K7H8A9S10H11A12Y13A14R15");
        List<Customer> customers =new ArrayList<>();
        customers.add(customer1);
        customers.add(customer1);
        String fullName="MandanaKhashayar";
        long customersNumber= customerService.countCustomerBasedOnNameAndFamily(customers,fullName);
        Assert.assertEquals(2,customersNumber);

    }
    //Author : Mandana Khashayar
    //Integration test to see if new customer with uniqueId is correctly add to the List
    @Test
    public void testCreateCustomerAndAddItToCustomerList(){
        Customer customer1=new Customer();
        customer1.setName("Mandana");
        customer1.setFamily("Khashayar");
        customer1.setUniqueId("M0A1N2D3A4N5A6K7H8A9S10H11A12Y13A14R15");
        customerService.addNewCustomer(customer1);
        Customer customer2=new Customer();
        customer2.setName("Mandana");
        customer2.setFamily("Khashayar");
        long customersNumber= customerService.
                countCustomerBasedOnNameAndFamily(customerService.getCustomers(),customer1.getName()+ customer1.getFamily());
        String uniqueId= customerService.getUniqueCustomerIdBasedOnNameAndFamily(customer1.getName(),customer1.getFamily(),customersNumber);
        customer2.setUniqueId(uniqueId);
        customerService.addNewCustomer(customer2);
        Assert.assertEquals(2,customerService.getCustomers().size());
        Assert.assertEquals("M16A15N14D13A12N11A10K9H8A7S6H5A4Y3A2R1",customerService.getCustomers().get(1).getUniqueId());

    }


}

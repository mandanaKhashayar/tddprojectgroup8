import org.junit.Assert;
import org.junit.Test;
import service.CustomerService;

public class CustomerServiceTest {
    //Author : Mandana Khashayar
    //test getUniqueCustomerIdBasedOnNameAndFamily in CustomerService class
    @Test
    public void testUniqueCustomerIdBasedOnNameAndFamily(){
        CustomerService customer = new CustomerService();
       String st= customer.getUniqueCustomerIdBasedOnNameAndFamily("Mandana","Khashayar",0);
        Assert.assertEquals(st,"M0A1N2D3A4N5A6K7H8A9S10H11A12Y13A14R15");
    }
}

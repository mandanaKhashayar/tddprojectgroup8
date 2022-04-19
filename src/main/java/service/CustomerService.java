package service;

import entity.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class CustomerService {


    private static List<Customer> customers=new ArrayList<>();

    public void reset(){
        customers=new ArrayList<>();
    }

    //Author : Mandana Khashayar
    //Return UniqueCustomerId based on name and family. It adds number between characters
    //in the way that the Id becomes unique
    public String getUniqueCustomerIdBasedOnNameAndFamily(String name, String family, long uniqueNumber) {
        var fullName=name.concat(family).toUpperCase(Locale.ROOT);

        List<Character> arrayList=  fullName.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        StringBuilder uniqueCustomerId
                = new StringBuilder();
        long uniqueIndex=fullName.length()+uniqueNumber-1;
        for(int i=0;i<fullName.length();i++){

            uniqueCustomerId.append(arrayList.get(i)+String.valueOf(uniqueIndex-i));

        }
        return uniqueCustomerId.toString();

    }

    //Author : Mandana Khashayar
    //add customer
    public void addNewCustomer(Customer customer) {
        customers.add(customer);
    }

    //Author : Mandana Khashayar
    //get customer List
    public List<Customer> getCustomers() {
        return customers;
    }

    //Author : Mandana Khashayar
    //count the number of customers in customer List base on Name and Family
    public long countCustomerBasedOnNameAndFamily(List<Customer> customers, String fullName) {
        return customers.stream().filter(c -> fullName.equals(c.getName()+c.getFamily())).count();
    }
}

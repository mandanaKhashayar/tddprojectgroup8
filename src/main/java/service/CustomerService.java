package service;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class CustomerService {
    //Author : Mandana Khashayar
    //Return UniqueCustomerId based on name and family. It adds number between characters
    //in the way that the Id becomes unique
    public String getUniqueCustomerIdBasedOnNameAndFamily(String name, String family, int uniqueNumber) {
        var fullName=name.concat(family).toUpperCase(Locale.ROOT);

        List<Character> arrayList=  fullName.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        StringBuilder uniqueCustomerId
                = new StringBuilder();
        int uniqueIndex;
        for(int i=0;i<fullName.length();i++){
            uniqueIndex=i+uniqueNumber;
            uniqueCustomerId.append(arrayList.get(i)+String.valueOf(uniqueIndex));

        }
        return uniqueCustomerId.toString();

    }
}

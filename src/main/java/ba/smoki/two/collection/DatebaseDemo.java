package ba.smoki.two.collection;

import java.util.List;

public class DatebaseDemo {
    public static void main(String[] args) {
        CustomerDao customerDao = new CustomerDao();
       List<Customer> customerList = customerDao.selectAll();
        for (Customer customer: customerList) {
            System.out.println(customer);

            Container<String> container = new Container<>();
            for(String e : container){


            }

        }
    }
}

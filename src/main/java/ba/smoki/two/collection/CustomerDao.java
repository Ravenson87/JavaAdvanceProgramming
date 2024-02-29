package ba.smoki.two.collection;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Povezacemo se sa bazom
 * <li>
 * Connection -> customers
 * </li>
 */
public class CustomerDao implements Dao<Customer> {

    //jdbc:mysql://hosthome:port/database - Ovo je forma za url
    @Override
    public List<Customer> selectAll() {
        List<Customer> customers = new ArrayList<>();
        try {
            //1. Prvi korak - ostvariti konekciju - Connection
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //2. Drugi korak - Upit ili Statment (takodje ga zovu PreparedStatment ili CallableStatment
            Statement statement = connection.createStatement();
            //3. Treci korak - Dobicu rezultat, odnosno neki set rezultata - Result set -> kolekciju elemenata ili redova iz baze
            ResultSet resultSet = statement.executeQuery("SELECT * FROM customers");
            while(resultSet.next()){
                Long customerId = resultSet.getLong(1); // daj mi prvi red, odnosno "customer_id" (moze stajati i "customer_id" umesto ovog 1 (to me je zbunjivalo, ali sada mi je jasno)
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                LocalDate birthday = resultSet.getDate("birth_date").toLocalDate();
                String phone = resultSet.getString("phone");
                String address= resultSet.getString("address");;
                String city = resultSet.getString("city");
                String state = resultSet.getString("state");
                Integer points = resultSet.getInt("points");
                Customer customer = new Customer(customerId, firstName, lastName, birthday, phone, address, city, state, points);
                customers.add(customer);

            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return customers;
    }

    @Override
    public Customer selectWhere(Long id) {
        return null;

    }


}


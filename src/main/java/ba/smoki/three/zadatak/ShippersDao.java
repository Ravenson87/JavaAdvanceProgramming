package ba.smoki.three.zadatak;

import ba.smoki.three.Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ShippersDao implements Dao<Shippers> {


    @Override
    public void save(Shippers shippers) {

    }

    @Override
    public void update(Shippers shippers) {

    }

    @Override
    public void delete(Shippers shippers) {

    }

    @Override
    public Shippers select(Long id) {
        return null;
    }

    @Override
    public List selectAll() {
        List<Shippers> shippersList = new ArrayList<>();
        // Java 1.7 - try with resource -> try();
        try(Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM shippers");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Long shipperId = resultSet.getLong("shipper_id");
                String name = resultSet.getString("name");
                Shippers shipper = new Shippers();
                shipper.setId(shipperId);
                shipper.setName(name);
                shippersList.add(shipper);
            }


        } catch (SQLException exception) {
            System.out.println(exception.getMessage());

        }
        return shippersList;

    }




}

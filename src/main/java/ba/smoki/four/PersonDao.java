package ba.smoki.four;

import ba.smoki.three.Dao;


import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonDao implements Dao<Person> {
    private static String URL = "jdbc:mysql://localhost:3306/persons";


    @Override
    public void save(Person person) {

    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void delete(Person person) {

    }

    @Override
    public Person select(Long id) {
        return null;
    }

    @Override
    public List<Person> selectAll() {
        List<Person> personList = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, "root", "Mocart1987")) {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM person");
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                Gender gender = resultSet.getString("gender").equals("MALE") ? Gender.MALE : Gender.FEMALE;
                LocalDate birthday = resultSet.getDate("birthday").toLocalDate();

              Person person = new Person(name,surname,gender,birthday);
                personList.add(person);

            }

        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return personList;
    }
}

package ba.smoki.two.collection;

import ba.smoki.three.zadatak.Shippers;

import java.util.List;

/**
 * DAO znaci Data Access Object
 * @param <E>
 */

public interface Dao<E> {

    String URL = "jdbc:mysql://localhost:3306/store";
    String USERNAME = "root";
    String PASSWORD = "Mocart1987";



    List<E> selectAll();

    E selectWhere(Long id);

}

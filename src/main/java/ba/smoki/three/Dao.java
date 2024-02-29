package ba.smoki.three;

import java.util.List;

/**DAO je desing pattern za ostvarivanje CRUD operacija
 * DAO - Data Access Object
 * CRUD - Create, Retrive, Update, Delete
 * @param <E>
 */

/**
 * KORACI U RADU SA BAZOM
 * 1. Konekcija sa bazom
 * 2. SQl izraz(statement) kreirati
 * 3. ResultSet (hocesmo rezultat...)
 * @param <E>
 */
public interface Dao<E> {
    // Polja su u interfejsu po defaultu "public static final", i samo takva mogu postojati

    public static final String URL = "jdbc:mysql://localhost:3306/store";
    String USERNAME = "root";
    String PASSWORD = "Mocart1987";

    /**
     * Create record from object e
     * @param e
     * @return e
     */
    void save(E e);


    /**
     * Update
     * @param e
     */
    void update(E e);

    /**
     * Delete
     * @param e
     */
    void delete(E e);

    /**
     * Retrive
     * @param id
     * @return
     */
    E select(Long id);
    List<E> selectAll();
}

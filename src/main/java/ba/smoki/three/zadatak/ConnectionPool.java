package ba.smoki.three.zadatak;

import ba.smoki.three.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Nekada imamo potrebu da po sablonu neke klase kreiramo jedan OBJEKAT; (Jedan je ELvis, sto bi rekao Puska :-))
 * Taj dizajn patern se zove SINGLTON (to se postize kreiranjem "private" konstruktora
 */

public class ConnectionPool {
    private static int INITIAL_POOL_SIZE = 10;
    private String url;
    private List<Connection> connectionPool = new ArrayList<>(INITIAL_POOL_SIZE);
    private List<Connection> usedConnection = new ArrayList<>();
    private static ConnectionPool INSTANCE = null;


    private ConnectionPool() {
        this(Dao.URL);

        }

    private ConnectionPool(String url) {
        this.url = url;
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            connectionPool.add(createConnection());

        }
    }

        public Connection getConnection(){
        Connection connection = connectionPool.remove(connectionPool.size() - 1);
        usedConnection.add(connection);
        return  connection;
        }

        public int usedConnection(){
        return usedConnection.size();
        }

        public int availibleConnections(){
        return  connectionPool.size();
        }

        public boolean releaseConnection (Connection connection){
        connectionPool.add(connection);
        return usedConnection.remove(connection);
        }



        private Connection createConnection () {
            try {
                Connection connection = DriverManager.getConnection(Dao.URL, Dao.USERNAME, Dao.PASSWORD);
                return connection;
            } catch (SQLException exception) {
                System.out.println(exception.getMessage());
                ;
            }
            return null;
        }

        public static ConnectionPool getConnectionPool () {
        if(INSTANCE == null){
            INSTANCE = new ConnectionPool();
        }
            return INSTANCE;
        }

    public static ConnectionPool getConnectionPool (String url) {
        if(INSTANCE == null){
            INSTANCE = new ConnectionPool(url);
        }
        return INSTANCE;
    }


    }





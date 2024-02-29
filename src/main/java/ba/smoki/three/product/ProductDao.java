package ba.smoki.three.product;

import ba.smoki.three.Dao;
import ba.smoki.three.zadatak.ConnectionPool;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao implements Dao<Product> {
    @Override
    public void save(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public Product select(Long id) {
        return null;
    }

    @Override
    public List<Product> selectAll() {
        List<Product> products = new ArrayList<>();
        try {
            //1. Prvi korak - connection
            ConnectionPool connectionPool = ConnectionPool.getConnectionPool();
            Connection connection = connectionPool.getConnection();
            //2. Drugi korak - SQL statement
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM products");
            //3. Treci korak - Rezultat (ResultSet)
            ResultSet resultSet = statement.executeQuery(); //moze i "getResultSet()" umesto "executedQUery()"
            while (resultSet.next()) {
                Long productId = resultSet.getLong("product_id");
                String name = resultSet.getString("name");
                Integer quantityInStock = resultSet.getInt("quantity_in_stock");
                BigDecimal unitPrice = resultSet.getBigDecimal("unit_price");

                Product product = new Product();
                product.setProductId(productId);
                product.setName(name);
                product.setQuantityInStock(quantityInStock);
                product.setUnitePrice(unitPrice);
                products.add(product);
            }
            connectionPool.releaseConnection(connection);


        } catch (SQLException exception) {
            System.err.println(exception.getMessage());
        }
        return products;
    }

}

package ba.smoki.three.zadatak;

import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
    ShippersDao shippersDao = new ShippersDao();
        List<Shippers> shippersList = shippersDao.selectAll();
        for (Shippers shipper: shippersList) {
            System.out.println(shipper.toString());

        }
    }
}

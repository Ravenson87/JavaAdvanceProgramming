package ba.smoki.three.product;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Product> productsProba = new ArrayList<>();
        Product productProba1 = new Product();
        Product productProba2 = new Product();
        productProba1.setName("Sinisa");
        productProba2.setName("Milica");



        Container<Product> container = new Container (productsProba);
        container.addElement(productProba1);
        container.addElement(productProba2);
        for (Product p: container) {
            System.out.println(p);

        }




    }

}

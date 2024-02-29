package ba.smoki.three.product;

import java.util.*;

/**
 * Klase, apstraktne klase, interfejsi
 * <p>
 *     interfejsi - specijalni interfejsi: FUNKCIONALNI INTERFEJSI - LAMDA OPERATOR (->)
 * </p>
 * <p>
 *     Funkcionalni interfejs - ima SAMO JEDNU apstraktnu metodu (zasto je on pogodan? moze koristiti lamda operator)
 *     Dve vrste interfejsa - "Thick" (sa vise od jedne metode) i "Thin" (samo sa jednom metodom)
 * </p>
 */


public class Demo {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        List<Product> products = productDao.selectAll();
        Set<Product> productSet = new HashSet<>(products);
        productSet = new LinkedHashSet<>(products);
        productSet = new TreeSet<>(products);





        // Ovaj pristup je iz Java 1.7 za iteraciju
        for (Product product : productSet) {
           System.out.println(product.toString());

        }


        ProductConsumer productConsumer = (p) -> System.out.println(p); // ovo je primer Lamda funkcije koja implementira
        //ProductConsumer interfejs... ovo "p" je ime varijable, i odnosi se na Product(kako je definisano u "potpisu metode" ProductConsumer interfejsa
        // Ovo je KREIRANJE OBJEKTA PO SABLONU FUNKCIONALNOG INTERFEJSA
        // Kada kreiramo objekat po sablonu funkcionalnog interfesja, mozemo ga kreirate preko Lamda operatora umesto preko onog "new"
        ProductTester productTester = (p) -> p.getQuantityInStock()>0;
        ProductTransformer productTransformer = p -> {
           return p.getName();
        }; //moze Lamda i ovako sa telom, ali nema potrebe kada ima jednu liniju koda

        // Ovo je pristup iz Jave 1.8 za iteraciju (i ispis) - Ovo se ne zove "Iterator" vec "Spliterator"
       // products.forEach(t -> System.out.println(t));


    }
    private static class ProductConsumerImpl implements ProductConsumer{

        @Override
        public void accept(Product product) {
            System.out.println(product);
        }
    }
}

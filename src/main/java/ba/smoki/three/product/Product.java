package ba.smoki.three.product;

import java.math.BigDecimal;
import java.util.Objects;

public class Product implements Comparable<Product> {
    private Long productId;
    private String name;
    private Integer quantityInStock;
    private BigDecimal unitePrice;

    public Product() {
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public BigDecimal getUnitePrice() {
        return unitePrice;
    }

    public void setUnitePrice(BigDecimal unitePrice) {
        this.unitePrice = unitePrice;
    }
    @Override
    public String toString(){
        return name + " [" + productId + "]";
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Product)){
            return false;
        }
        Product product = (Product) obj;
        return productId == product.getProductId() && name.equals(product.getName());
    }

    public int hashCode(){
        return Objects.hash(productId, name);

    }

    /**
     * compareTO trena da vrati:
     * 0 -> p1 jednak p2
     * -1 -> -1p manji od p2
     * 1 -> p1 veci od p2
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Product o) {
     return productId < o.getProductId() ? -1 : (productId == o.getProductId() ? 0 : 1);
    }
}

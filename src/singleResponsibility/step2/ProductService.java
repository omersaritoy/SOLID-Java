package singleResponsibility.step2;


import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private final  List<Product> products=new ArrayList<>();

    public void addProduct(Product product) {
        if(product.getCategory().isEmpty())
            throw new NullPointerException("Product category is empty");
        else if(product.getPrice()<=0)
            throw new NullPointerException("Product price is empty");

        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}

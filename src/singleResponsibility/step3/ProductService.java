package singleResponsibility.step3;




import singleResponsibility.step3.validations.ValidationTool;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private static List<Product> products = new ArrayList<>();

    public void add(Product product) {
        ValidationTool.productValidation(product);
        products.add(product);
    }


    public List<Product> getAll() {
        return products;
    }
}

package singleResponsibility.step2;

public class Chapter2Application {

    public static void main(String[] args) {
        ProductService productService = new ProductService();

        Product product1 = new Product(1, 15000, "Iphone 13", "Phone");
        Product product2 = new Product(2, 14000, "Samsung S22", "Phone");
        Product product3 = new Product(3, 10000, "Asus Notebook", "Computer");

        productService.addProduct(product1);
        productService.addProduct(product2);
        productService.addProduct(product3);

        for (Product product : productService.getProducts()) {
            System.out.println(product.toString());
        }
    }
}

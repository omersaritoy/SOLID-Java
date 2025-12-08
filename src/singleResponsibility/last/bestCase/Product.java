package singleResponsibility.last.bestCase;

public class Product {
    private final int id;
    private final int price;
    private final String name;
    private final String category;


    public Product(int id, int price, String name, String category) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}

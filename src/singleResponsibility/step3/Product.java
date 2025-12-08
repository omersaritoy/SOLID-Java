package singleResponsibility.step3;

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

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "id: " + id +
                "\nprice: " + price +
                "\nname: " + name +
                "\ncategory: " + category +
                "\n------------------------";
    }
}
package entity;

public class Product {
    public String name;
    public String link;
    public int cost;
    public boolean sale;

    public Product(String name, String link, int cost, boolean sale) {
        this.name = name;
        this.link = link;
        this.cost = cost;
        this.sale = sale;
    }
}

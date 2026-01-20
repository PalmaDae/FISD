package entity;

public class Tovar {
    public int id;
    public String name;
    public int cost;
    public Category category;

    public Tovar(int id, String name, int cost, Category category) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.category = category;
    }
}

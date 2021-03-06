package model;

import java.util.Objects;

public class Beverage {
    private String id;
    private String name;
    private double price;

    public Beverage(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beverage beverage = (Beverage) o;
        return Double.compare(beverage.price, price) == 0 && id.equals(beverage.id) && name.equals(beverage.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }
}

package Model;

import java.util.*;

public class Product {
    private final Long articleNumber;
    private String title;
    private double price;

    public Product(Long articleNumber, String title, double price) {
        this.articleNumber = articleNumber;
        this.title = title;
        this.price = price;
    }

    public Long articleNumber() {
        return articleNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(articleNumber, product.articleNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleNumber);
    }

    @Override
    public String toString() {
        return String.format("%s - $%.2f", title, price);
    }
}

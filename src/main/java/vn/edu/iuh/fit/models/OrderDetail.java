package vn.edu.iuh.fit.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "order_detail")
public class OrderDetail {
    @Id
    @ManyToOne
    @JoinColumn(referencedColumnName = "order_id",nullable = false)
    private Order orders;
    @Id
    @ManyToOne
    @JoinColumn(referencedColumnName = "product_id",nullable = false)
    private Product product;
    @Column(nullable = false)
    private Double quantity;
    @Column(nullable = false)
    private Double price;
    @Column(columnDefinition = "varchar(255)", nullable = true)
    private String note;

    public OrderDetail() {
    }

    public OrderDetail(Order orders, Product product) {
        this.orders = orders;
        this.product = product;
    }

    public OrderDetail(Order orders, Product product, Double quantity, Double price, String note) {
        this.orders = orders;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.note = note;
    }

    public Order getOrders() {
        return orders;
    }

    public void setOrders(Order orders) {
        this.orders = orders;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetail that = (OrderDetail) o;
        return Objects.equals(orders, that.orders) && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders, product);
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orders=" + orders +
                ", product=" + product +
                ", quantity=" + quantity +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }
}

package vn.edu.iuh.fit.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "product_price")
public class ProductPrice {
    @Id
    @ManyToOne
    @JoinColumn(referencedColumnName = "product_id",nullable = false)
    private Product product;
    @Id
    @Column(name = "price_date_time",columnDefinition = "datetime(6)",nullable = false)
    private LocalDateTime priceDateTime;
    @Column(columnDefinition = "double",nullable = false)
    private Double price;
    @Column(columnDefinition = "varchar(255)",nullable = true)
    private String note;

    public ProductPrice() {
    }

    public ProductPrice(Product product, LocalDateTime priceDateTime) {
        this.product = product;
        this.priceDateTime = priceDateTime;
    }

    public ProductPrice(Product product, LocalDateTime priceDateTime, Double price, String note) {
        this.product = product;
        this.priceDateTime = priceDateTime;
        this.price = price;
        this.note = note;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public LocalDateTime getPriceDateTime() {
        return priceDateTime;
    }

    public void setPriceDateTime(LocalDateTime priceDateTime) {
        this.priceDateTime = priceDateTime;
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
    public String toString() {
        return "ProductPrice{" +
                "product=" + product +
                ", priceDateTime=" + priceDateTime +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductPrice that = (ProductPrice) o;
        return Objects.equals(product, that.product) && Objects.equals(priceDateTime, that.priceDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, priceDateTime);
    }
}

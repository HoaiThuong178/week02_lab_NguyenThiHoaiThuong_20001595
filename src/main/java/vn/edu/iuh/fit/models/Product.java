package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import vn.edu.iuh.fit.enums.ProductStatus;

import java.util.List;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "product_id",columnDefinition = "bigint(20)",nullable = false)
    private long id;
    @Column(columnDefinition = "varchar(150)",nullable = false)
    private String name;
    @Column(columnDefinition = "varchar(250)",nullable = false)
    private String decription;
    @Column(columnDefinition = "varchar(25)",nullable = false)
    private String unit;
    @Column(name = "manufacturer_name",columnDefinition = "varchar(100)",nullable = false)
    private String manufacturerName;
    @Column(columnDefinition = "int(11)",nullable = true)
    private ProductStatus status;

    @OneToMany(mappedBy = "product")
    private List<ProductImage> productImages;
    @OneToMany(mappedBy = "product")
    private List<OrderDetail> orderDetails;
    public Product() {
    }

    public Product(long id) {
        this.id = id;
    }

    public Product(long id, String name, String decription, String unit, String manufacturerName, ProductStatus status) {
        this.id = id;
        this.name = name;
        this.decription = decription;
        this.unit = unit;
        this.manufacturerName = manufacturerName;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", decription='" + decription + '\'' +
                ", unit='" + unit + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", status=" + status +
                '}';
    }
}

package vn.edu.iuh.fit.models;

import jakarta.persistence.*;

@Entity
@Table(name = "product_image")
public class ProductImage {
    @ManyToOne
    @JoinColumn(name = "product_id",referencedColumnName = "product_id")
    private Product product;
    @Id
    @Column(name = "image_id",columnDefinition = "bigint(20)",nullable = false)
    private long imageId;
    @Column(columnDefinition = "varchar(250)",nullable = false)
    private String path;
    @Column(columnDefinition = "varchar(250)",nullable = true)
    private String alternative;

    public ProductImage() {
    }

    public ProductImage(long imageId) {
        this.imageId = imageId;
    }

    public ProductImage(Product product, long imageId, String path, String alternative) {
        this.product = product;
        this.imageId = imageId;
        this.path = path;
        this.alternative = alternative;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public long getImageId() {
        return imageId;
    }

    public void setImageId(long imageId) {
        this.imageId = imageId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getAlternative() {
        return alternative;
    }

    public void setAlternative(String alternative) {
        this.alternative = alternative;
    }

    @Override
    public String toString() {
        return "ProductImage{" +
                "product=" + product +
                ", imageId=" + imageId +
                ", path='" + path + '\'' +
                ", alternative='" + alternative + '\'' +
                '}';
    }
}

package vn.edu.iuh.fit.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "cust_id",columnDefinition = "bigint(20)",nullable = false)
    private long id;
    @Column(name = "cust_name", columnDefinition = "varchar(150)",nullable = false)
    private String custName;
    @Column(columnDefinition = "varchar(150)",nullable = true)
    private String email;
    @Column(columnDefinition = "varchar(15)",nullable = false)
    private String phone;
    @Column(columnDefinition = "varchar(250)",nullable = false)
    private String address;
    @OneToMany(mappedBy = "customer")
    private List<Order> orders;
    public Customer() {
    }

    public Customer(long id, String custName, String email, String phone, String address) {
        this.id = id;
        this.custName = custName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public Customer(long id) {

        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", custName='" + custName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

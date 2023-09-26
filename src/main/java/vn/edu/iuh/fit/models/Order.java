package vn.edu.iuh.fit.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "order_id", columnDefinition = "bigint(20)",nullable = false)
    private long id;
    @Column(name = "order_date",columnDefinition = "datetime(6)", nullable = false)
    private LocalDateTime orderDate;
    @ManyToOne
    @JoinColumn(referencedColumnName = "cust_id",nullable = true)
    private Customer customer;
    @ManyToOne
    @JoinColumn(referencedColumnName = "emp_id",nullable = false)
    private Employee employee;
    @OneToMany(mappedBy = "orders")
    private List<OrderDetail> orderDetails ;
    public Order() {
    }

    public Order(long id) {
        this.id = id;
    }

    public Order(long id, LocalDateTime orderDate, Customer customer, Employee employee) {
        this.id = id;
        this.orderDate = orderDate;
        this.customer = customer;
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", customer=" + customer +
                ", employee=" + employee +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}

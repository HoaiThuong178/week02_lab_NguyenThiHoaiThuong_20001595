package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import vn.edu.iuh.fit.enums.EmployeeStatus;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "emp_id", columnDefinition = "bigint(20)", nullable = false)
    private long id;
    @Column(name = "full_name",columnDefinition = "varchar(150)",nullable = false)
    private String fullName;
    @Column(columnDefinition = "datetime(6)",nullable = false)
    private LocalDateTime dob;
    @Column(columnDefinition = "varchar(150)",nullable = true)
    private String email;
    @Column(columnDefinition = "varchar(15)",nullable = false)
    private String phone;
    @Column(columnDefinition = "varchar(250)",nullable = false)
    private String address;
    @Column(columnDefinition = "int(11)",nullable = false)
    private EmployeeStatus status;
    @OneToMany(mappedBy = "employee")
    private List<Order> orders;

    public Employee() {
    }

    public Employee(long id) {
        this.id = id;
    }

    public Employee(long id, String fullName, LocalDateTime dob, String email, String phone, String address, EmployeeStatus status) {
        this.id = id;
        this.fullName = fullName;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
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

    public EmployeeStatus getStatus() {
        return status;
    }

    public void setStatus(EmployeeStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", status=" + status +
                '}';
    }
}

package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long id;

    @Column(name="email", length=50, nullable=true, unique=true)
    String email;

    @Column(name="address", length=50, nullable=true, unique=false)
    String address;

    public Customer(long id, String email, String address) {
        this.id = id;
        this.email = email;
        this.address = address;
    }

    public Customer() {
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

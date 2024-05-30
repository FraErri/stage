package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Pallet")
public class Pallet {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;
    @Column(name="desc", length=50, nullable=true, unique=false)
    String desc;
    @Column(name="max_packages", length=50, nullable=false, unique=false)
    int max_packages;

    public Pallet(long id, String desc, int max_packages) {
        this.id = id;
        this.desc = desc;
        this.max_packages = max_packages;
    }

    public Pallet() {
        id = 0;
        desc = "";
        max_packages = 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getMax_packages() {
        return max_packages;
    }

    public void setMax_packages(int max_packages) {
        this.max_packages = max_packages;
    }

    @Override
    public String toString() {
        return "Pallet{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", max_packages=" + max_packages +
                '}';
    }
}

package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Package")
public class Package {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long id;

    @Column(name="desc", length=50, nullable=true, unique=false)
    String desc;
    @Column(name="weight", length=50, nullable=true, unique=false)
    float weight;

    @Column(name="id_pallet", length=50, nullable=true, unique=false)
    long palletId;

    public Package(long id, String desc, float weight, long palletId) {
        this.id = id;
        this.desc = desc;
        this.weight = weight;
        this.palletId = palletId;
    }

    public Package() {
        id = 0;
        desc = "";
        weight = 0;
        palletId = 0;
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

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public long getPalletId() {
        return palletId;
    }

    public void setPalletId(long palletId) {
        this.palletId = palletId;
    }

    @Override
    public String toString() {
        return "Package{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", weight=" + weight +
                ", id_pallet=" + palletId +
                '}';
    }
}

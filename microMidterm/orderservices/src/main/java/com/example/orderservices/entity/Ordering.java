package com.example.orderservices.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Ordering {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;
    private String pName;
    private String pCategory;
    private String pDescription;
    private double pQuantity;
    private String imageUrl;
    private double pPrice;
    private double totalPrice;
    private LocalDate date;
    private String address;
    private String city;
    private String state;
    private String pinCode;

    public Ordering() {
    }

    public Ordering(long orderId, String pName, String pCategory, String pDescription, double pQuantity, String imageUrl, double pPrice, double totalPrice, LocalDate date, String address, String city, String state, String pinCode) {
        this.orderId = orderId;
        this.pName = pName;
        this.pCategory = pCategory;
        this.pDescription = pDescription;
        this.pQuantity = pQuantity;
        this.imageUrl = imageUrl;
        this.pPrice = pPrice;
        this.totalPrice = totalPrice;
        this.date = date;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpCategory() {
        return pCategory;
    }

    public void setpCategory(String pCategory) {
        this.pCategory = pCategory;
    }

    public String getpDescription() {
        return pDescription;
    }

    public void setpDescription(String pDescription) {
        this.pDescription = pDescription;
    }

    public double getpQuantity() {
        return pQuantity;
    }

    public void setpQuantity(double pQuantity) {
        this.pQuantity = pQuantity;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public double getpPrice() {
        return pPrice;
    }

    public void setpPrice(double pPrice) {
        this.pPrice = pPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", pName='" + pName + '\'' +
                ", pCategory='" + pCategory + '\'' +
                ", pDescription='" + pDescription + '\'' +
                ", pQuantity=" + pQuantity +
                ", imageUrl='" + imageUrl + '\'' +
                ", pPrice=" + pPrice +
                ", totalPrice=" + totalPrice +
                ", date=" + date +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ordering myOrder = (Ordering) o;
        return orderId == myOrder.orderId && Objects.equals(pName, myOrder.pName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, pName);
    }
}

package com.restaturant.api.booking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        RestaurantName = restaurantName;
    }

    public String getFoodType() {
        return FoodType;
    }

    public void setFoodType(String foodType) {
        FoodType = foodType;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getNoOfFood() {
        return noOfFood;
    }

    public void setNoOfFood(String noOfFood) {
        this.noOfFood = noOfFood;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long orderId;
    private String customerName;
    private String RestaurantName;
    private String FoodType;
    private String Date;
    private String noOfFood;

}

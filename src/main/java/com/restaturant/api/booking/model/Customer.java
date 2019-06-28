package com.restaturant.api.booking.model;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "LOGIN_ID")
    private Long loginId;

    @Column(name = "CUSTOMER_NAME")
    private String customerName;

    @Column(name = "CUSTOMER_PASSWORD")
    private String customerPassword;
    private String customerPhoneno;
    private String customerEmail;
    private String customerAddress;
    private String customerPin;

   /* @ManyToMany
    @JoinTable(name = "location",
            joinColumns = @JoinColumn(name = "loginId"),
            inverseJoinColumns = @JoinColumn(name = "restId"))
    private List<Rest> rests;
*/
    public Long getLoginId() {
        return loginId;
    }
/*
    public List<Rest> getRests() {
        return rests;
    }

    public void setRests(List<Rest> rests) {
        this.rests = rests;
    }*/

    public void setLoginId(Long loginId) {
        this.loginId = loginId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public String getCustomerPhoneno() {
        return customerPhoneno;
    }

    public void setCustomerPhoneno(String customerPhoneno) {
        this.customerPhoneno = customerPhoneno;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerPin() {
        return customerPin;
    }

    public void setCustomerPin(String customerPin) {
        this.customerPin = customerPin;
    }
}

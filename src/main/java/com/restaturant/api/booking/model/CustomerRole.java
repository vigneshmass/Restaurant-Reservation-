package com.restaturant.api.booking.model;

import javax.persistence.*;

@Entity
public class CustomerRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

   /* @ManyToOne
    @JoinColumn(name = "login_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   /* public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }*/
}

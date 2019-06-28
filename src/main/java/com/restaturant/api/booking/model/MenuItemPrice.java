package com.restaturant.api.booking.model;

import javax.persistence.*;

@Entity
public class MenuItemPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long priceId;
    private String price;



    /*@ManyToOne
    @JoinColumn(name = "rest_id")
    private  Rest rest;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

    @ManyToOne
    @JoinColumn(name = "menu_item_id")
    private MenuItem menuItem;

     */

    public Long getPriceId() {
        return priceId;
    }

    public void setPriceId(Long priceId) {
        this.priceId = priceId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }



   /* public MenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    */
}

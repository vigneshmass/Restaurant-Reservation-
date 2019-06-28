package com.restaturant.api.booking.model;

import javax.persistence.*;

@Entity
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long manuItemId;
    private String foodName;

    @ManyToOne

    @JoinColumn(name = "menu_item_id")
    private Menu menu;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
// @OneToMany

    //private List<MenuItemPrice> menuItemPrices=new ArrayList<MenuItemPrice>();

    public Long getManuItemId() {
        return manuItemId;
    }

    public void setManuItemId(Long manuItemId) {
        this.manuItemId = manuItemId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

  /*  public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public List<MenuItemPrice> getMenuItemPrices() {
        return menuItemPrices;
    }

    public void setMenuItemPrices(List<MenuItemPrice> menuItemPrices) {
        this.menuItemPrices = menuItemPrices;
    }*/
}




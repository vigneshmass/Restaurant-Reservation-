package com.restaturant.api.booking.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long menuId;

    private String menuItems;
    private Time  startTime;
    private  Time endTime;

    public String getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(String menuItems) {
        this.menuItems = menuItems;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public void setMenuItem(List<MenuItem> menuItem) {
        this.menuItem = menuItem;
    }

    @OneToMany

    @JoinColumn(name = "menu_item_id")
    private List<MenuItem> menuItem;

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getMenuItem() {
        return menuItems;
    }

    public void setMenuItem(String menuItem) {
        this.menuItems = menuItem;
    }
}
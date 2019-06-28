package com.restaturant.api.booking.model;

import javax.persistence.*;

@Entity
public class Rest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long restId;
    private String restName;
    private String restAddress;

    private String restType;

    private String restRegion;
    private  String restArea;
    private  String  restPin;
    private  String restimg;
    @ManyToOne
    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getRestimg() {
        return restimg;
    }

    public void setRestimg(String restimg) {
        this.restimg = restimg;
    }

    public Long getRestId() {
        return restId;
    }

    public void setRestId(Long restId) {
        this.restId = restId;
    }



    public String getRestRegion() {
        return restRegion;
    }

    public void setRestRegion(String restRegion) {
        this.restRegion = restRegion;
    }

    public String getRestArea() {
        return restArea;
    }

    public void setRestArea(String restArea) {
        this.restArea = restArea;
    }

    public String getRestPin() {
        return restPin;
    }

    public void setRestPin(String restPin) {
        this.restPin = restPin;
    }
/* @ManyToOne
    //@JoinColumn(name = "locationId", referencedColumnName = "locationId")
    private Location location;
   /* @OneToMany
    private List<Menu> menu= new ArrayList<Menu>();

    */


    public String getRestType() {
        return restType;
    }

    public void setRestType(String restType) {
        this.restType = restType;
    }

   /* public List<Menu> getMenu() {
        return menu;
    }

    public void setMenu(List<Menu> menu) {
        this.menu = menu;
    }

    */



    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public String getRestAddress() {
        return restAddress;
    }

    public void setRestAddress(String restAddress) {
        this.restAddress = restAddress;
    }



  /*  public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

   */
}
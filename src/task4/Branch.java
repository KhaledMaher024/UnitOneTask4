/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

/**
 *
 * @author GP65
 */
public abstract class Branch {

    private Employee manager;
    private double lats;
    private double lngs;
    private String cityName;
    private String contactPhone;
    private Brand brand;

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public double getLats() {
        return lats;
    }

    public void setLats(double lats) {
        this.lats = lats;
    }

    public double getLngs() {
        return lngs;
    }

    public void setLngs(double lngs) {
        this.lngs = lngs;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

}

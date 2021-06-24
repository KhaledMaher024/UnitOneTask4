/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

import java.util.ArrayList;

/**
 *
 * @author GP65
 */
public class Company {

    private static Company companyInstance = null;

    private Company() {
    }

    private String companyCode;
    private String name;
    private String logoURL;
    private ArrayList<Brand> brands;
    private Employee manager;
    private ArrayList<Employee> board;

    //Singelton Design Pattern 
    //Checks if the company has been instantiated or not
    //if yes , return the instance variable , if not , it create a newCompany Instance and then return it
    public static Company getCompanyInstance() {
        if(companyInstance == null){
            companyInstance = new Company();
        }
        return companyInstance;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoURL() {
        return logoURL;
    }

    public void setLogoURL(String logoURL) {
        this.logoURL = logoURL;
    }

    public ArrayList<Brand> getBrands() {
        return brands;
    }

    public void setBrands(ArrayList<Brand> brands) {
        this.brands = brands;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public ArrayList<Employee> getBoard() {
        return board;
    }

    public void setBoard(ArrayList<Employee> board) {
        this.board = board;
    }

}

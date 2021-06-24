/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

import java.util.Date;

/**
 *
 * @author GP65
 */
public class Person {

    private String firstName;
    private String lastName;
    private String Nationality;
    private String IDNumber;
    private Gender gender;
    private Date dateOfBirth;

    public Person(String firstName, String lastName, String Nationality, String IDNumber, Gender gender, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Nationality = Nationality;
        this.IDNumber = IDNumber;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public Person() {
    }

    
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}

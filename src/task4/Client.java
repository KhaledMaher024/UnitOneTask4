/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author GP65
 */
public class Client extends Person {
    private ArrayList<Project> projects ;

    public Client(String firstName, String lastName, String Nationality, String IDNumber, Gender gender, Date dateOfBirth , ArrayList<Project> projects) {
        super(firstName, lastName, Nationality, IDNumber, gender, dateOfBirth);
        this.projects = projects;
    }

    public Client() {
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }
    
}

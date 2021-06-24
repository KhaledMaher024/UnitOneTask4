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
public class Developer extends Employee {

    private Technology technology;
    private ArrayList<Project> assignedProjects;

    public Technology getTechnology() {
        return technology;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }

    public ArrayList<Project> getAssignedProjects() {
        return assignedProjects;
    }

    public void setAssignedProjects(ArrayList<Project> assignedProjects) {
        this.assignedProjects = assignedProjects;
    }

    public static class DeveloperBuilder extends EmployeeBuilder {

        private Technology technology;
        private ArrayList<Project> assignedProjects;

        public DeveloperBuilder withFinRecords(FinancialRecords finRecords) {
            return (DeveloperBuilder) super.setFinRecords(finRecords); //To change body of generated methods, choose Tools | Templates.
        }

        public DeveloperBuilder withPassword(String password) {
            return (DeveloperBuilder) super.setPassword(password); //To change body of generated methods, choose Tools | Templates.
        }

        public DeveloperBuilder withUsername(String username) {
            return (DeveloperBuilder) super.setUsername(username); //To change body of generated methods, choose Tools | Templates.
        }

        public DeveloperBuilder withCalendar(EmployeeCalendar calendar) {
            return (DeveloperBuilder) super.setCalendar(calendar); //To change body of generated methods, choose Tools | Templates.
        }

        public DeveloperBuilder withDurationType(ContractDuration durationType) {
            return (DeveloperBuilder) super.setDurationType(durationType); //To change body of generated methods, choose Tools | Templates.
        }

        public DeveloperBuilder withContractDuration(int contractDuration) {
            return (DeveloperBuilder) super.setContractDuration(contractDuration); //To change body of generated methods, choose Tools | Templates.
        }

        public DeveloperBuilder withHireDate(Date hireDate) {
            return (DeveloperBuilder) super.setHireDate(hireDate); //To change body of generated methods, choose Tools | Templates.
        }

        public DeveloperBuilder withScore(int score) {
            return (DeveloperBuilder) super.setScore(score); //To change body of generated methods, choose Tools | Templates.
        }

        public DeveloperBuilder withRaise(Raise raise) {
            return (DeveloperBuilder) super.setRaise(raise); //To change body of generated methods, choose Tools | Templates.
        }

        public DeveloperBuilder withBasicSalary(float basicSalary) {
            return (DeveloperBuilder) super.setBasicSalary(basicSalary); //To change body of generated methods, choose Tools | Templates.
        }

        public DeveloperBuilder withEmpID(int empID) {
            return (DeveloperBuilder) super.setEmpID(empID); //To change body of generated methods, choose Tools | Templates.
        }

        public DeveloperBuilder withDateOfBirth(Date dateOfBirth) {
            return (DeveloperBuilder) super.setDateOfBirth(dateOfBirth); //To change body of generated methods, choose Tools | Templates.
        }

        public DeveloperBuilder withGender(Gender gender) {
            return (DeveloperBuilder) super.setGender(gender); //To change body of generated methods, choose Tools | Templates.
        }

        public DeveloperBuilder withIDNumber(String IDNumber) {
            return (DeveloperBuilder) super.setIDNumber(IDNumber); //To change body of generated methods, choose Tools | Templates.
        }

        public DeveloperBuilder withNationality(String Nationality) {
            return (DeveloperBuilder) super.setNationality(Nationality); //To change body of generated methods, choose Tools | Templates.
        }

        public DeveloperBuilder withLastName(String lastName) {
            return (DeveloperBuilder) super.setLastName(lastName); //To change body of generated methods, choose Tools | Templates.
        }

        public DeveloperBuilder withFirstName(String firstName) {
            return (DeveloperBuilder) super.setFirstName(firstName); //To change body of generated methods, choose Tools | Templates.
        }

        public DeveloperBuilder withTechnology(Technology technology) {
            this.technology = technology;
            return this;
        }

        public DeveloperBuilder withAssignedProjects(ArrayList<Project> assignedProjects) {
            this.assignedProjects = assignedProjects;
            return this;

        }

        public Developer build() {
            Developer dev = new Developer();
            super.build();
            dev.assignedProjects = this.assignedProjects;
            dev.technology = this.technology;
            return dev;
        }

    }

    @Override
    public String toString() {
        
        return super.toString()+"Developer{" + "technology=" + technology + ", assignedProjects=" + assignedProjects + '}';
    }
    
}

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
public class Administrative extends Employee {

    private AdminRole role;

    public AdminRole getRole() {
        return role;
    }

    public void setRole(AdminRole role) {
        this.role = role;
    }

    public class AdministrativeBuilder extends EmployeeBuilder {

        private AdminRole role;

        public Administrative build() {
            Administrative admin = new Administrative();
            super.build();
            admin.role = this.role;
            return admin;
        }

        public AdministrativeBuilder withFinRecords(FinancialRecords finRecords) {
            return (AdministrativeBuilder) super.setFinRecords(finRecords); //To change body of generated methods, choose Tools | Templates.
        }

        public AdministrativeBuilder withPassword(String password) {
            return (AdministrativeBuilder) super.setPassword(password); //To change body of generated methods, choose Tools | Templates.
        }

        public AdministrativeBuilder withUsername(String username) {
            return (AdministrativeBuilder) super.setUsername(username); //To change body of generated methods, choose Tools | Templates.
        }

        public AdministrativeBuilder withCalendar(EmployeeCalendar calendar) {
            return (AdministrativeBuilder) super.setCalendar(calendar); //To change body of generated methods, choose Tools | Templates.
        }

        public AdministrativeBuilder withDurationType(ContractDuration durationType) {
            return (AdministrativeBuilder) super.setDurationType(durationType); //To change body of generated methods, choose Tools | Templates.
        }

        public AdministrativeBuilder withContractDuration(int contractDuration) {
            return (AdministrativeBuilder) super.setContractDuration(contractDuration); //To change body of generated methods, choose Tools | Templates.
        }

        public AdministrativeBuilder withHireDate(Date hireDate) {
            return (AdministrativeBuilder) super.setHireDate(hireDate); //To change body of generated methods, choose Tools | Templates.
        }

        public AdministrativeBuilder withScore(int score) {
            return (AdministrativeBuilder) super.setScore(score); //To change body of generated methods, choose Tools | Templates.
        }

        public AdministrativeBuilder withRaise(Raise raise) {
            return (AdministrativeBuilder) super.setRaise(raise); //To change body of generated methods, choose Tools | Templates.
        }

        public AdministrativeBuilder withBasicSalary(float basicSalary) {
            return (AdministrativeBuilder) super.setBasicSalary(basicSalary); //To change body of generated methods, choose Tools | Templates.
        }

        public AdministrativeBuilder withEmpID(int empID) {
            return (AdministrativeBuilder) super.setEmpID(empID); //To change body of generated methods, choose Tools | Templates.
        }

        public AdministrativeBuilder withDateOfBirth(Date dateOfBirth) {
            return (AdministrativeBuilder) super.setDateOfBirth(dateOfBirth); //To change body of generated methods, choose Tools | Templates.
        }

        public AdministrativeBuilder withGender(Gender gender) {
            return (AdministrativeBuilder) super.setGender(gender); //To change body of generated methods, choose Tools | Templates.
        }

        public AdministrativeBuilder withIDNumber(String IDNumber) {
            return (AdministrativeBuilder) super.setIDNumber(IDNumber); //To change body of generated methods, choose Tools | Templates.
        }

        public AdministrativeBuilder withNationality(String Nationality) {
            return (AdministrativeBuilder) super.setNationality(Nationality); //To change body of generated methods, choose Tools | Templates.
        }

        public AdministrativeBuilder withLastName(String lastName) {
            return (AdministrativeBuilder) super.setLastName(lastName); //To change body of generated methods, choose Tools | Templates.
        }

        public AdministrativeBuilder withFirstName(String firstName) {
            return (AdministrativeBuilder) super.setFirstName(firstName); //To change body of generated methods, choose Tools | Templates.
        }

        public AdministrativeBuilder withRole(AdminRole role) {
            this.role = role;
            return this ;
        }
        
        

    }

    @Override
    public String toString() {
        return super.toString() + " role : "+this.role; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

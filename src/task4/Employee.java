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
public class Employee extends Person {

    private int empID;
    private float basicSalary;
    private Raise raise;
    private int score;
    private Date hireDate;
    private int contractDuration;
    private ContractDuration durationType;
    private EmployeeCalendar calendar;
    private String username;
    private String password;
    private FinancialRecords finRecords;

    public Employee() {

    }

    public static class EmployeeBuilder {

        private String firstName;
        private String lastName;
        private String Nationality;
        private String IDNumber;
        private Gender gender;
        private Date dateOfBirth;
        private int empID;
        private float basicSalary;
        private Raise raise;
        private int score;
        private Date hireDate;
        private int contractDuration;
        private ContractDuration durationType;
        private EmployeeCalendar calendar;
        private String username;
        private String password;
        private FinancialRecords finRecords;

        public EmployeeBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public EmployeeBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public EmployeeBuilder setNationality(String Nationality) {
            this.Nationality = Nationality;
            return this;
        }

        public EmployeeBuilder setIDNumber(String IDNumber) {
            this.IDNumber = IDNumber;
            return this;
        }

        public EmployeeBuilder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public EmployeeBuilder setDateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        
        
        public EmployeeBuilder setEmpID(int empID) {
            this.empID = empID;
            return this;
        }

        public EmployeeBuilder setBasicSalary(float basicSalary) {
            this.basicSalary = basicSalary;
            return this;
        }

        public EmployeeBuilder setRaise(Raise raise) {
            this.raise = raise;
            return this;
        }

        public EmployeeBuilder setScore(int score) {
            this.score = score;
            return this;
        }

        public EmployeeBuilder setHireDate(Date hireDate) {
            this.hireDate = hireDate;
            return this;
        }

        public EmployeeBuilder setContractDuration(int contractDuration) {
            this.contractDuration = contractDuration;
            return this;
        }

        public EmployeeBuilder setDurationType(ContractDuration durationType) {
            this.durationType = durationType;
            return this;
        }

        public EmployeeBuilder setCalendar(EmployeeCalendar calendar) {
            this.calendar = calendar;
            return this;
        }

        public EmployeeBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public EmployeeBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public EmployeeBuilder setFinRecords(FinancialRecords finRecords) {
            this.finRecords = finRecords;
            return this;
        }

 

        public Employee build() {
            Employee emp = new Employee();
            emp.setFirstName(firstName);
            emp.setLastName(lastName);
            emp.setNationality(Nationality);
            emp.setGender(gender);
            emp.setDateOfBirth(dateOfBirth);
            emp.setIDNumber(IDNumber);
            emp.empID = this.empID;
            emp.empID = this.empID;
            emp.empID = this.empID;
            emp.basicSalary = this.basicSalary;
            emp.raise = this.raise;
            emp.score = this.score;
            emp.hireDate = this.hireDate;
            emp.contractDuration = this.contractDuration;
            emp.durationType = this.durationType;
            emp.calendar = this.calendar;
            emp.username = this.username;
            emp.password = this.password;
            emp.finRecords = this.finRecords;
            return emp;
        }

    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Raise getRaise() {
        return raise;
    }

    public void setRaise(Raise raise) {
        this.raise = raise;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public int getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(int contractDuration) {
        this.contractDuration = contractDuration;
    }

    public ContractDuration getDurationType() {
        return durationType;
    }

    public void setDurationType(ContractDuration durationType) {
        this.durationType = durationType;
    }

    public EmployeeCalendar getCalendar() {
        return calendar;
    }

    public void setCalendar(EmployeeCalendar calendar) {
        this.calendar = calendar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public FinancialRecords getFinRecords() {
        return finRecords;
    }

    public void setFinRecords(FinancialRecords finRecords) {
        this.finRecords = finRecords;
    }

    @Override
    public String toString() {
        return "Employee{" + "empID=" + empID + ", basicSalary=" + basicSalary + ", raise=" + raise + ", score=" + score + ", hireDate=" + hireDate + ", contractDuration=" + contractDuration + ", durationType=" + durationType + ", calendar=" + calendar + ", username=" + username + ", password=" + password + ", finRecords=" + finRecords + '}';
    }

    
    
}

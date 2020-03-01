/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeauca;

/**
 *
 * @author jackson
 */
public class EmployeeAUCA {

    private String Fname;
    private String Lname;
    private double wage;
    private int year;

    public EmployeeAUCA(String Fname, String Lname, double wage, int year) {
        this.Fname = Fname;
        this.Lname = Lname;
        this.wage = wage;
        this.year = year;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}

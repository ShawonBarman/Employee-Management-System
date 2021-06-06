package myemployeeproject;

import java.io.Serializable;

public class SalariedEmployee extends Employee implements Serializable {
    public double monthlySalary;

    public SalariedEmployee(String name,String id,String designation,double monthlySalary){
        super(name,id,designation);
        this.monthlySalary=monthlySalary;
    }
    public void increaseSalary(double amt) throws InvalidSalaryException {
        if(amt<0){
            throw new InvalidSalaryException("Increase Amount should be a positive number!");
        }
        monthlySalary+=amt;

    }
    public  double getSalary(){
        return monthlySalary;
    }
    public void display(){
        super.display();
        System.out.println("Monthly Salary: "+monthlySalary);
    }
}


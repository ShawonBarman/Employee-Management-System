package myemployeeproject;

import java.io.Serializable;

public class HourlyEmployee extends Employee implements Serializable {

    public double hourlyRate;
    public int hourlyWorked;

    public HourlyEmployee(String name, String id, String designation, double hourlyRate, int hourlyWorked) {
        super(name, id, designation);
        this.hourlyRate = hourlyRate;
        this.hourlyWorked = hourlyWorked;
    }

    public double getSalary(int hWorked) {
        return hWorked * hourlyRate;
    }

    public void increaseSalary(double amt) throws InvalidSalaryException {
        if ((hourlyRate + amt) <= 500) {
            hourlyRate += amt;
        } else {
            throw new InvalidSalaryException("Hourly rate more than 500!");
        }

    }

    public double getSalary() {
        return hourlyWorked * hourlyRate;
    }

    public void display() {
        super.display();
        System.out.println("Hourly rate :" + hourlyRate);

    }
}

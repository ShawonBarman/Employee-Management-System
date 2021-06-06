
package myemployeeproject;

import java.io.Serializable;

public class CommissionEmployee extends Employee implements Serializable  {

    double commission, sale;

    public CommissionEmployee(String name, String id, String designation, double commission, double sale) {
        super(name, id, designation);
        this.commission = commission;
        this.sale = sale;
    }

    double getSalary(double _sale) {
        return (commission/100) * _sale;
    }

    @Override
    public void increaseSalary(double amt) throws InvalidSalaryException {
        if (commission + amt <= .3) {
            commission += amt;
        } else {
            throw new InvalidSalaryException("Commission cannot be more than 30%” ");
        }

    }

    @Override
    public double getSalary() {
        return (commission/100) * sale;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(";Commission : " + commission);
    }
}
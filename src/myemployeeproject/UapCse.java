
package myemployeeproject;
import java.io.Serializable;
import java.util.ArrayList;

public class UapCse implements Serializable{

    ArrayList<Employee> employees = new ArrayList<>();

    private void addNewEmployee(Employee e) {
        employees.add(e);
    }

    public void addNewEmployee(String nm, String id, String des, double sal) {
        SalariedEmployee e = new SalariedEmployee(nm, id, des, sal);
        addNewEmployee(e);
    }

    public void addNewEmployee(String nm, String id, String des, double h_Rate, int h_Worked) {
        HourlyEmployee e = new HourlyEmployee(nm, id, des, h_Rate, h_Worked);
        addNewEmployee(e);
    }

    public void addNewEmployee(String nm, String id, String des, double commission, double sale) {
        CommissionEmployee e = new CommissionEmployee(nm, id, des, commission, sale);
        addNewEmployee(e);
    }

    private Employee findEmployee(String id) {
        for (Employee x : employees) {
            if (x.getId().equals(id)) {
                return x;
            }
        }
        System.out.println("Employee not found!");
        return null;
    }

    public void increaseSalary(String id, double amt) throws InvalidSalaryException {

        Employee x = findEmployee(id);
        if (x != null) {
            x.increaseSalary(amt);
        } else {
            System.out.println("Employee not found!");
        }
    }

    public double getSalary(String id) {
        Employee x = findEmployee(id);
        if (x != null) {
            return x.getSalary();
        }
        System.out.println("Employee not found!");
        return -1;
    }

    public void display(String id) {
        Employee x = findEmployee(id);
        if (x != null) {
            x.display();
        }
    }

    public void display() {
        for (Employee x : employees) {
            x.display();
        }
    }
}

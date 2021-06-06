
package myemployeeproject;

import java.io.Serializable;

abstract class Employee implements Serializable {
    private String name;
    private String id;
    private String designation;

    public Employee(String name,String id,String designation){
        this.name=name;
        this.id=id;
        this.designation=designation;
    }
    public void display(){
        System.out.println(String.format("Name: %s Id: %s Designation: %s",name,id,designation));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public abstract  double getSalary();
    public abstract void increaseSalary(double amt) throws InvalidSalaryException;

}


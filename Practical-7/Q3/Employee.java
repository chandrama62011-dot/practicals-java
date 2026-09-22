package Q3;

public class Employee {
    int Employee_id;
    String Employee_name;
    String designation;
    double salary;

    Employee(int Employee_id, String Employee_name, String designation, double salary){
        this.Employee_id=Employee_id;
        this.Employee_name=Employee_name;
        this.designation=designation;
        this.salary=salary;
    }

    void displayEmployeeDetails(){

        System.out.println();
        System.out.println("Employee id "+Employee_id);
        System.out.println("Employee name "+Employee_name);
        System.out.println("designation "+designation);
        System.out.println("salary "+salary);

    }

    double calculateAnnualSalary(){
        return salary*12;
    }
    void work(){
        System.out.println(Employee_name+" working "+designation);
    }
}

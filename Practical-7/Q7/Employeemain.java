package Q7;


public class Employeemain {

    public static void main(String[] args) {

        Employee e1 = new Employee("Rahul", 25, 101, 30000);

        Manager m1 = new Manager("Amit", 35, 201, 60000,
                10, "IT Department");

        System.out.println("===== EMPLOYEE DETAILS =====");

        e1.displayEmployeeDetails();
        e1.work();

        System.out.println();

        System.out.println("===== MANAGER DETAILS =====");

        m1.displayManagerDetails();
        m1.work();
    }
}

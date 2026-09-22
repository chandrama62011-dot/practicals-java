package Q3;

public class main3 {

    public static void main(String[] args) {



        Employee e1 =new Employee(101, "Chandrama","Software developers", 15000000);
        Employee e2 = new Employee(102, "Jeet", "Manager", 150000);
        Employee e3 = new Employee(103, "Bablu", "Teacher", 150000);
        Employee e4 =new Employee(104, "Rajesh", "Software developers", 15000000);
        Employee e5 =new Employee(105, "Sachin", "Software developers", 15000000);




        Company c1 = new Company("Google", "Gujarat");




        c1.addEmployee(e1);
        c1.addEmployee(e2);
        c1.addEmployee(e3);
        c1.addEmployee(e4);
        c1.addEmployee(e5);


        System.out.println("\n====================================");
        System.out.println("       Display Employee List");
        System.out.println("====================================");

        c1.displayEmployee();


        System.out.println("\n====================================");
        System.out.println("   Calculate Total Annual Salary");
        System.out.println("====================================");

        System.out.println(
                "Total Annual Salary = "
                        + c1.calculateTotalSalary()
        );


        System.out.println("\n====================================");
        System.out.println("       Remove Employee");
        System.out.println("====================================");

        c1.removeEmployee(e1);


        System.out.println("\n====================================");
        System.out.println("      Calculate Updated Total");
        System.out.println("====================================");

        System.out.println(
                "Updated Total Annual Salary = "
                        + c1.calculateTotalSalary()
        );


        System.out.println("\n====================================");
        System.out.println(" EMPLOYEE CAN EXIST INDEPENDENTLY");
        System.out.println("====================================");

        e1.displayEmployeeDetails();
        e1.work();
    }
}
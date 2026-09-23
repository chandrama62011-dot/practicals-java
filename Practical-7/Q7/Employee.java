package Q7;

   public class Employee extends Person {

        int employeeId;
        double salary;

        Employee(String name, int age, int employeeId, double salary) {
            super(name, age);

            this.employeeId = employeeId;
            this.salary = salary;
        }

        void work() {
            System.out.println(name + " is working as an Employee.");
        }

        void displayEmployeeDetails() {
            displayPersonDetails();

            System.out.println("Employee ID : " + employeeId);
            System.out.println("Salary      : " + salary);
        }
    }


package Q3;

public class Company {

    String Company_name;
    String location;

    Employee[] employees = new Employee[10];

    int count = 0;

    Company(String Company_name, String location) {
        this.Company_name = Company_name;
        this.location = location;
    }

    void addEmployee(Employee Employee) {
        employees[count] = Employee;
        count++;
    }

    void removeEmployee(Employee Employee) {

        for (int i = 0; i < count; i++) {

            if (employees[i] == Employee) {

                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                employees[count - 1] = null;
                count--;

                System.out.println(
                        Employee.Employee_name + " removed from company"
                );

                return;
            }
        }

        System.out.println("Employee not found");
    }

    void displayEmployee() {

        System.out.println("Company name " + Company_name);
        System.out.println("Location " + location);
        System.out.println();

        for (int i = 0; i < count; i++) {

            employees[i].displayEmployeeDetails();

            employees[i].work();

            System.out.println(
                    "Annual salary "
                            + employees[i].calculateAnnualSalary()
            );

            System.out.println("-------------------------");
        }
    }

    double calculateTotalSalary() {

        double Total = 0;

        for (int i = 0; i < count; i++) {
            Total = Total + employees[i].calculateAnnualSalary();
        }

        return Total;
    }
}
package Q8;


public class College {

    String collegeName;
    String location;

    Department[] departments;
    int departmentCount = 0;

    College(String collegeName, String location) {
        this.collegeName = collegeName;
        this.location = location;

        departments = new Department[10];
    }

    void addDepartment(Department department) {

        if (departmentCount < departments.length) {
            departments[departmentCount] = department;
            departmentCount++;

            System.out.println(department.departmentName
                    + " added to college.");
        }
    }

    void displayDepartments() {

        System.out.println("\n--- College Departments ---");

        for (int i = 0; i < departmentCount; i++) {

            System.out.println(
                    "Department ID   : "
                            + departments[i].departmentId);

            System.out.println(
                    "Department Name : "
                            + departments[i].departmentName);

            System.out.println();
        }
    }
}

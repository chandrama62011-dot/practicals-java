package Q8;

public class collagemain {

        public static void main(String[] args) {

            // Create College
            College college =
                    new College("Ganpat University", "Gujarat");


            // Create Departments
            Department d1 =
                    new Department(101, "Computer Science");

            Department d2 =
                    new Department(102, "Information Technology");


            // Create Teachers independently
            Teacher t1 =
                    new Teacher(201, "Dr. Amit", "Java");

            Teacher t2 =
                    new Teacher(202, "Dr. Rahul", "DBMS");

            Teacher t3 =
                    new Teacher(203, "Dr. Neha", "Data Structures");


            // Add Departments to College
            college.addDepartment(d1);
            college.addDepartment(d2);


            // Add Teachers to Departments
            d1.addTeacher(t1);
            d1.addTeacher(t2);

            d2.addTeacher(t2);
            d2.addTeacher(t3);


            // Display College
            System.out.println("\n===== COLLEGE DETAILS =====");

            System.out.println("College Name : "
                    + college.collegeName);

            System.out.println("Location     : "
                    + college.location);

            college.displayDepartments();


            // Display Teachers
            d1.displayTeachers();
            d2.displayTeachers();


            // Conduct Class
            System.out.println("\n===== CLASS =====");

            d1.conductClass(t1);


            // Conduct Examination
            System.out.println("\n===== EXAMINATION =====");

            t2.conductExam();
        }
    }


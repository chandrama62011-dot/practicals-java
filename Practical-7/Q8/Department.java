package Q8;


public class Department {

    int departmentId;
    String departmentName;

    Teacher[] teachers;
    int teacherCount = 0;

    Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;

        teachers = new Teacher[10];
    }

    void addTeacher(Teacher teacher) {

        if (teacherCount < teachers.length) {
            teachers[teacherCount] = teacher;
            teacherCount++;

            System.out.println(teacher.teacherName
                    + " added to " + departmentName);
        }
    }

    void conductClass(Teacher teacher) {

        System.out.println("\n" + departmentName
                + " is conducting class:");

        teacher.teach();
    }

    void displayTeachers() {

        System.out.println("\n--- Teachers in "
                + departmentName + " ---");

        for (int i = 0; i < teacherCount; i++) {
            teachers[i].displayTeacherDetails();
            System.out.println();
        }
    }
}

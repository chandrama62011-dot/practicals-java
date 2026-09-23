package Q8;


public class Teacher {

    int teacherId;
    String teacherName;
    String subject;

    Teacher(int teacherId, String teacherName, String subject) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.subject = subject;
    }

    void teach() {
        System.out.println(teacherName + " is teaching " + subject);
    }

    void conductExam() {
        System.out.println(teacherName + " is conducting an examination.");
    }

    void displayTeacherDetails() {
        System.out.println("Teacher ID   : " + teacherId);
        System.out.println("Teacher Name : " + teacherName);
        System.out.println("Subject      : " + subject);
    }
}

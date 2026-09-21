package Q1;
import java.util.ArrayList;
public class student {
    int student_id;
    String student_name;
    String email;

    ArrayList<course> courses = new ArrayList<>();

    student(int student_id,String student_name,String email){
        this.student_id=student_id;
        this.student_name=student_name;
        this.email=email;
    }

    void displayStudentDetails(){
        System.out.println("student id "+student_id);
        System.out.println("student name "+student_name);
        System.out.println("email "+email);
    }

    void enrolledCourse(course course) {
        courses.add(course);
        System.out.println(course.course_name+"Enroll successfully");
    }

    void displayEnrollCourses(){
        System.out.println("Enrolled courses");
        for(course course:courses){
            course.displayCourseDetails();
            System.out.println("----------------------");
        }
    }



}




package Q1;

public class main1 {
    static void main() {



        System.out.println("==============================");
        System.out.println("       student details");
        System.out.println("==============================");

        student s1=new student(102,"jeet","jeet@123");
        student s2=new student(103,"bablu","bablu@123");

        System.out.println("--------------student deatils 1--------------");
        s1.displayStudentDetails();
        System.out.println();
        System.out.println("--------------student deatils 2--------------");
        s2.displayStudentDetails();
        System.out.println();


        System.out.println("==============================");
        System.out.println("       course details");
        System.out.println("==============================");
        System.out.println();

        course c1=new course(101,"java",80);
        course c2=new course(102,"C++",90);
        course c3 =new course(103,"C",95);
        System.out.println("--------------course deatils 1--------------");
        c1.displayCourseDetails();
        System.out.println();
        System.out.println("--------------course deatils 2--------------");
        c2.displayCourseDetails();
        System.out.println();
        System.out.println("--------------course deatils 3--------------");
        c3.displayCourseDetails();
        System.out.println();

        // Enrolling courses for Student 1
        s1.enrolledCourse(c1);
        s1.enrolledCourse(c2);
        System.out.println();

        s1.displayEnrollCourses();
        System.out.println();


        // Enrolling courses for Student 2
        s2.enrolledCourse(c2);
        s2.enrolledCourse(c3);
        System.out.println();

        s2.displayEnrollCourses();

    }
}

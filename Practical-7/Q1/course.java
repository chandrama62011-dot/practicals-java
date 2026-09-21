package Q1;

public class course {
    int course_id;
    String course_name;
    int credits;

    course(int course_id,String course_name,int credits){
        this.course_id=course_id;
        this.course_name=course_name;
        this.credits=credits;
    }
    void displayCourseDetails(){
        System.out.println("course id "+course_id);
        System.out.println("course name "+course_name);
        System.out.println("credits "+credits);
    }

}

package Q2;

public class professors {
    int professors_id;
    String professors_name;
    String subject;
    double salary;

    professors(int professors_id,String professors_name,String subject,double salary){
        this.professors_id=professors_id;
        this.professors_name=professors_name;
        this.subject=subject;
        this.salary=salary;
    }

    void displayProfessorDetails(){
        System.out.println("professors id "+professors_id);
        System.out.println("professors name "+professors_name);
        System.out.println("Subject "+subject);
        System.out.println("Salary "+salary);
    }
    void teach(){
        System.out.println(professors_name+" is teach "+subject);
    }
}

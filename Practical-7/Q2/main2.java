package Q2;

public class main2 {
    static void main() {

        professors p1=new professors(101,"chandrama","java",15000000);

        professors p2=new professors(102,"sachin","C++",15000000);

        professors p3=new professors(103,"Rajesh","C",15000000);

        Univarsity u1=new Univarsity("Ganpat Univarsity","Gujarat");

        u1.addProfessor(p1);
        u1.addProfessor(p2);
        u1.addProfessor(p3);


        u1.displayProfessors();

        System.out.println("professor can exit independently");
        p1.displayProfessorDetails();

    }
}

package Q2;

import org.w3c.dom.ls.LSOutput;

public class Univarsity {

    String University_name;
    String location;

    professors[] Professor =new professors[10];
    int count=0;

    Univarsity ( String University_name,String location){
        this.University_name=University_name;
        this.location=location;
        System.out.println();
    }




    void addProfessor(professors professor){
          Professor[count]=professor;
          count++;
    }
    void displayProfessors(){
        System.out.println("Univarsity name "+University_name);
        System.out.println("location "+location);
        System.out.println();

        for(int i=0;i<count;i++){
            Professor[i].displayProfessorDetails();
            Professor[i].teach();
            System.out.println();
        }

    }




}


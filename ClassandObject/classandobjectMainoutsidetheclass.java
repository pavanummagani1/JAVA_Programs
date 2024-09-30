import java.util.Scanner;
class Student_details{
    Scanner details_obj = new Scanner(System.in);
    String Student_name = details_obj.nextLine();
    int Student_id = details_obj.nextInt();
}

class Classandobject_mainoutsidetheclass{
    public static void main(String[] args){
        Student_details details = new Student_details();
        System.out.println(details.Student_id);
        System.out.println(details.Student_name);
    }
}
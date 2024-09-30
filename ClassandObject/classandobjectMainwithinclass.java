import java.util.Scanner;
class Classandobject_mainwithintheclass{
    Scanner myObj = new Scanner(System.in);
    String S = myObj.next();
    int a  = myObj.nextInt();
    public static void main(String[] args){
        Classandobject_mainwithintheclass class_Object = new Classandobject_mainwithintheclass();
        System.out.println(class_Object.S); 
        System.out.println(class_Object.a);
    }
}
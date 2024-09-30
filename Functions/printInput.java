import java.util.Scanner;
class PrintInput{
    public static void Greetings(String name){
         System.out.println("Hello "+name);
         return; 
    }
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        String name = myObj.next();
        Greetings(name);
    }
}
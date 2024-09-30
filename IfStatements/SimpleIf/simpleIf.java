 import java.util.Scanner;
class Simpleif{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int x = myObj.nextInt();
        int y = myObj.nextInt();
        if(x+y>35){
            System.out.println("Sum of X+Y is Greaterthan 35");
        }
    }
}
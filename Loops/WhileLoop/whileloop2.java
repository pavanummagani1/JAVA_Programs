import java.util.Scanner;
class Whileloop2{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int m = myObj.nextInt();
        while(m<=4){
            System.out.println("Hello Loops");
            int n = 1;
            while(n<=3){
                System.out.println("Pavan"+n);
                n++;
            }
            m++;
        }
    }
}
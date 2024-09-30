import java.util.Scanner;
class Greatestnumber{
    //Greatest function
    public static void greatestNumber(int n1,int n2){
        if(n1>n2){
            System.out.println("The Greatest number between Num1 and Num2 is "+n1);
        }else{
            System.out.println("The Greatest number between Num1 and Num2 is "+n2);
        }
        return;
    }
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        greatestNumber(num1,num2);
    }
}
import java.util.Scanner;
class Negativenum{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        System.out.println(num<0);
    }
}
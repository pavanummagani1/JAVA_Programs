import java.util.Scanner;
class Addingtwonumbers{
    //ADD method/Function
    public static void add(int n1,int n2){
        int result = n1+n2;
        System.out.println(result);
        return;

    }
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        add(num1,num2);
    }
}
import java.util.Scanner;
class Dowhileloop{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int m = myObj.nextInt();
        do{
            System.out.println("Hello"+m);
            m++;
        }while(m<=5);   
    }
}
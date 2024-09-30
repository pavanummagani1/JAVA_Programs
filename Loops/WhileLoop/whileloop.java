import java.util.Scanner;
class Whileloop{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int i = myObj.nextInt();
        while(i<=10){
            System.out.println("3x"+i+"="+(3*i));
            i++;
        }

    }
}
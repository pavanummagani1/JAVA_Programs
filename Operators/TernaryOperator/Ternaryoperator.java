import java.util.Scanner;
class Ternaryoperator{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int x = myObj.nextInt();
        int y = myObj.nextInt();
        int result = (x+y>35)?x+y:x-y;
        System.out.println(result);
    }
}
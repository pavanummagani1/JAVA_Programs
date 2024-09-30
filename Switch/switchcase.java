import java.util.Scanner;
class Switchcase{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        switch(n){
            case 0:
                System.out.println("Sunday");
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter a value between 0 to 6");
                break;
        }
    }
}
import java.util.Scanner;
class Eligibiletovote{

    public static String eligible(int age){
        if(age>18){
            String Msg = "Eligible to Vote";
            return Msg;
        }else{
            String Msg = "Not Eligible to Vote";
            return Msg;
        }
    }
    public static void main(String[] args){
        Scanner ageObj = new Scanner(System.in);
        int age = ageObj.nextInt();
        String result =  eligible(age);
        System.out.println(result);
    }
}
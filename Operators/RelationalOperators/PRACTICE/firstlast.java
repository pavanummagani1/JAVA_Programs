import java.util.Scanner;
class Firstlast{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        String S = myObj.nextLine();
        System.out.println(indexOf(S[0])==indexOf(S[-1]));
    }
}
import java.util.Scanner;
class Forloop{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int M = myObj.nextInt();
        int N = myObj.nextInt();
        for(M=1;M<=N;M++){
            if(M%2==0){
                System.out.println(M);
            }
        }
    }
}
import java.util.Scanner;
class Rightangledtriangle{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int N = num.nextInt();
        for(int i=1;i<=N;i++){
            for(int j =1; j<=i;j++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}
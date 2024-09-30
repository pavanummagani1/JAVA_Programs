import java.util.Scanner;
class Floydstriangle{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int N = num.nextInt();
        int number = 1;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
        System.out.println();
        }
    }
}
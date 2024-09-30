import java.util.Scanner;
class Averageofnnums{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int M = num.nextInt();
        int N = num.nextInt();
        int Sum = 0;
        for(int i=M;i<=N;i++){
                Sum=Sum+i;
        }
        double Average = Sum/N;
        System.out.println(Average);
    }
}
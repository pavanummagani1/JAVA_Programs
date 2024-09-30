import java.util.Scanner;
class AverageofNinputs{
    public static int average(int N,){

    }
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int N = num.nextInt();
        int Sum =0;
        for(int i=1; i<=N;i++){
            double input_num = num.nextInt();
            Sum = Sum+input_num;
        }
        int result = average(Sum);
        System.out.println(result);
    }
}
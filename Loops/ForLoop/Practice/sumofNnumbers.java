import java.util.Scanner;
class sumofNnumbers{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int M = myObj.nextInt();
        int N = myObj.nextInt();
        int Sum = 0;
        for(int i=M;i<=N;i++){
            Sum = Sum+i;
        }
        System.out.println(Sum);
    }
}
import java.util.Scanner;
class Power{

    public static int powerofN(int X, int N){
        int result = 1;
        for(int i =1 ; i<=N;i++){
            result=result*X;
        }
        return result;
    }
public static void main(String[] args){
    Scanner num = new Scanner(System.in);
    int X = num.nextInt();
    int N = num.nextInt();
    int result = powerofN(X,N); 
    System.out.println(result);
}
}
//X base number, N power Number
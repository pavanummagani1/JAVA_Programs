import java.util.Scanner;
class Invertedhalfpyramidwithnums{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int N = num.nextInt();
        for(int i=N;i>=1;i--){
            for(int j =1; j<=i;j++){
                System.out.print(j+" ");
            }
        System.out.println();
        }
    }
}
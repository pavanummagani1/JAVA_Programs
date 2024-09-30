import java.util.Scanner;
class Diamond1{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int N = num.nextInt();
        num.close();
        //Upper Triangle
        for(int i = 1;i<=N;i++){
            //Spaces
            for(int j=1;j<=(N-i);j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Lower triangle
        for(int i=N;i>=1;i--){
            //spaces
            for(int j= 1;j<=(N-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;
class Butterfly{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int N = num.nextInt();
        num.close();
        //Upperpart
        for(int i=1;i<=N;i++){
            //Left Triangle
            for(int j =1; j<=i;j++){
                System.out.print("* ");
            }
            //between spaces
            for(int j = 1;j<=2*(N-i);j++){
                System.out.print("  ");
            }
            //Right triangle
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        };

        //LowerPart
        for(int i=N;i>=1;i--){
            //left part
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //between spaces
            for(int j=1;j<=2*(N-i);j++){
                System.out.print("  ");
            }
            //Rightstars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;
class RhombusSolid{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int N = num.nextInt();
        num.close();
        for(int i = 1;i<=N;i++){
            //Spaces
            for(int j = 1;j<=(N-i);j++){
                System.out.print("  ");
            }
            //Stars
            for(int j=1;j<=N;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
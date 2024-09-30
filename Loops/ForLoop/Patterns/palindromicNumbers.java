import java.util.Scanner;
class PalindromicNumbers{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int N = num.nextInt();
        num.close();
        for(int i = 1;i<=N;i++){
            //Spaces
            for(int j = 1;j<=(N-i);j++){
                System.out.print("  ");
            }
            //1st half numbers
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            //2nd half numbers
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;
class triangle01{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int N = num.nextInt();
        //ROWS
        for(int i =1; i<=N;i++){
            //Numbers
            for(int j = 1;j<=i;j++){
                //Checking whether the sum of each matrices unit is even or odd
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
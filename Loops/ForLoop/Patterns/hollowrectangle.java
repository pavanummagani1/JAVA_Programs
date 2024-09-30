import java.util.Scanner;
class Hollowrectangle{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int rows = num.nextInt();
        int columns = num.nextInt();
        for(int i =1; i<=rows; i++){
            for(int j=1; j<=columns; j++){
                if(i==1||j==1||i==rows||j==columns){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(); 
        }
    }
}
/*
* * * * *
* * * * *
* * * * *
* * * * *
*/

import java.util.Scanner;
class Rectangle{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int rows = num.nextInt();
        int columns = num.nextInt();
        for(int i=1;i<=rows;i++){
            for (int j=1; j<=columns;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;
class Profit{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int SellingPrice = myObj.nextInt();
        int BuyingPrice = myObj.nextInt();
        System.out.println(SellingPrice > BuyingPrice);
    }
}
//INPUT FORMAT: City, IPL
import java.util.Scanner;
class Nestedif{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        String Address = myObj.nextLine();
        if(Address.endsWith("IPL")){
            if(Address.contains("Chennai")){
                System.out.println("Chennai Super Kings");
            }
            else if(Address.contains("Bengaluru")){
                System.out.println("Royal Challengers Bengaluru");
            }
            else if(Address.contains("Hyderabad")){
                System.out.println("Sunrisers Hyderabad");
            }
            else if(Address.contains("Mumbai")){
                System.out.println("Mumbai Indians");
            }
            else if(Address.contains("Jaipur")){
                System.out.println("Rajasthan Royals");
            }
            else if(Address.contains("Ahmedabad")){
                System.out.println("Gujrat Titnas");
            }
            else if(Address.contains("Mohali")){
                System.out.println("Punjab Kings");
            }
            else if(Address.contains("Lucknow")){
                System.out.println("Lucknow Super Gaints");
            }
            else if(Address.contains("Kolkatta")){
                System.out.println("Kolkatta Knight Riders");
            }
            else{
                //System.out.println(Address.spilit(,)[0]);
                System.out.println("Your City Doesn't Have a IPL Team");
            }
        }
        else{
            System.out.println("Enter an IPL Team :(");
        }
    }
}
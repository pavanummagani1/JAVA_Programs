import java.util.Scanner;
class Ifelseif{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        String City = myObj.nextLine();
        if(City == "Chennai"){
        System.out.println("City is Chennai");
        } 
        else if(City=="Hyderabad"){
        System.out.println("City is Hyderabad");
        }
        else if(City=="Bombay"){
        System.out.println("City is Bombay");
        }
        else if (City=="Bengaluru"){
        System.out.println("City is Bengaluru");
        }
        else{
        System.out.println(City);
        }
    }
}
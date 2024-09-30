import java.util.Scanner; //imports Scanner Class
class Inputoutput{
    public static void main(String[] args){
        Scanner io = new Scanner(System.in); //Creates a new Scanner object
        String s = io.nextLine(); //Reads the input from user
        int a = io.nextInt();
        System.out.println(a); //Output the user input
        System.out.println(s);
    }
}

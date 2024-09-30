import java.util.Scanner;
class Circumference{
    public static double circumferenceOfCircle(double N){
        double circumference = 2*3.14*N;
        return circumference;
    }
    public static void main(String[] args){
        Scanner radii = new Scanner(System.in);
        double radius = radii.nextDouble();
        double result = circumferenceOfCircle(radius);
        System.out.println(result);
    }
}
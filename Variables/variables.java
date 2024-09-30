/* 
JAVA Variables

A variable  is a container which holds the value while the java program is executed. Variable is the name of memory location
A variable is assigned with a DATATYPE
EX: int a = 10;

JAVA VARIABLES are CLASSIFIED into THREE Types

1)LOCAL VARIABLES
2)INSTANCE VARIABLES
3)STATIC VARIABLES

A) LOCAL VARIABLES
These are the variables declared within the METHOD,These variables can be accessed within the method and these can't be accesed outside the method. 

B) INSTANCE VARIABLES

print() will print the all outputs in sameline while
println() will allows you to print the upcoming print value in new line
*/

class variables{
    static int a = 10; //Static Variable
    int b = 25; //Instance Varible
    public static void main(String[] args){
        int c = 3; //Local Variable
        System.out.println(c);
        System.out.println(a);
        variables obj = new variables();
        System.out.println(obj.b);

        int num1 = 5869435;
        int num2 = 567;
        System.out.println(num1+num2);
        System.out.println(num1-num2);

        int A = 3;
        int B = 5;
        int C = 10;
        System.out.println(A*B*C);
        System.out.println((A/B)+C);
    }
}
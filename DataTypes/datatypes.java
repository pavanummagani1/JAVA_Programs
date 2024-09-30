/*
Data Types are broadly classified into two types
1. Primitive Data types
2. Non-Primitive data types(Strings,arrays,classes)
Primitive data types are further classified into 
a)Integer => Subtypes(byte,short,int,long)
b)Float =>Subtypes(double,float)
c)Character 
d)Boolean (True and Flase)

Data type       Size(memory)       Range
1)int              4 bytes
2)long             8 bytes
3)short            2 bytes          
4)byte             1 bytes          -128 to +127(-2^7 to 2^7-1)
5)float            4 bytes
6)double           8 bytes
7)char             2 bytes

By default 'double' will be the float value
to work with float(4 bytes) while writing the code 
'float num = 5.6f';
if we write float num = 5.6; java will throw an error
double num = 5.6; => default value

char c = 'k';
for char single quotes,for strings double quotes

boolean b = true;
boolean a = false;
 */

class datatypes{
    public static void main(String[] args){
        int num1 = 9;
        byte by = 123;
        short sh = 3;
        long l = 4356l;//same like float to use long value we need to mention l at the end

        float f = 5.8f;
        double d = 5.8;

        char c = 'P';

        boolean b = true;
    }
}
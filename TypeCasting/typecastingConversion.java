public class typecastingConversion{
    public static void main(String[] args){
        //TYPE CASTING
        float b = 30;
        int a = (int)b;
        System.out.println(b);
        System.out.println(a);

        //TYPE CONVERSION
        int c = 20;
        float d;
        d=c;
        System.out.println(d);
        System.out.println(c);

        /* In the below case we are trying to fit a bigger value(int) to smaller range(byte) size
        In such cases JAVA uses modular operator to find the remainder and returns it
        in the below programme int% (range of byte) ==> 257%256=1 
        Range of BYTE is 256,since it starts from -128 to +127*/
        int k = 257;
        byte B = (byte)k;
        System.out.println(k);
        System.out.println(B);
    }
}
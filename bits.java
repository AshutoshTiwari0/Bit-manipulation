package DataStructures.bitmanipulation;

public class bits {
    public static void main(String[] args) {
        int a=3;
        int b=6;
        System.out.println(a&b);// bit wise and
        System.out.println(a|b);// bit wise or
        // bits mean ek ek bit by bit check karna

        // bit wise xor ^
        System.out.println(a^b);

        // bit wise not ~
        //valid on a single number changes 0->1 and vice cersa
        int x=1;
        System.out.println(~x);

        int x1=5;
        System.out.println(~x1);
        
        // left shift
        int y=3;
        System.out.println(y<<1);
        System.out.println(y<<2);

        int z=2;
        System.out.println(z<<2);
    
        int v=-1;
        System.out.println(v<<1);
        System.out.println(v<<2);
        // x<<y=x*2^y
    
        // signed right shift
        //it makes sure if number is +ve it remains +ve and if it is -ve it remains -ve
    
        int f=33;
        System.out.println(f>>1);
        System.out.println(f>>4);

        int x2=-2;
        System.out.println(x2>>1);
        System.out.println(x2>>4);

        //unsigned right shift
        int g=5;
        System.out.println(g>>>2);
    }
}
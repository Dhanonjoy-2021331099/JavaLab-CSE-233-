// DATE : 04/03/2024

public class OperatorTest {
    public static void main(String[] args) {
        
        int i = 57;
        System.out.println(i%10); // 7
        double d = 57.84;
        System.out.println(d%10); // 7.840000000000003(Higher order precision = last digit 3)

        // Bitwise operator

        System.out.println(~i); // -58


        System.out.println("Unary NOT = "+i+" "+~i); //57 -58
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(~i));

        System.out.println();

        byte a = 23, b = 17;
        System.out.println("Bitwise OR = "+a+"|"+b+" = "+(a|b));

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(a|b));

        System.out.println();

        System.out.println("Bitwise AND = "+a+"&"+b+" = "+(a&b));

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(a&b));

        System.out.println();

        System.out.println("Bitwise XOR = "+a+"^"+b+" = "+(a^b));

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(a^b));

        System.out.println();

        //System.out.println("Before LShoft = "+i+", After = "+(i<<2));

        System.out.println("Before LShift = "+i+"("+Integer.toBinaryString(i)+"), After = "+(i<<2)+"("+Integer.toBinaryString(i<<2)+")");

        System.out.println("Before RShift = "+i+"("+Integer.toBinaryString(i)+"), After = "+(i>>2)+"("+Integer.toBinaryString(i>>2)+")");

        System.out.println("Before URShift = "+i+"("+Integer.toBinaryString(i)+"), After = "+(i>>>2)+"("+Integer.toBinaryString(i>>>2)+")");

        System.out.println();

        boolean b1 = true, b2 = false;
        System.out.println(b1 | b2);
        System.out.println(b1 ^ b2);
        System.out.println(! b1);
        System.out.println(b1 && b2);  // (short circuit AND)
        System.out.println(b1 || b2);  // (short circuit OR)

        int x,y,z;
        x = y = z = 100;

        x = y > z ? 100 : 50;

        System.out.println(x);

        // increment decrement

        int xx = 1;
        int yy = 2;
        int p,q;
        p = ++yy;
        q = xx++;
        p++;

        System.out.println("xx = " + xx); // 2
        System.out.println("yy = " + yy); // 3
        System.out.println("p = " +p); // 4
        System.out.println("q = " +q); // 1

        byte bb = (byte) 0xf1;
        System.out.println(bb);
        System.out.println(Integer.toBinaryString(bb));

        int done;
        done = 1;
       //  if(done)  // error ///Valid in C/C++ but no in java
        // if(!done) // error

        if(done==1) System.out.println("YES");
        else System.out.println("NO");

              
    }
}



/*
 * Precidence HW
 */
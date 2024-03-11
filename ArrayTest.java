// DATE : 04/03/2024

public class ArrayTest {
    public static void main(String[] args) {
        int[] a ;
        a = new int[10];
        // array default value = 0
        System.out.println(a[0]) ; // 0

        // System.out.println(a[10]);   // runtime error ,, dynamically allocate = runtime memory allocate 

        byte[] b = new byte[10];
        System.out.println(b);    /// reference/adress print

        byte[] b2 = b;
        System.out.println(b2);   /// reference/adress print

        b[4] = 100;
        System.out.println(b2[4]); /// 100

        // for each loop
        boolean[] b1 = new boolean[10];
        for(boolean bln : b1){
            System.out.println(bln);  /// deault value = false
        }

        // Type inference
        var bb = new boolean[5];

        // for each loop
        for(var bln : bb){
            System.out.println(bln);  /// deault value = false
        }

        // Two dimentional  // Multidimentional array
        
        double[][] d = new double[5][5];
        for(double[] d1 : d){
            for(double d2 : d1){
                System.out.print(d2+" ");
            }
            System.out.println();
        }

        System.out.println();
        // Without for each loop access

        for(int i=0; i<d.length;i++){
            for(int j=0; j<d[i].length;j++){
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        // 1st dimention maximum dite hbe
        float[][] f = new float[5][];
        f[0] = new float[1];
        f[1] = new float[2];
        f[2] = new float[3];
        f[3] = new float[4];
        f[4] = new float[5];

        for(float[] f1 : f){
            for(float f2 : f1){
                System.out.print(f2+" ");
            }
            System.out.println();
        }

        System.out.println();


       // var c = {'A','B','C'}; // Error - direct not initialize use 'var'
        char[] c = {'A','B','C'};

        for(char c1 : c){
            System.out.print(c1+" ");
        }

        char[][] c2= {{'A','B','C'}, {'a','b'},{'1','2'}}; // row = 3ta


    }
    
}

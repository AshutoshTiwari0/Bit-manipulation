package DataStructures.bitmanipulation;

class trying {
    public static void main(String args[])
    {
        // printing the binary of a number using in built function
        String num_to_binary_in_string_format=Integer.toBinaryString(5440);
        System.out.println(num_to_binary_in_string_format);
        // printing binary back to decimal
       int binary_to_normal=Integer.parseInt(num_to_binary_in_string_format,2);
       System.out.println(binary_to_normal);





      //now trying to guess and see the outputs of bit operators
      int x=123;
      int y=324;
      System.out.println(x&y);
      /* working
       * convert x=123 to binary
       * 123 to binary is 1111011
       * 324 to binary is 101000100
       * after anding them bit by bit we will get 101000000
       * now it to binary is 320(expected output)
       * 001111011
    *and 101000100
       */

        //int g=25;
        //int h=36;
        //System.out.println(g|h);


        // bitwise or
        int g1=25;
        int h1=36;
        System.out.println(g1|h1);


        //left shift
        int n=36<<1;
        System.out.println(n);
        int m=36>>1;
        System.out.println(m);

    }
}

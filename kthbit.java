package DataStructures.bitmanipulation;
import java.util.*;


/*
 * the question is as follows
 * n=8 k=2
 * n in binary is 000101
 * k=2 so check the 2nd bit from end whether it is set or not.set means if bit is 1->return yes
 * if bit is 0 return no
 */
/* 
class naivesolution
{
    /*
    String myown(int n,int pos)
    {
        //first convert n to bit form
        String bitform=Integer.toBinaryString(n);
        
        System.out.println(bitform);
        int len=bitform.length();
        // now we want to get the bit from end
        char c=bitform.charAt(len-pos);
        if(c=='1')
        {
            return "yes";
        }
        return "no";
    }
*/

// we can get last bit by n&1
//kth bit is given by 2^pos-1
/*
    String naive(int n,int pos)
    {
        int x=1;
        for(int i=0;i<(pos-1);i++)
        {
            x=x*2;
        }
        if((n&x)!=0)
        {
            return "yes";
        }
        return "no";
    }



}
*/
/*
class efficient1
{
    String soultion(int n,int pos)
    {
        //using left shift operator
        int h=(1<<(pos-1));// this is equivalent of 2^pos-1
        if((n%h)!=0)
    {
        return "yes";
    }
    return "no"; 
   }
}
*/


class efficient2
{
    String soultion(int n,int pos)
    {
        //using left shift operator
        int h=(n>>(pos-1));// this is equivalent of 2^pos-1
        if((h&1)!=0)
    {
        return "yes";
    }
    return "no"; 
   }
}
public class kthbit {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter number");
        int a=ob.nextInt();
        System.out.println("enter the value of k");
        int k=ob.nextInt();
      //  naivesolution obj=new naivesolution();
       // String ans=obj.myown(a,k);
      // efficient1 obj=new efficient1();
       //String ans=obj.naive(a,k);
      // String ans=obj.soultion(a,k);
      efficient2 obj=new efficient2();
       String ans=obj.soultion(a,k);
        System.out.println(ans);
        ob.close();
    }
}

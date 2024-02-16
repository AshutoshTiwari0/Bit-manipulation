package DataStructures.bitmanipulation;
import java.util.*;
/* 
 * problem statement
 * we are given a number find no of 1's in it
 */
/*
class naive{
    int solve(int n)
    {
      // n in binary form
      String bitform=Integer.toBinaryString(n); 
      // converted string to integer
      int i=Integer.parseInt(bitform);
      //  now find number of 1's in i
      int res=0;
      while(n>0)
      {
        if(n%2==1) // this code checks the last bit. we can also do n&1==1
        {
            res++;
        }
        n=n/2;// this line gets the next bit
      }
    return res;
    }
}
*/

/*

class optimized
{
int solution(int a) // it has time complexity theta(no of set bits)
{
    int res=0;
    while(a>0)
    {
        a=a&(a-1);
        res++;

    }
    return res;
}
}

*/
class best
{
    int table[]=new int[256];
    void initialize()
    {
        table[0]=0;
        for(int i=1;i<256;i++)
        {
            table[i]=table[i&(i-1)]+1;
        }
    }
int solution(int n) // it has time complexity theta(1)
{
    return table[n&255]+table[(n>>8)&256]+table[(n>>16)&256+table[(n>>24)]];
}
}
public class count {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        //naive obj=new naive();
      // int h= obj.solve(a);
       //System.out.println(h);

       //optimized obj=new optimized();
       best obj=new best();
       obj.initialize();
      int ans= obj.solution(a);
      System.out.println(ans);
        ob.close();
    }
}

package DataStructures.bitmanipulation;
import java.util.*;
/*
 * problem statement 
 * given an array find no which occurs odd no of times
 * [4,3,4,4,4,5,5]
 * output->3 
 * 4 occurs 4 times
 * 3 occurs 1 time
 * 5 occurs 2 times
 * [8,7,7,8,8]-> output 8
 */
/*
class naive
{
    int solve(int a[],int n)
    {
        // count every occurence of number
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                count++;
                }
            }
            if(count%2!=0)
            {
                return a[i];
            }
        }
        return -1;
    }
}
*/
class efficient
{
    int solve(int a[],int n)
    {
        int res=a[0];
        // we will use xor(^). 
        // n^n^.....odd times=n
        // n^n^.....even times=0
        for(int i=1;i<n;i++)
        {
           res=res^a[i];
        }
        return res;
    }
}
public class oddoccuring {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=ob.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        //naive obj=new naive();
        efficient obj=new efficient();
       int ans= obj.solve(a,n);
       System.out.println(ans);
       ob.close();
    }
}

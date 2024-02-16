package DataStructures.bitmanipulation;
import java.util.*;
/*
class naive{
    int solve(int a[])
    {   int j;
        for(int i=0;i<a.length;i++)
        { int c=0;
            for( j=0;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            if(c%2!=0)
            {
                return a[i];
            }
        }
   
        return 0;
    }
}
*/
class optimized
{
    void solve(int arr[])
    {   int n=arr.length;
        int x=arr[0];
        for(int i=1;i<n;i++)
        {
            x=x^arr[i];

        }
        int k=(x^(~x-1));
        int res1=0,res2=0;
        for(int i=0;i<n;i++)
        {
            if((arr[i]&k)!=0)
            {
                res1=res1^arr[i];
            }
            else{
                res2=res2^arr[i];
            }
            System.out.print(res1+res2);
        }
    }
}
public class twoodd {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        //naive obj=new naive();
        //System.out.println("enter array");
        System.out.println("enter length");
        int len=ob.nextInt();
        int a[]=new int[len];
        System.out.println("enter array");
        for(int i=0;i<len;i++)
        {
        a[i]=ob.nextInt();
    }
    optimized obj=new optimized();
  obj.solve(a);
  ob.close();


}
}

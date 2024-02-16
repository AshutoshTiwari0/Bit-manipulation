package DataStructures.bitmanipulation;
import java.util.*;
/* 
class naive{   
    //keep on dividing by 2 if remainder at end is 0 it is power of 2
    int solve(int n)
    {
       if(n==0)
       {
        return 0;
       }
       while(n>0)
       {
        int y=n%2;
        if(y!=0)
        {
            return 0;
        }
        n=n/2;// keep on dividing by 2 if remainder at end is 0 it is power of 2
        if(n==1)
        {
            return 1;
        }
       }
       return 0;
    }
}
*/
class optimized{ // use brian algo
    int solve(int a)
    {
        if(a==0)
        {
            return 0;
        }
        int ans=a&(a-1);
        if(ans==0)
        {
            return 1;
        }
        return 0;
    }
}
public class poweroftwo {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
       // naive obj=new naive();
       optimized obj=new optimized();
        int ans=obj.solve(n);
        System.out.println(ans);
        ob.close();
        }
}

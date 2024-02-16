package DataStructures.bitmanipulation;

import java.util.Scanner;

public class powerset {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a string");
        String a=ob.next();
        int n=a.length();
        int psize=(1<<n);
        for(int i=0;i<psize;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i&(1<<j))!=0)
                {
                    System.out.print(a.charAt(j));
                }
            }
            System.out.println();
        }
        ob.close();
    }
}

import java.util.*;
public class SumOfNaturalNums_WithoutFormula
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<(n-1);i++)
        a[i+1]=a[i]+a[i+1];
        System.out.println(Arrays.toString(a));
        System.out.println("sum="+a[n-1]);

        
    }
}
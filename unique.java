import java.util.*;
import java.util.Scanner;
class unique
{
public static void main(String aa[])
{
int c=0;
int[] a=new int[aa.length];
Scanner sc=new Scanner(System.in);
for(int i=0;i<aa.length;i++)
{
a[i]=sc.nextInt();
}
for(int j=0;j<aa.length;j++)
{
for(int k=j+1;k<aa.length;k++)
{
if(a[j]==a[k])
{
System.out.println(a[j]);
}
}
}
}
}


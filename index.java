import java.util.*;
import java.util.Scanner;
class index
{
public static void main(String aa[])
{
int[] a=new int[aa.length]; 
Scannersc=new Scanner(System.in);
for(int i=0;i<aa.length;i++)
{
a[i]=sc.nextInt();
}
for(int j=0;j<aa.length;j++)
{
if(j==a[j])
{
System.out.println(a[j]+" is equals its index "+j);
}
}
}
}

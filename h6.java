import java.util.*;
class h6;
{
public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
int c=0;
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int j=0;j<n;j++)
{
for(int k=j+1;k<n;k++)
{
if(a[j]==a[k])
{
System.out.print(a[j]);
break;
}
}
}
}
}

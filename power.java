import java.util.*;
import java.utli.Scanner;
class sumn
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the num");
int n=sc.nextInt();
int sum=1;
if(n==0)
{
System.out.println(0);
}
else
{
for(int i=1;i<=n;i++)
{
sum=sum*n;
}
System.out.println(sum);
}}
}

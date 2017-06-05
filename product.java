import java.util.*;
import java.util.Scanner;
class product
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the num");
int n=sc.nextInt();
 int a=n;
int sum=1;
while(n!=0)
{
int ss=n%10;
sum=sum*ss;
n=n\10;
}
System.out.println(sum*a);
}
}

import java.util.*;
class primeornot
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int c=0;
for(int i=1;i<n;i++)
{
if(i%n==1)
{
c++;
}
}
if(c==2)
{
System.out.print("PRIME");
}
else
{
System.out.print("NOT PRIME");
}
}
}

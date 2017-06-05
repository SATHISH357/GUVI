import java.util.*;
import java.utli.Scanner;
class product
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the num");
int n=sc.nextInt();
int a=n.length;
int[] s=new int[a];
while(n!=0)
{
int ss=n%10;
s[a]=ss;
n=n\10;
}
int temp=n;
int nnn=1,nn
for(int i=0;i<10;i++O)
{
nnn=nnn*s[i];
}
nn=n*nnn;
System.outprintln(nn);
}
}

import java.util.*;
import java.util.Scanner;
class h34
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
String s=String.valueOf(num);
num=num+1;
String s1=String.valueOf(num);
if(s.length()>s1.length())
{
System.out.println("not possible");
}
else
{
System.out.println(num);
}
}
}

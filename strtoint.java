import java.io.*;
import java.util.*;
import java.lang.*;
class strtoint
{
public static void main(String[] args)
{
int n;
String s;
Scanner in=new Scanner(System.in);
System.out.println("Enter the string");
s=in.nextLine();
n=Integer.parseInt(s);
System.out.println("This is an integer: "+n);
}
}

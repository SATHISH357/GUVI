import java.util.*;
import java.util.Scanner;
class v
{
public static void main(String ar[])
{
char a[5]={'a','e','i','o','u'};
Scanner s=new Scanner(System.in);
char c=s.next();
if(c.equalsIgnoreCase(a[0])||c.equalsIgnoreCase(a[1])||c.equalsIgnoreCase(a[2])||c.equalsIgnoreCase(a[3])||c.equalsIgnoreCase(a[4]))
System.out.println("Vowel");
else
System.out.println("consonant");
}
}

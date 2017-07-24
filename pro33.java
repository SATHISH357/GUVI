import java.util.*;
class pro33
{
static public void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String s="";
for(int i=0;i<str.length()-1;i++)
{
if(str.charAt(i)<str.charAt(i+1))
{
s=s+str.charAt(i);
}}
System.out.println(s+str.charAt(str.length()-1));
}
}

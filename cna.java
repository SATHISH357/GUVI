import java.util.*;
import java.lang.String;
import java.util.regex.*;
class cna
{
  public static void main(String[] args)
  {
    String str;
    int d_count=0,l_count=0,a_count=0;
    System.out.println("ENTER THE STRING:");
    Scanner s=new Scanner(System.in);
    str=s.nextLine();
    int len=str.length();
    
    for(int i=0;i<len;i++)
    {
      if(Character.isDigit(str.charAt(i)))
      { 
       System.out.println("DIGIT="+str.charAt(i));
       d_count+=1;
      }
      else if(Character.isLetter(str.charAt(i)))
      { 
        System.out.println("LETTER="+str.charAt(i));
        l_count+=1;
      }
      else
      {
        System.out.println("ALPHANUMERIC:"+str.charAt(i));
        a_count+=1;
      }
    }
  System.out.println("\n DIGIT COUNT= "+d_count+"\n LETTER COUNT  ="+l_count+"\n ALPHANUMERIC COUNT  ="+a_count);
  }
}

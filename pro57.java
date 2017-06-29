mport java.util.Scanner;

public class pro57
{

	public static void main(String[] args)
  {
		Scanner input=new Scanner(System.in);
        String stringA=input.nextLine();
        String stringB=input.nextLine();
        int ans=0;
        if(stringA.length()>=2&&stringB.length()>=2){
        for(int i=0;i<=stringA.length()-2;i++)
        {
        	String str=stringA.substring(i,i+2);
        	if(stringB.contains(str))
        	{
        		System.out.println("True");
        		ans=1;
        		break;
        	}       	
      }
        }
        if(ans==0)
        	System.out.println("False");
	}
}

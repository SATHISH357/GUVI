import java.util.Scanner;
public class p6 {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		int count1=0;
		String str1=sc.next();
		String str2=sc.next();
		char []c1=str1.toLowerCase().toCharArray();
		char []c2=str2.toLowerCase().toCharArray();
	if(str1.length()==str2.length())
		for(int i=0;i<str1.length();i++)
		{
		for(int j=i+1;j<str1.length();j++)
		{
			if((c1[i]==c1[j])&&(c2[i]==c2[j]))
			{
				count1=1;
			
			}
		}}
			if(count1==1)
			
				System.out.println("true");
			else 
			System.out.println("false");
			
			}}
				
		


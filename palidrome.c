#include<stdio.h>
#include<conio.h>
void main()
{
int i,r,o;
int rev=0;
printf("enter a number\n");
scanf("%d",&i);
o=i;
while(i!=0)
{
r=i%10;
rev=rev*10+r;
i/=10;
}
if(o=rev)
{
printf("it is a palindrome");
else
printf("it is not a palindrome");
}
getch();
}

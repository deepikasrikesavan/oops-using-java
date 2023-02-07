import java.io.*;
public class Small
{
public static void main(String args[])
{
int i;
int  a[]={12,45,67,43,19,91};
int l=a[0];
int s=a[0];
for(i=0;i<6;i++)
{
if(l<a[i])
{
l=a[i];
}
else if(s>a[i])
{
s=a[i];
}
}


System.out.println(l);
System.out.println(s);
}
}

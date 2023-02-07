import java.util.*;

class number

{

public static void main(String args[])


{

System.out.println("enter the value of n");


Scanner sc=new Scanner(System.in);


int n,q,i,b=1;

int sum =0;

int mul =1;

n=sc.nextInt();

System.out.println("enter the value of q");


q=sc.nextInt();

for(i=0;i<=n;i++)

{
sum= sum +i;

}

for(i=1;i<=n;i++)

{
mul= mul * i;

}


for(i=1;i<=9;i++)

{

b*=10;


}


b=b+7;


if(q==1)

{

System.out.println("the sum is" + sum);

}

else if(q==2)

{

if(mul>1000000)

{

mul=mul%b;

System.out.println("the mod is " + mul);

}

System.out.println("the mul is " + mul);


}

else

{

System.out.println("Enterthe crt input");

}



}}
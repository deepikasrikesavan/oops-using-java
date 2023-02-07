import java.util.*;


class Pattern

{

public static void main(String args[])

{

int i,j,m,o,count=1;

Scanner sc=new Scanner(System.in);

System.out.print("Enter the input ");

int n=sc.nextInt();


int a[]=new int[n];

for(i=0;i<n;i++)

{

System.out.print("Enter the height ");

a[i]=sc.nextInt();


}


for(i=0;i<n-1;i++)

{

 
m=a[i];

o=a[i+1];


if(m>n)

{

count++;


}



}

System.out.println("The no of group is "+count);




}

}
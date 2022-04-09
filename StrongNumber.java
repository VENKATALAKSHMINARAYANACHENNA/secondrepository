import java.util.*;
class StrongNumber{
	public static void main(String[] args){
		int n;
		int rem,sum=0;
		System.out.println("Enter Number=");
		Scanner sin=new Scanner(System.in);
		n=sin.nextInt();
		int n1=n,fact;
		while(n>0){
			rem=n%10;
			fact=1;
			for(int i=1;i<=rem;i++)
				fact=fact*i;
			sum=sum+fact;
			n=n/10;
		}
        if(sum==n1)
			System.out.println(n1+" is Strong Number");
		else
			System.out.println(n1+" not a Strong Number");
	}
}

/*
F:\BHAVAJAVA>javac StrongNumber.java

F:\BHAVAJAVA>java StrongNumber
Enter Number=
145
145 is Strong Number

F:\BHAVAJAVA>java StrongNumber
Enter Number=
125
125 not a Strong Number
*/		
			
			
		

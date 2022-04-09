import java.util.*;
class Addition{
	public static void main(String[] args){
		Scanner si=new Scanner(System.in);
		System.out.println("Enter a,b...");
		int a=si.nextInt();
		int b=si.nextInt();
		int c=a+b;
		System.out.println("Addition of "+a+" and "+b+"="+c);
	}
}	
/*
F:\BHAVAJAVA>javac Addition.java

F:\BHAVAJAVA>java Addition
Enter a,b...
2
5
Addition of 2 and 5=7
*/
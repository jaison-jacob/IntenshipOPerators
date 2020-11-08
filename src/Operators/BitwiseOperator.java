package Operators;

public class BitwiseOperator {

	public static void main(String arg[]){
		int num1 = 5;
		int num2 = 6;
		
		//use "&"
		int total = num1 & num2;
		System.out.println(" & operator use = "+ total);
		
		//use "^"
		total = num1 ^ num2;
		
		System.out.println(" ^ operator use = "+ total);
		
		//use "~"
		total = ~num2;
		
		System.out.println(" ^ operator use = "+ total);
		
		//use ">>"
		
		total = num1 >>2;
		System.out.println(" >> operator use = "+ total);
		
		total = num1 <<2;
		System.out.println("<<s operators use = "+ total);
	}
	
}

package Operators;

public class RelationalOperatorAndLogicalOperator {

	public static void main(String arg[]){
		
	   int num1 = 78;
	   
	   int num2 = 45;
	   
	   //condition satisfy
	   if(num1 == 78 && num2 == 45){
		   
		   System.out.println("condition satisfy with && = "+ (num1+num2));
	   }else{
		   System.out.println("condition not satisfy with && ");
	   }
	   
	   
	   //condition unsatisfy
	   num2 = 90;
	 
        if(num1 == 78 && num2 == 45){
		   
		   System.out.println("condition satisfy with && = "+ (num1+num2));
	   }else{
		   System.out.println("condition not satisfy with && ");
	   }

        
        //condition satisfy with "||" operator
        
        if(num1 == 78 || num2 == 45){
 		   
 		   System.out.println("condition satisfy with || =  = "+ (num1+num2));
 	   }else{
 		   System.out.println("condition not satisfy with || = ");
 	   }

        //condition unsatisfy with "||" operator
        
        num1 = 66;
        
        if(num1 == 78 || num2 == 45){
 		   
 		   System.out.println("condition satisfy with || = "+ (num1+num2));
 	   }else{
 		   System.out.println("condition not satisfy with ||");
 	   }

        //condition satisfy with "!=" operator
		
        if(num1 != 78 ){
  		   
  		   System.out.println("condition satisfy with !=  = "+ (num1+num2));
  	   }else{
  		   System.out.println("condition not satisfy with "!="");
  	   }
        
        //condition unsatisfy with "!=" operator
        
        if(num1 != 66){
        	System.out.println("condition satisfy with != = "+ (num1+num2));
        }
        else{
   		   System.out.println("condition not satisfy with !=");
   	   }
        
        num1 = 89;
        num2 = 34;
        
        //use ">"
        if(num1 > num2){
        	
        	System.out.println("Condition satisfy with >");
        }else{
        	System.out.println("condition notsatisfy");
        }
        
        //use "<"
        
        if(num1 > num2){
        	
        	System.out.println("Condition satisfy with <");
        }else{
        	System.out.println("condition notsatisfy <");
        }
        
        //use "=<"
        
        if(num1 <= num2){
        	System.out.println("num1 less than or equal num2");
        }else{
        	System.out.println("num2 less than or equal num1");
        }
        
        //use ">"
        
        if(num1 < num2){
        	System.out.println("num1 less than num2");
        }else{
        	System.out.println("num2 less than num1");
        }
	}
	
}

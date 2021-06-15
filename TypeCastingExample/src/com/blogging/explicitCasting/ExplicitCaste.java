package com.blogging.explicitCasting;

public class ExplicitCaste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a;
	     double l = 456.78;
	     
	     a = (int)l;
	    
	     //we are storing the value of double into int therefore we have to perform explicit type casting as done above.
	     System.out.println(a);
	     
	        byte b;
		    int i = 56;
		    b = (byte)i;
		    System.out.println(b);
		    
		    char c;
		    int ii = 78;
		    c = (char)ii;
		    System.out.println(c);/*When we try to convert int to char, the point to noted is it stores the 
		                           char associated with that integer with respect to ASCII value.*/
	}

}

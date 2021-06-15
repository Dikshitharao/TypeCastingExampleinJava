package com.blogging.ImplicitCasting;

public class ImplicitCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
	    double d;
	    
	    d = a;
	     //we are storing the value of int into double therefore automatic type conversion takes place.
	    System.out.println(d);
	    
	    byte b = 1;
	    int i;
	    i = b;
	    System.out.println(i);
	    
	    char c = 'a';
	    int ii;
	    ii = c;
	    System.out.println(ii);//When we try to convert char to int, the point to boted is it prints its ASCII value of a.
	    

	}

}

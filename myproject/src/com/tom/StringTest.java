package com.tom;

public class StringTest {

	public static void main(String[] args) {
		int n = 100;
		System.out.println(n!= 99);
		
		String s = "Hello World";
		//          01234567890
		
		String s2 = new String ("Jack Tom Eric ");
        //      				 0123456789012
		//                       2109876543210          
		System.out.println(s.equals(s2 ));
		System.out.println(s.substring(8));
		System.out.println(s.substring(2,7));
		
		for(int i = s.length()-1; i>=0; i--){
		System.out.print(s.charAt(i) );	
		}
		System.out.println();
		
		System.out.println(s2.indexOf("o"));
		System.out.println(s2.lastIndexOf("a"));
		
		String name = "Tom";
		int index = s2.indexOf(name);
		System.out.println(index);
		System.out.println(s2.substring(0,index) + "boss"
		+s2.substring(index+name.length()));
		
		
		
	}
}
	



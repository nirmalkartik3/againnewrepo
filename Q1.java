package day8;

import java.util.Scanner;

//Write a Java program to get the character at the given index within the String
public class Q1 {

   static	char getChar(String a,int y)
	{
		return a.charAt(y);
	}
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		String e= s.next();
		int position=s.nextInt();
		
		char p= Q1.getChar(e, position);
		System.out.println(p);
				

	}

}

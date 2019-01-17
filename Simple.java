import java.io.*;
import java.util.Scanner;

class Simple
{
	public static void main(String args[])
	{

		String s1,s2;

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		System.out.print("Enter the 1st String : ");
		s1=sc1.nextLine();
		System.out.print("Enter the 2nd String : ");
		s2=sc2.nextLine();

		System.out.println("Length of First String : "+s1.length());
		System.out.println("Concatenation of 2 Strings : "+s1.concat(s2));
		System.out.println("1st String in Upper Case : "+s1.toUpperCase());
		System.out.println("2nd String Lower Case : "+s2.toLowerCase());
		System.out.println("Character at the 1st Position of 1st String : "+s1.charAt(0));

	}
}

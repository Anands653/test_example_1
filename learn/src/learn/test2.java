package learn;
import java.util.Scanner;

public class test2 
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	
	if(s.equals("tim")) {
		System.out.println("You type tim");
	}
	else if (s.equals("jim")) {
		System.out.println("you typed Jim");
	}
	
	else {
		System.out.println("Print");	
	}
	
}
}

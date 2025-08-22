package learn;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		
		// nested if statement
		
		System.out.print("Input yur age: ");
		
		Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			
			int age = Integer.parseInt(s);// Read a line of input from the user
			
			if(age <= 0)
			{
			System.out.println("Invalid entry");
			}
			else if(age >= 18) 
			{
				System.out.print("Input your fav food: ");
				String food = sc.nextLine();
			
			if(food.equals("pizza")) 
				{
				System.out.println("Mine too");
				
				}
			else {
				System.out.println("Not mine");
				
				}
			}
				else if(age >= 13)
				{
				System.out.println("You are Teenager");
				}
				else 
					{
				System.out.println("You are not Teenager or Adult");
				
					}
			
	 
	sc.close();// Always close scanner
		}
	}



package com.Question3;
import java.util.Scanner;

public class InvalidNameException extends Exception 
{
	public InvalidNameException(String string) {
		// TODO Auto-generated constructor stub
	}
	void validateName(String name) throws InvalidNameException { 
		String[] names = { "Gauri", "Dhruv", "Divya", "Vaibhav","Viki"};
        boolean found= false;
        for (String n: names)
        {
            if (n.equalsIgnoreCase(name))
            {
                found = true;
                break;
            }
        }
        if (found)
        {
            System.out.println("the name is present");
        } 
        else 
        {
            throw new InvalidNameException("the name is not present");
        }
    }
	public static void main(String[] args) 
	{
		InvalidNameException i=new InvalidNameException(null);
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Name:");
        String name = sc.next();
        try
        {
            i.validateName(name);
        }
        catch(InvalidNameException e) 
        {
            System.out.println("Invalid Name " +e);
        }
 }

}
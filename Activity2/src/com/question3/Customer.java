package com.question3;

import java.util.Scanner;

public class Customer {
	private String Accno;  
    private String name;  
    private int accbal;  
    Scanner sc = new Scanner(System.in);
    
  // entering the customer details   
    public void createAccount()
    {  
        System.out.print("Enter Account no ");  
        Accno =sc.next();  
        System.out.print("Enter Name");  
        name = sc.next();  
        System.out.print("Enter acc Balance");  
        accbal = sc.nextInt(); 
    }
    //adding amount
   public void setAmount() {
      int amount;
      System.out.print("Enter the amount you want to add ");  
      amount=sc.nextInt(); 
      accbal =(accbal+amount); 


	  System.out.println("Blance after entering amount is "+accbal);
	
}


   public void getAmount()
{
	  System.out.println(" the account balance is  " +accbal);
	  System.out.println(" the name of account is "+name);
}
   public void withDrawAmount() {
      int withdraw;
      System.out.print("Enter the amount you want to withdraw ");  
      withdraw=sc.nextInt();

      accbal=(accbal-withdraw);

      System.out.println(" the amount after withdraw is"+accbal);

}

}
package entities;

import java.util.Scanner;

public class Count {
	
	//Attributes
	private String nCount;
	private String nameUser;
	private double balance;
	private char ask;
	
	//Construct
	public Count() {
		Scanner sc = new Scanner(System.in); // Start to read
		
		System.out.print("Enter account number: ");
		this.nCount = sc.next();
		System.out.print("Enter account holder: ");
		this.nameUser = sc.next();
		// sc.hasNextLine(); Using 2 NextLine to pick compound names
		System.out.print("Is there na initial deposit (y/n)? ");
		this.ask = sc.next().charAt(0); // Using .charAt(0) and == 'y' in the next line
		if (this.ask == 'y') {
			System.out.print("Enter initial deposit value: ");
			this.balance = sc.nextDouble();
		}
		System.out.println("");
		System.out.println("Account Data: ");
		System.out.printf("Account %s, Holder: %s, Balance: $ %.2f%n", this.nCount, this.nameUser, this.balance);
		System.out.println("");
		System.out.print("Enter a deposit value: ");
		this.balance += sc.nextDouble();
		System.out.println("Updated account data: ");
		System.out.printf("Account %s, Holder: %s, Balance: $ %.2f%n", this.nCount, this.nameUser, this.balance);
		System.out.println("");
		System.out.print("Enter a withdraw value: ");
		this.balance -= sc.nextDouble();
		this.balance -= 5.00;
		System.out.println("Updated account data: ");
		System.out.printf("Account %s, Holder: %s, Balance: $ %.2f%n", this.nCount, this.nameUser, this.balance);
		sc.close(); // End to read
	}
	
	/*
	public Count(String nCount, String nameUser, double balance) {
		//super();
		this.nCount = nCount;
		this.nameUser = nameUser;
		this.balance = balance;
	}
	*/
	
	/*
	public Count(String nCount, String nameUser) {
		//super();
		this.nCount = nCount;
		this.nameUser = nameUser;
		this.balance = 0;
	}
	*/
	
	//Métodos especiais - Set and Get
	public String getNCount() {
		return nCount;
	}
	public String getNameUser() {
		return nameUser;
	}
	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/*public void  setNCount(String nCount) {
	this.nCount = nCount;
	}
	Number of count can't change */ 

}
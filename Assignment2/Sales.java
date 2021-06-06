package Assignment2;

import java.util.*;
import java.text.DecimalFormat;

// 2.4 Abstraction
// Super class
public abstract class Sales{

	Scanner scan = new Scanner(System.in);
	public static DecimalFormat df2 = new DecimalFormat("0.00"); 
	
	String firstname, lastname, gender, email, city, state, tourism, service, phone_num;
	int age, hour, price;
	double TotalPrice, Discount, PriceafterDiscount;
	
	
	public Sales(int h, double d) {
		hour = h;
		Discount = d;
		
		System.out.println("\n\n******************************CLIENT INFORMATION******************************");
		System.out.print("Please fill in your information");
		System.out.print("\nFirst Name\t: ");
		firstname = scan.nextLine();
			
		System.out.print("Last Name\t: ");
		lastname = scan.nextLine();
			
		System.out.print("Age\t\t: ");
		age = scan.nextInt();
			
		System.out.print("Gender\t\t: ");
		gender = scan.next();
		scan.nextLine();
			
		System.out.print("Phone Num\t: ");
		phone_num = scan.nextLine();
			
		System.out.print("Email\t\t: ");
		email = scan.next();
		scan.nextLine();
			
		System.out.print("City\t\t: ");
		city = scan.nextLine();
			
		System.out.print("State\t\t: ");
		state = scan.nextLine();
		
		clientInfo();
		bookingInfo();
		calTotalPrice();
		Discount();
	}
	
	
	// 2.3 Encapsulation
	// Create Getter Methods
	public String getFirstName() {
		return this.firstname;
	}
	
	public String getLastName() {
		return this.lastname;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public String getPhoneNum() {
		return this.phone_num;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public String getState() {
		return this.state;
	}
	
	public String getTourism() {
		return this.tourism;
	}
	
	public String getService() {
		return this.service;
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public double getDiscount() {
		return 0.20;
	}
	
	private void clientInfo() {
		System.out.print("\nFirst Name     : " + getFirstName());
		System.out.print("\nLast Name      : " + getLastName());
		System.out.print("\nAge            : " + getAge() + " years old");
		System.out.print("\nGender         : " + getGender());
		System.out.print("\nPhone Number   : " + getPhoneNum());
		System.out.print("\nEmail          : " + getEmail());
		System.out.print("\nCity           : " + getCity());
		System.out.print("\nState          : " + getState());
	}
	
	private void bookingInfo() {
		System.out.println("\n");
		System.out.print("\n******************************BOOKING INFORMATION******************************");
		System.out.print("\nType of tourism : ");
		tourism = scan.nextLine();
			
		System.out.print("Type of service : ");
		service = scan.nextLine();
			
		System.out.print("Price\t\t: ");
		price = scan.nextInt();
			
		System.out.print("Hour\t\t: ");
		hour = scan.nextInt();
			
		System.out.print("\nType of tourism : " + getTourism());
		System.out.print("\nType of service : " + getService());
		System.out.print("\nPrice           : " + "RM " + df2.format(getPrice()) + " per person");
		System.out.print("\nHour            : " + getHour());
		System.out.print("\nDiscount        : " + getDiscount());
	}

	private void calTotalPrice() {
		TotalPrice = price * hour;
		System.out.printf("\n\nTotal price for " + hour + " hours of " + this.tourism + ", " + this.service + " is RM " + df2.format(TotalPrice));
	}
	
	private void Discount() {
		if(hour >= 5) {
			System.out.println("\nIf hour is more than 5, you will get 20% discount.");
			
			PriceafterDiscount = TotalPrice * (1 - getDiscount());
			System.out.println("Total price after discount is " + "RM " + df2.format(PriceafterDiscount));
		}
		else{
			System.out.println("\nIf hour is less than 5, you will not get any discount.");
		}
	}
}

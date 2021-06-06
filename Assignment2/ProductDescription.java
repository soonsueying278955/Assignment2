package Assignment2;

import java.util.*;

// 2.1 Inheritance
public class ProductDescription extends TourismRelatedService{

	Scanner scan = new Scanner(System.in);
	
	String tourism, service;
	
	public ProductDescription(String n, String t, String tou, String s) {
		super(n,t);
		
		productInfo();
		printInfo();
	}
	
	
	// 2.3 Encapsulation
	// Create Setter Methods
	public void setTourism(String t) {
		this.tourism = t;
	}
	
	public void setService(String s) {
		this.service = s;
	}
	
	
	// 2.3 Encapsulation
	// Create Getter Methods
	public String getTourism() {
		return this.tourism;
	}
	
	public String getService() {
		return this.service;
	}
	
	
	// 2.2 Polymorphism
	private void productInfo() {
		System.out.print("\n\n**********************************PRODUCT DESCRIPTION**********************************");
		System.out.println("\nType of tourism and the service:" 
				 + "\n1. Health Tourism.   Service : Cosmetic Surgery, Dentistry, Cardiac Surgery" 
			         + "\n2. Sport Tourism.    Service : Snorkeling, Kayaking, Gym"
			         + "\n3. Cultural Tourism. Service : Museums, Historic sites, Handicrafts");
		
		System.out.print("\nPlease select the tourism you want : ");
		tourism = scan.nextLine();
		
		System.out.print("Please select the service you want : ");
		service = scan.nextLine();
		
		System.out.print("\nTourism : " + tourism);
		System.out.print("\nService : " + service);
	}
	
	
	public void printInfo() {
		if(tourism.equals("Health Tourism") && service.equals("Dentistry")) {
			healthTourism();
		}
		else if(tourism.equals("Sport tourism" ) && service.equals("Gym")) {
			sportTourism();
		}
		else if(tourism.equals("Cultural tourism") && service.equals("Museums")) {
			culturalTourism();
		}
	}


	private void healthTourism() {
		System.out.println("");
		System.out.print("\n===============HEALTH TOURISM==============");
		System.out.println("\n1. Price per person     : " + "RM 1000"  
				         + "\n2. Professional quality : " + "Good, enthusiasm, politeness"
				         + "\n3. ***If hour is more than 5 hours, you will get 20% discount");	
	}


	private void sportTourism() {
		System.out.print("\n===============SPORT TOURISM================");
		System.out.println("\n1. Price per person     : " + "RM 800"
				         + "\n2. Environment          : " + "Good "
				         + "\n3. Fitness trainer      : " + "Yes"
				         + "\n4. ***If hour is more than 5 hours, you will get 15% discount");
	}


	private void culturalTourism() {
		System.out.print("\n===============CULTURAL TOURISM=============");
		System.out.println("\n1. Experience different cultures and beliefs"
				         + "\n2. Learn about various custom"
				         + "\n3. Enjoy tradisional food from all over the world"
				         + "\n4. Price per person     : " + "RM 850"
				         + "\n5. ***If hour is more than 5 hours, you will get 25% discount");
	}
}

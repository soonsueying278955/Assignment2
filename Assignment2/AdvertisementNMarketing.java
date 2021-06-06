package Assignment2;

// 2.1 Inheritance
public class AdvertisementNMarketing extends TourismRelatedService{

	String social_media, print_media, quality;
	
	public AdvertisementNMarketing(String n, String t, String pm, String q) {
		super(n,t);
		
		print_media = pm;
		quality = q;
		
		type_of_Advertising();
		printAdvertising();
	}
	
	
	//  2.3 Encapsulation
	// Create Setter Methods
	public void setSocialMedia(String sm) {
		this.social_media = sm;
	}
	
	public void setPrintMedia(String pm) {
		this.print_media = pm;
	}
	
	public void setQuality(String q) {
		this.quality = q;
	}

	
	// 2.3 Encapsulation
	// Create Getter Methods
	public String getSocialMedia() {
		return this.social_media;
	}
	
	public String getPrintMedia() {
		return this.print_media;
	}
	
	public String getQuality() {
		return this.quality;
	}
	
	
	private void type_of_Advertising() {
		System.out.println("\n\n**********************************ADVERTISING**********************************");
		System.out.println("\nThere are two types of advertisement" + 
						   "\nType 1 is Mobile Advertising on social media. Example: Facebook" + 
						   "\nType 2 is Print Advertising on print media. Example: Brochure");
	}
	
	public void mobileAdvertising() {
		System.out.println("\n\n***************************MOBILE ADVERTISING***************************");
		setSocialMedia("Facebook");
		System.out.println("We posted our information on " + getSocialMedia() + " to promote the activity.");
		System.out.println("\n=========================LUCKY DRAW=========================");
		System.out.println("LUCKY DRAW IS HERE FOR YOU !!");
		System.out.println("\nThe price for 4 days 3 nights is ONLY RM8000!! Hurry up!!");
		System.out.println("Price Packs included: "
					       + "\n- Herbal Bath Ticket"
						   + "\n- Check in five-star hotel : Sangerilla Hotel"
					       + "\n- Dive and shark interaction"
						   + "\n- Experience kayaking");
					       
		System.out.println("\nRules : "
						   + "\nStep 1 : Like our page"
					       + "\nStep 2 : Follow us" 
						   + "\nStep 3 : Tag 3 friends in comment section" 
					       + "\nStep 4 : Share this story and tag us in your story.");
				
		System.out.println("\n***ONLY 1 winner will be chosen. Winner will be contacted on after 10 days when the activity is end. GOOD LUCK!");	
	}
	
	
	private void printAdvertising() {
		System.out.println("\n\n***************************PRINT ADVERTISING****************************");
		setPrintMedia("brochure");
		setQuality("good and the best.");
		System.out.println("We posted our information on " + getPrintMedia() + " to promote the activity.");
		System.out.println("\n====================CONSULTATION TIME======================");
		System.out.println("Our company will make a consultation time to everyone.");
		System.out.println("The date will held on 15 June 2021 until 30 June 2021.");
		System.out.println("Just come to our website and put down your question.");
					       	
		System.out.println("\nHow to consult :"
				         + "\nOption 1 : Visit our website. -> www.metitravel.com.my" 
				         + "\nOption 2 : Email to us. -> metitravel@yahoo.com" 
				         + "\nOption 3 : Call us at the appointment time. -> 03-5879460");
	    
		System.out.println("\nWe will make sure our treatment is " + getQuality());
		System.out.println("Welcome to all of you to make a consult and we will give you a satisfactory answer. "
				         + "\nThank You.");
	}
}

package Assignment2;

// 2.1 Inheritance
// 2.4 Abstraction
// Super class
public abstract class TourismRelatedService {
	
	private String companyName, address, website, email, timeofbusiness, facebook, insta, Telno;
	private int establishYear;
	
	TourismRelatedService(String n, String t){
		this.companyName = n;
		this.timeofbusiness = t;
	
		companyInfo();
	}
	
	
	// 2.3 Encapsulation
	// Create Setter Methods
	public void setCompanyName(String c) {
		this.companyName = c;
	}
	
	public void setAddress(String a) {
		this.address = a;
	}
	
	public void setEstablishYear(int y) {
		this.establishYear = y;
	}
	
	public void setTimeofBusiness(String t) {
		this.timeofbusiness = t;
	}
	
	public void setWebsite(String w) {
		this.website = w;
	}
	
	public void setEmail(String e) {
		this.email = e;
	}
	
	public void setFacebook(String fb) {
		this.facebook = fb;
	}
	
	public void setInsta(String i) {
		this.insta = i;
	}
	
	public void setTelno(String hp) {
		this.Telno = hp;
	}
	
	
	// 2.3 Encapsulation
	// Create Getter Methods
	public String getCompanyName() {
		return this.companyName;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public int getEstablishYear() {
		return this.establishYear;
	}
	
	public String getTimeofBusiness() {
		return this.timeofbusiness;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getFacebook() {
		return this.facebook;
	}
	
	public String getInsta() {
		return this.insta;
	}
	
	public String getTelno() {
		return this.Telno;
	}
	
	
	public void companyInfo() {
		System.out.print("\n**********************************COMPANY INFORMATION**********************************");
		setCompanyName("Meti Travel");
		setAddress("No.49, Jalan APP Yan, Tanah Biru, 43300, Petaling, Kuala Lumpur.");
		setEstablishYear(2007);
		setTimeofBusiness("9.00 a.m - 9.00 p.m");
		setWebsite("www.metitravel.com.my");
		setEmail("metitravel@yahoo.com");
		setFacebook("Meti Travel");
		setInsta("meti_travel07");
		setTelno("03-5879460");
		
		System.out.print("\n\nName              : " + companyName);
		System.out.print("\nAddress           : " + address);
		System.out.print("\nEstablish Year    : " + establishYear);
		System.out.print("\nTime of Business  : " + timeofbusiness);
		System.out.print("\nWebsite           : " + website);
		System.out.print("\nEmail             : " + email);
		System.out.print("\nFacebook          : " + facebook);
		System.out.print("\nInstagram         : " + insta);
		System.out.print("\nNo.Tel            : " + Telno);
	}
}

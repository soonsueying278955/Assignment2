package Assignment2;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hi, Welcome to Meti Travel - Tourism-related Service.");
		
		ProductDescription P = new ProductDescription("Meti Travel", "9.00 a.m - 9.00 p.m", "Health Tourism", "Dentistry");
		
		Employee E1 = new Employee("Meti Travel", "9.00 a.m - 9.00 p.m", "Tourism Trainer", 12);
	
		AdvertisementNMarketing A = new AdvertisementNMarketing("Meti Travel", "9.00 a.m - 9.00 p.m", "brochure", "good and the best.");
		
		Finance F = new Finance(6, 0.20, 12, 1);
	}

}

package Assignment2;

import java.text.DecimalFormat;

// 2.1 Inheritance
// 2.5 Interface
public class Employee extends TourismRelatedService implements Payment{
	
	public static DecimalFormat df2 = new DecimalFormat("0.00");
	
	protected String job_position, name, gender, email, phone_num;
	protected int age, month;
	protected double salary, totalsalary;
	
	
	public Employee(String n, String t, String jp, int m) {
		super(n,t);
	
		job_position = jp;
		month = m;
		
		printInfo();
		printSalaryforMonth();
		printcalSalary();
	}
	
	
	// 2.3 Encapsulation
	// Create Setter Methods
	public void setName(String n) {
		this.name = n;
	}
	
	public void setAge(int a) {
		this.age = a;
	}
	
	public void setGender(String g) {
		this.gender = g;
	}
	
	public void setJobPosition(String jp) {
		this.job_position = jp;
	}
	
	public void setPhoneNum(String hp) {
		this.phone_num = hp;
	}
	
	public void setPersonalEmail(String e) {
		this.email = e;
	}
	
	public void setSalary(double s) {
		this.salary = s;
	}
	
	
	// 2.3 Encapsulation
	// Create Getter Methods
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public String getJobPosition() {
		return this.job_position;
	}
	
	public String getPhoneNum() {
		return this.phone_num;
	}
	
	public String getPersonalEmail() {
		return this.email;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public double getPaymentTrainer() {
		return 5500;
	}
	
	public double getPaymentCounsellor() {
		return 3000;
	}

	public double getPaymentManager() {
		return 7000;
	}
	
	// 2.2 Polymorphism
	// Print out the details for employees
	public void printInfo() {
		setName("Jackson Lau");
		setAge(34);
		setGender("Male");
		setJobPosition("Tourism Trainer");
		setPhoneNum("0125908330");
		setPersonalEmail("jacksonlau@gmail.com");
		setSalary(5500);
		
		System.out.println("\n\n********************EMPLOYEE INFORMATION********************");
		System.out.print("Employee 1");
		System.out.print("\nName           : " + getName());
		System.out.print("\nAge            : " + getAge());
		System.out.print("\nGender         : " + getGender());
		System.out.print("\nJob Position   : " + getJobPosition());
		System.out.print("\nPhone Number   : " + getPhoneNum());
		System.out.print("\nEmail          : " + getPersonalEmail());
		System.out.print("\nSalary         : " + "RM " + df2.format(getSalary()));
		printSalaryforMonth();
		printcalSalary();
		System.out.print("\n------------------------------------------");
		
		
		setName("Emily Choo");
		setAge(32);
		setGender("Female");
		setJobPosition("Visitor Information Counsellor");
		setPhoneNum("0148502397");
		setPersonalEmail("emilychoo00@gmail.com");
		setSalary(3000);
		
		System.out.print("\n\nEmployee 2");
		System.out.print("\nName           : " + getName());
		System.out.print("\nAge            : " + getAge());
		System.out.print("\nGender         : " + getGender());
		System.out.print("\nJob Position   : " + getJobPosition());
		System.out.print("\nPhone Number   : " + getPhoneNum());
		System.out.print("\nEmail          : " + getPersonalEmail());
		System.out.print("\nSalary         : " + "RM " + df2.format(getSalary()));
		printSalaryforMonth();
		printcalSalary();
		System.out.print("\n------------------------------------------");
		
		
		setName("Michael Lam");
		setAge(45);
		setGender("Male");
		setJobPosition("Manager");
		setPhoneNum("01152907783");
		setPersonalEmail("michaellammm@gmail.com");
		setSalary(7000);
	
		System.out.print("\n\nEmployee 3");
		System.out.print("\nName           : " + getName());
		System.out.print("\nAge            : " + getAge());
		System.out.print("\nGender         : " + getGender());
		System.out.print("\nJob Position   : " + getJobPosition());
		System.out.print("\nPhone Number   : " + getPhoneNum());
		System.out.print("\nEmail          : " + getPersonalEmail());
		System.out.print("\nSalary         : " + "RM " + df2.format(getSalary()));
		printcalSalary();
	}
	
	public void printSalaryforMonth() {
		totalsalary = salary * month;
		
		if(salary == 3000) {
			System.out.print("\n\nThe monthly salary for the Visitor Information Counsellor is " + "RM " + df2.format(getSalary()));
		}
		else if(salary == 5500) {
			System.out.print("\n\nThe monthly salary for the Tourism Trainer is " + "RM " + df2.format(getSalary()));
		}
		else if(salary == 7000) {
			System.out.print("\n\nThe monthly salary for the Manager is " + "RM " + df2.format(getSalary()));
		}
	}
	
	public void printcalSalary() {
		totalsalary = salary * month;
		
		if(job_position == "Visitor Information Counsellor" && month == 12) {
			System.out.println("\nTotal salary of " + month + " month is " + "RM " + df2.format(totalsalary));
		}
		else if(job_position == "Tourism Trainer" && month == 12) {
			System.out.println("\nTotal salary of " + month + " month is " + "RM " + df2.format(totalsalary));
		}
		else if(job_position == "Manager" && month == 12) {
			System.out.println("\nTotal salary of " + month + " month is " + "RM " + df2.format(totalsalary));
		}
	}
}

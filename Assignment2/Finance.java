package Assignment2;

// 2.1 Inheritance
// 2.5 Interface
public class Finance extends Sales implements TotalPayment{
	
	double income, netIncome, totalIncome ,totalExpenses;
	double costofUtilities, advertisement, repair_maintenanceExpenses, comunicationExpenses, rentExpenses, otherExpenses;
	double employeeSalaries, employeeWages, employeeBenefits, insuransCost;
	double income_HealthTourism, income_SportTourism, income_CulturalTourism;
	double monthly_income, year_income;
	int month, year;
	
	public Finance(int h, double d, int m, int y) {
		super(h, d);
		month = m;
		year = y;
		
		incomeInfo();
		calTotalIncome();
		calTotalExpenses();
		calNetIncome();
	}
	
	
	// 2.3 Encapsulation
	// Create Setter methods
	public void setCostofUtilities(double costofUtilities) {
		this.costofUtilities = costofUtilities;
	}
	
	public void setAdvertisement(double advertisement) {
		this.advertisement = advertisement;
	}
	
	public void setRepair_maintenanceExpenses(double repair_maintenanceExpenses) {
		this.repair_maintenanceExpenses = repair_maintenanceExpenses;
	}
	
	public void setComunicationExpenses(double comunicationExpenses) {
		this.comunicationExpenses = comunicationExpenses;
	}

	public void setRentExpenses(double rentExpenses) {
		this.rentExpenses = rentExpenses;
	}

	public void setOtherExpenses(double otherExpenses) {
		this.otherExpenses = otherExpenses;
	}
	
	public void setEmployeeSalaries(double employeeSalaries) {
		this.employeeSalaries = employeeSalaries;
	}
	
	public void setEmployeeWages(double employeeWages) {
		this.employeeWages = employeeWages;
	}
	
	public void setEmployeeBenefits(double employeeBenefits) {
		this.employeeBenefits = employeeBenefits;
	}
	
	public void setInsuransCost(double insuransCost) {
		this.insuransCost = insuransCost;
	}
	
	public void setIncomeHealthTourism(double income_HealthTourism) {
		this.income_HealthTourism = income_HealthTourism;
	}
	
	public void setIncomeSportTourism(double income_SportTourism) {
		this.income_SportTourism = income_SportTourism;
	}
	
	public void setIncomeCulturalTourism(double income_CulturalTourism) {
		this.income_CulturalTourism = income_CulturalTourism;
	}
	
	
	// 2.3 Encapsulation
	// Create Getter methods
	public double getCostofUtilities() {
		return this.costofUtilities;
	}
	
	public double getAdvertisement() {
		return this.advertisement;
	}
	
	public double getRepair_maintenanceExpenses() {
		return this.repair_maintenanceExpenses;
	}
	
	public double getComunicationExpenses() {
		return this.comunicationExpenses;
	}

	public double getRentExpenses() {
		return this.rentExpenses;
	}

	public double getOtherExpenses() {
		return this.otherExpenses;
	}
	
	public double getEmployeeSalaries() {
		return this.employeeSalaries;
	}
	
	public double getEmployeeWages() {
		return this.employeeWages;
	}
	
	public double getEmployeeBenefits() {
		return this.employeeBenefits;
	}
	
	public double getInsuransCost() {
		return this.insuransCost;
	}
	
	public double getIncomeHealthTourism() {
		return this.income_HealthTourism;
	}
	
	public double getIncomeSportTourism() {
		return this.income_SportTourism;
	}
	
	public double getIncomeCulturalTourism() {
		return this.income_CulturalTourism;
	}
	
	public double getTotalPayment() {
		return 186000;
	}
		
	private void incomeInfo() {
		System.out.println("\n\n***************************INCOME INFORMATION***************************");
	}
		
	private void calTotalIncome() {
		setIncomeHealthTourism(110000);
		setIncomeSportTourism(95000);
		setIncomeCulturalTourism(74000);
		
		totalIncome = income_HealthTourism + income_SportTourism + income_CulturalTourism;
		
		System.out.println("\nIncome : ");
		System.out.println("Health Tourism    : " + "RM " + df2.format(getIncomeHealthTourism()));
		System.out.println("Sport Tourism     : " + "RM " + df2.format(getIncomeSportTourism()));
		System.out.println("Cultural Tourism  : " + "RM " + df2.format(getIncomeCulturalTourism()));
		System.out.println("Total income      : " + "RM " + df2.format(totalIncome));
	}
		
	private void calTotalExpenses() {
		setCostofUtilities(10600);
		setAdvertisement(1100);
		setRepair_maintenanceExpenses(11000);
		setComunicationExpenses(800);
		setRentExpenses(700);
		setOtherExpenses(900);
		setEmployeeSalaries(getTotalPayment());
		setEmployeeWages(32000);
		setEmployeeBenefits(12000);
		setInsuransCost(5800);
		
		totalExpenses = costofUtilities + advertisement + repair_maintenanceExpenses + comunicationExpenses + 
					    rentExpenses + otherExpenses + employeeSalaries + employeeWages + employeeBenefits  + insuransCost;
		
		System.out.println("\nExpenses : ");
		System.out.println("Cost of utilities    : " + "RM " + df2.format(this.getCostofUtilities()));
		System.out.println("Advertisement        : " + "RM " + df2.format(this.getAdvertisement()));
		System.out.println("Repair & maintenance : " + "RM " + df2.format(this.getRepair_maintenanceExpenses()));
		System.out.println("Comunication         : " + "RM " + df2.format(this.getComunicationExpenses()));
		System.out.println("Rent                 : " + "RM " + df2.format(this.getRentExpenses()));
		System.out.println("Others               : " + "RM " + df2.format(this.getOtherExpenses()));
		System.out.println("Employee Salaries    : " + "RM " + df2.format(this.getEmployeeSalaries()));
		System.out.println("Employee Wages       : " + "RM " + df2.format(this.getEmployeeWages()));
		System.out.println("Employee Benefits    : " + "RM " + df2.format(this.getEmployeeBenefits()));
		System.out.println("Insurans             : " + "RM " + df2.format(this.getInsuransCost()));
		System.out.println("Total expenses       : " + "RM " + df2.format(totalExpenses));
	}

	private void calNetIncome() {
		netIncome = totalIncome - totalExpenses;
		
		System.out.println("\nNet Income = Total Income - Total Expenses");
		System.out.println("Total Income   : " + "RM " + df2.format(totalIncome));
		System.out.println("Total Expenses : " + "RM " + df2.format(totalExpenses));
		System.out.println("\nTotal net income for one year is " + "RM " + df2.format(netIncome));
	}
}

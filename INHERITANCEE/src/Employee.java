public class Employee {
	private double annualSalary;
	private int yearOfJoining;
	private String nationalInsuranceNo;
	private String name;
	
	public Employee(String name, double annualSalary, int yearOfJoining, String nationalInsuranceNo) {
		//super(name);
		this.annualSalary = annualSalary;
		this.yearOfJoining = yearOfJoining;
		this.nationalInsuranceNo = nationalInsuranceNo;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public String getNationalInsuranceNo() {
		return nationalInsuranceNo;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [annualSalary=" + annualSalary + ", yearOfJoining=" + yearOfJoining + ", nationalInsuranceNo="
				+ nationalInsuranceNo + ", name=" + name + "]";
	}
}
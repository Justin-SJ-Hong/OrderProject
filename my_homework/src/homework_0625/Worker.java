package homework_0625;

public class Worker extends Person {
	private int workerNum, salary, workHour;
	private double bonus;
	private String jobTitle, rank;
	
	public Worker(String name, String address, String phone, int age, int workerNum, int salary, int workHour,
			double bonus, String jobTitle, String rank) {
		super(name, address, phone, age);
		this.workerNum = workerNum;
		this.salary = salary;
		this.workHour = workHour;
		this.bonus = bonus;
		this.jobTitle = jobTitle;
		this.rank = rank;
	}
	
	public int getWorkerNum() {
		return workerNum;
	}
	public void setWorkerNum(int workerNum) {
		this.workerNum = workerNum;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getWorkHour() {
		return workHour;
	}
	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
}

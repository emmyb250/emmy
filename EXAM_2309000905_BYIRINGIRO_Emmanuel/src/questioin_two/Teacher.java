//BYIRINGIRO EMMANUEL
package questioin_two;

public class Teacher {
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	public Teacher(int id, String name, int salary, int salaryEarned) {
		super();
		this.id = id;
		this.name = name;
		this.salary = 0;
		this.salaryEarned = 0;
	}
	public Teacher(int i, String string, int j) {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalaryEarned() {
		return salaryEarned;
	}
	public void setSalaryEarned(int salaryEarned) {
		this.salaryEarned = salaryEarned;
	}
	public void recievesalary(int salary){
		this.salaryEarned+=salary;
		School.UpdateTotalMoneySpent(salary);
	}
}

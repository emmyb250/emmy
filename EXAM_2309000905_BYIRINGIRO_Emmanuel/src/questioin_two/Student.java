//BYIRINGIRO EMMANUEL
package questioin_two;

public class Student {
	private int id;
	private String name;
	private int grade;
	private int feespaid;
	private int feestotal;
	public Student(int id, String name, int grade, int feespaid, int feestotal) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feespaid = 0;
		this.feestotal = 30000;
	}
	public Student(int i, String string, int j) {

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
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getFeespaid() {
		return feespaid;
	}
	public void setFeespaid(int feespaid) {
		this.feespaid = feespaid;
	}
	public int getFeestotal() {
		return feestotal;
	}
	public void setFeestotal(int feestotal) {
		this.feestotal = feestotal;
	}
	public void payfees(int fees){
		feespaid+=fees;
		School.UpdateTotalMoneyEarned(fees);
	}
}

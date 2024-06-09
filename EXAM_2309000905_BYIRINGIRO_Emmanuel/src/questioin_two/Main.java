//BYIRINGIRO EMMANUEL
package questioin_two;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Teacher alice=new Teacher(2, "aliee", 5000);
		Teacher bob=new Teacher(2, "bob",7000);
		ArrayList<Teacher>teacherList=new ArrayList<Teacher>();
//
		teacherList.add(alice);
		teacherList.add(bob);
		//
		Student charlie=new Student(1, "charlie",4);
		Student david=new Student(2, "david",12);

		
		ArrayList<Student>studentList=new ArrayList<Student>();
		studentList.add(charlie);
		studentList.add(david);
		//
		School ghs=new School(teacherList,studentList);
		charlie.payfees(4000);
		david.payfees(9000);
		System.out.println("school has earned $"+School.getTotalMoneyEarned());
		//
		alice.recievesalary(alice.getSalary());
		System.out.println("school has spent for salary to"+alice.getName()+
				+School.getTotalMoneySpent());
		bob.recievesalary(bob.getSalary());
		System.out.println("scholl has spent for salary to"+bob.getName()+
				+School.getTotalMoneySpent());
	}

}

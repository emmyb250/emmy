//BYIRINGIRO Emmanuel 
package question_one;

import java.sql.*;

import javax.swing.JOptionPane;

public class Employee {
	public String id;
	public String name;
	public String position;
	public Employee(String id, String name, String position) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
	}
	public Employee() {

	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void InsertDataIntodaDabase(){
		String host="jdbc:mysql://localhost/question_one";
		String user="root";
		String password="";
		String sql="INSERT INTO employee(id,name,position)VALUES (?,?,?)";
		String sql2="SELECT * FROM  employee";
		String sql3="UPDATE `employee` SET id=?,name=?,position=? WHERE id=?";
		String sql4="DELETE FROM employee WHERE name=?";
		try(
				Connection con=DriverManager.getConnection(host,user,password);
				PreparedStatement stm=con.prepareStatement(sql);
				Connection con2=DriverManager.getConnection(host,user,password);
				PreparedStatement stm1=con.prepareStatement(sql2);
				Connection con3=DriverManager.getConnection(host,user,password);
				PreparedStatement stm11=con.prepareStatement(sql3);
				Connection con4=DriverManager.getConnection(host,user,password);
				PreparedStatement stm111=con.prepareStatement(sql4);
				){
			stm111.setString(1, this.id);
			stm111.setString(2, this.name);
			stm111.setString(3, this.position);
			int rows=stm111.executeUpdate();
			if(rows>0){
				System.out.println("data inserted succussifful");
				JOptionPane.showMessageDialog(null,"data inserted succussifful","after inserted",JOptionPane.INFORMATION_MESSAGE);

			}
			else{
				System.out.println("data inserted failed");
				JOptionPane.showMessageDialog(null,"data inserted failed","after inserted",JOptionPane.ERROR_MESSAGE);


			}
		}catch(SQLException e){
			e.printStackTrace();


		}

	}
}


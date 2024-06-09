package question_one;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUIEmployee implements ActionListener{
	public JFrame frame;
	//LABEL
	public JLabel id_lb=new JLabel("ID");
	public JLabel name_lb=new JLabel("NAME");
	public JLabel position_lb=new JLabel("POSITION");
    //TEXTFIELD
	public JTextField id_tf=new JTextField();
	public JTextField name_tf=new JTextField();
	public JTextField position_tf=new JTextField();
	//BUTTON
	public JButton insert_btn=new JButton("INSERT");
	public JButton view_btn=new JButton("VIEW");
	public JButton update_btn=new JButton("UPDATE");
	public JButton delete_btn=new JButton("DELETE");
	//
	public GUIEmployee() {
		insertWindow();
		setlocationandsize();
		addcomponetandframe();
		addactionevent();
		
		
	}
	
	
	
	
	
	private void addactionevent() {
		insert_btn.addActionListener(this);
		view_btn.addActionListener(this);
		update_btn.addActionListener(this);
		delete_btn.addActionListener(this);
		
	}





	private void addcomponetandframe() {
		frame.add(id_lb);
		frame.add(name_lb);
		frame.add(position_lb);
		frame.add(id_tf);
		frame.add(name_tf);
		frame.add(position_tf);
		frame.add(insert_btn);
		frame.add(view_btn);
		frame.add(update_btn);
		frame.add(delete_btn);
	}





	private void setlocationandsize() {
		id_lb.setBounds(50, 20, 100, 20);
		name_lb.setBounds(50, 50, 100, 20);
		position_lb.setBounds(50, 80, 100, 20);
	    //TEXTFIELD
		id_tf.setBounds(170, 20, 100, 20);
		name_tf.setBounds(170, 50, 100, 20);
		position_tf.setBounds(170, 80, 100, 20);
		//BUTTON
		insert_btn.setBounds(20, 120, 80, 20);
		view_btn.setBounds(100, 120, 80, 20);
		update_btn.setBounds(180, 120, 80, 20);
		delete_btn.setBounds(260, 120, 80, 20);
		
	}





	private void insertWindow() {
		frame=new JFrame();
		frame.setTitle("Simple Employee Form");
		frame.setBounds(20, 20, 350, 200);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.gray);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
	}





	public void actionPerformed(ActionEvent e) {
		Employee st=new Employee();
		if(e.getSource()==insert_btn){
			st.setName(id_tf.getText());
			st.setName(name_tf.getText());
			st.setName(position_tf.getText());
			st.InsertDataIntodaDabase();
		}
		else if(e.getSource()==view_btn){
			st.setName(id_tf.getText());
			st.setName(name_tf.getText());
			st.setName(position_tf.getText());
			st.InsertDataIntodaDabase();
		}
		else if(e.getSource()==update_btn){
			st.setName(id_tf.getText());
			st.setName(name_tf.getText());
			st.setName(position_tf.getText());
			st.InsertDataIntodaDabase();
		}
		else{
				st.setName(id_tf.getText());
				st.setName(name_tf.getText());
				st.setName(position_tf.getText());
				st.InsertDataIntodaDabase();
			}
		}
		
	
	public static void main(String[] args) {
		GUIEmployee cal=new GUIEmployee();
	}


}


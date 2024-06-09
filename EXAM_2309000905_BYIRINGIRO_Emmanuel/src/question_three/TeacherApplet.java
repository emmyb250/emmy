//BYIRINGIRO EMMANUEL
package question_three;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.UUID;

public class TeacherApplet extends JApplet implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel id;
    private JLabel name;
    private JLabel subject;

    private JTextField idField;
    private JTextField nameField;
    private JTextField subjectField;

    private JButton insertButton;
    private JButton viewButton;
    private JButton updateButton;
    private JButton deleteButton;

    private Connection connection;

    public void init() {
        setLayout(new FlowLayout());
        initComponents();
        addComponents();
        addActionListeners();
        connectToDatabase();
    }

    private void addComponents() {
		// TODO Auto-generated method stub
		
	}

	private void initComponents() {
        id = new JLabel("ID:");
        name = new JLabel("Name:");
        subject = new JLabel("Subject:");

        idField = new JTextField(10);
        nameField = new JTextField(10);
        subjectField = new JTextField(10);

        insertButton = new JButton("Insert");
        viewButton = new JButton("View");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");

        add(id);
        add(idField);
        add(name);
        add(nameField);
        add(subject);
        add(subjectField);
        add(insertButton);
        add(viewButton);
        add(updateButton);
        add(deleteButton);
    }

    private void addActionListeners() {
        insertButton.addActionListener(this);
        viewButton.addActionListener(this);
        updateButton.addActionListener(this);
        deleteButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == insertButton) {
            insertTeacher();
        } else if (e.getSource() == viewButton) {
            viewTeachers();
        } else if (e.getSource() == updateButton) {
            updateTeacher();
        } else if (e.getSource() == deleteButton) {
            deleteTeacher();
        }
    }

    private void connectToDatabase() {
        String url = "jdbc:mysql://localhost:3306/sqlite";
        String username = "root";
        String password = "";

        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database.");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to connect to database.");
        }
    }
    private void insertTeacher() {
        String id = UUID.randomUUID().toString(); // Generate unique id
        String name = nameField.getText();
        String subject = subjectField.getText();

        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO teacher (id, name, subject) VALUES (?, ?, ?)");
            statement.setString(1, id);
            statement.setString(2, name);
            statement.setString(3, subject);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Teacher inserted successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "Error: Failed to insert teacher.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: Failed to insert teacher.");
        }
    }

    private void viewTeachers() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM teacher");
            StringBuilder teachers = new StringBuilder();
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                String subject = resultSet.getString("subject");
                teachers.append("ID: ").append(id).append(", Name: ").append(name).append(", Subject: ").append(subject).append("\n");
            }
            JOptionPane.showMessageDialog(this, teachers.toString());
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: Failed to view teachers.");
        }
    }

    private void updateTeacher() {
        String id = idField.getText();
        String name = nameField.getText();
        String subject = subjectField.getText();

        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE teacher SET name = ?, subject = ? WHERE id = ?");
            statement.setString(1, name);
            statement.setString(2, subject);
            statement.setString(3, id);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Teacher updated successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "Error: No teacher found with the specified ID.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: Failed to update teacher.");
        }
    }

    private void deleteTeacher() {
        String id = idField.getText();

        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM teacher WHERE id = ?");
            statement.setString(1, id);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Teacher deleted successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "Error: No teacher found with the specified ID.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: Failed to delete teacher.");
        }
    }
}

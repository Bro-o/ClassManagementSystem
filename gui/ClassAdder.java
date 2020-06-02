package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ClassAdder extends JFrame{
	public ClassAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelSubject = new JLabel("Subject: ", JLabel.TRAILING);
		JTextField fieldSubject = new JTextField(10);
		labelSubject.setLabelFor(fieldSubject);
		panel.add(labelSubject);
		panel.add(fieldSubject);
		
		JLabel labelClassNo = new JLabel("Class No.: ", JLabel.TRAILING);
		JTextField fieldClassNo = new JTextField(10);
		labelClassNo.setLabelFor(fieldClassNo);
		panel.add(labelClassNo);
		panel.add(fieldClassNo);
		
		JLabel labelClassHour = new JLabel("Class Hour: ", JLabel.TRAILING);
		JTextField fieldClassHour = new JTextField(10);
		labelClassHour.setLabelFor(fieldClassHour);
		panel.add(labelClassHour);
		panel.add(fieldClassHour);
		
		JLabel labelClassRoom = new JLabel("Classroom: ", JLabel.TRAILING);
		JTextField fieldClassRoom = new JTextField(10);
		labelClassRoom.setLabelFor(fieldClassRoom);
		panel.add(labelClassRoom);
		panel.add(fieldClassRoom);
		
		JLabel labelProfessor = new JLabel("Professor: ", JLabel.TRAILING);
		JTextField fieldProfessor = new JTextField(10);
		labelProfessor.setLabelFor(fieldProfessor);
		panel.add(labelProfessor);
		panel.add(fieldProfessor);
		
		JLabel labelProfessorEmail = new JLabel("Professor Email: ", JLabel.TRAILING);
		JTextField fieldProfessorEmail = new JTextField(10);
		labelProfessorEmail.setLabelFor(fieldProfessorEmail);
		panel.add(labelProfessorEmail);
		panel.add(fieldProfessorEmail);
		
		JLabel labelProfessorPhone = new JLabel("Professor Phone: ", JLabel.TRAILING);
		JTextField fieldProfessorPhone = new JTextField(10);
		labelProfessorPhone.setLabelFor(fieldProfessorPhone);
		panel.add(labelProfessorPhone);
		panel.add(fieldProfessorPhone);
		
		panel.add(new JButton("Save"));
		panel.add(new JButton("Cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 8, 2, 6, 6, 6, 6);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}
}

package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

public class ClassViewer extends JPanel{
	
	WindowFrame frame;
	
	public ClassViewer(WindowFrame frame) {
		this.frame = frame;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Subject");
		model.addColumn("ClassNo.");
		model.addColumn("Class Hour");
		model.addColumn("Classroom");
		model.addColumn("Professor");
		model.addColumn("Professor Email");
		model.addColumn("Professor Phone");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}

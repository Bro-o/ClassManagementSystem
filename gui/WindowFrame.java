package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame{
	
	MenuSelection menuSelection;
	ClassAdder classadder;
	ClassViewer classviewer;

	public WindowFrame() {
		this.menuSelection = new MenuSelection(this);
		this.classadder = new ClassAdder(this);
		this.classviewer = new ClassViewer(this);
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		this.setupPanel(menuSelection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuSelection() {
		return menuSelection;
	}

	public void setMenuSelection(MenuSelection menuSelection) {
		this.menuSelection = menuSelection;
	}

	public ClassAdder getClassadder() {
		return classadder;
	}

	public void setClassadder(ClassAdder classadder) {
		this.classadder = classadder;
	}

	public ClassViewer getClassviewer() {
		return classviewer;
	}

	public void setClassviewer(ClassViewer classviewer) {
		this.classviewer = classviewer;
	}
}

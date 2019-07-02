import java.awt.*;
import javax.swing.*;

//* To Do List with space for two items */

public class ToDoList extends JFrame {
	JLabel emptyLabel, emptyLabel2;
	JCheckBox box1, box2;
	JTextField field1, field2;
	
	public ToDoList() {

		JPanel panel = new JPanel(); //set panel
		
		panel.setLayout(new GridLayout(3, 2)); //set the gridlayout with 3 rows & 2 columns
		
		FlowLayout layout = new FlowLayout(); //set layout
		
		JPanel panel2 = new JPanel(); //set panel2
		panel2.setLayout(layout);
		
		emptyLabel = new JLabel(""); //empty line --> first empty field in grid
		panel.add(emptyLabel);
		
		emptyLabel2 = new JLabel(""); //second part of empty line --> second empty field
		panel.add(emptyLabel2);
		
		JCheckBox box1 = new JCheckBox(); //add checkbox
		panel.add(box1);
		
		JTextField field1 = new JTextField(); //add textfield for first checkbox
		panel.add(field1);
		
		JCheckBox box2 = new JCheckBox();
		panel.add(box2);
		
		JTextField field2 = new JTextField();
		panel.add(field2);
		
		add(panel, "North"); //to be horizontal
		
		add(panel2, "South");// to be horizontal
		
		setVisible(true); //show window frame
		
		this.setSize(400, 180); //set size of frame
		
		setTitle("My To Do List"); 
	}
	
	public static void main(String[] args) {
		new ToDoList(); //call method ToDoList()
	}
}

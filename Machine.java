import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Machine extends JFrame{
    private Container pane;
    private JButton[] Buttons = new JButton[20];
    private JTextArea text;
    private JPanel machine;
    private VM jason;
    
    public Machine(){
	setTitle("Vending Machine");
	setSize(600,600);
	setLocation(500,200);
	setDefaultCloseOperation(EXIT_ON_CLOSE);	

	pane = getContentPane();
	pane.setLayout(new FlowLayout());

	text = new JTextArea();
	text.setColumns(40);
	text.setRows(10);
	text.setBorder(BorderFactory.createLineBorder(Color.red,2));
	pane.add(text);
	
	JPanel machine = new JPanel();
	machine.setLayout(new GridLayout(4,5));
	VM jason = new VM();
	for(int i = 0;i<20;i ++){
	    Buttons[i] = new JButton(jason.getItems().get(i).getname());
	    machine.add(Buttons[i]);
	}
	setPreferredSize(new Dimension(400,400));
	machine.setBorder(BorderFactory.createLineBorder(Color.blue,2));
	pane.add(machine);
	
	
    }
    public static void main(String[] args){
	Machine a = new Machine();
	a.setVisible(true);
    }

}

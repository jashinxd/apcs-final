import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Machine extends JFrame implements ActionListener{
    private Container pane;
    private JButton[] Buttons = new JButton[20];
    private double[] sprices = new double[20];
    private JTextArea text;
    private JPanel machine;
    private JLabel price;
    private VM jason;
    
    public Machine(){
	setTitle("Vending Machine");
	setSize(600,600);
	setLocation(500,200);
	setDefaultCloseOperation(EXIT_ON_CLOSE);	

	pane = getContentPane();
	pane.setLayout(new FlowLayout());

	price = new JLabel("Price:");
	pane.add(price);

	text = new JTextArea();
	text.setColumns(10);
	text.setRows(1);
	text.setEditable(false);
	//text.setBackground(Color.BLACK);
	text.setBorder(BorderFactory.createLineBorder(Color.red,2));
	pane.add(text);
	
	JPanel machine = new JPanel();
	machine.setLayout(new GridLayout(10,2));
	VM jason = new VM();
	for(int i = 0;i<20;i ++){
	    Buttons[i] = new JButton(jason.getItems().get(i).getname());
	    sprices[i] = jason.getItems().get(i).getsprice();
	    Buttons[i].setPreferredSize(new Dimension(250,30));
	    machine.add(Buttons[i]);
	    Buttons[i].addActionListener(this);
	}
	//machine.setSize(600,600);
	machine.setBorder(BorderFactory.createLineBorder(Color.blue,2));
	pane.add(machine);
        for (int i = 0; i < 20; i++) {
	    System.out.println(jason.getItems().get(i).getsprice());
	}
    }

    public void actionPerformed(ActionEvent e) {
	for (int i = 0; i < 20; i++) {	    
	    if (e.getSource() == Buttons[i]) {
		text.setText(""+sprices[i]);
		//text.setText("hello");
	    }
	}
    }

    public static void main(String[] args){
	Machine a = new Machine();
	a.setVisible(true);
    }

}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Machine extends JFrame implements ActionListener{
    private Container pane;
    private JButton[] Buttons = new JButton[20];
    private JButton add25c, add1d, add5d, pay; 
    private double[] sprices = new double[20];
    private double amt = 0.00;
    private double prc = 0.00;
    private JTextArea text1, text2;
    private JPanel machine;
    private JLabel price, inserted;
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
	text1 = new JTextArea();
	text1.setColumns(10);
	text1.setRows(1);
	text1.setEditable(false);
	//text1.setBackground(Color.BLACK);
	text1.setBorder(BorderFactory.createLineBorder(Color.red,2));
	pane.add(text1);

	inserted = new JLabel("Amt Inserted");
	pane.add(inserted);
	text2 = new JTextArea("$0.00");
	text2.setColumns(10);
	text2.setRows(1);
	text2.setEditable(false);
	text2.setBorder(BorderFactory.createLineBorder(Color.red,2));
	pane.add(text2);

	//Buttons for Items
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

	//Buttons to Insert Money
	add25c = new JButton("Add $0.25");
	add25c.addActionListener(this);
	pane.add(add25c);
	add1d = new JButton("Add $1.00");
	add1d.addActionListener(this);
	pane.add(add1d);
	add5d = new JButton("Add $5.00");
	add5d.addActionListener(this);
	pane.add(add5d);
	pay = new JButton("Pay");
	pay.addActionListener(this);
	pane.add(pay);
    }

    public void actionPerformed(ActionEvent e) {
	for (int i = 0; i < 20; i++) {
	    if (e.getSource() == Buttons[i]) {
		text1.setText("$"+sprices[i]);
		prc = sprices[i];
		if (text1.getText().length() == 4) {
		    text1.setText(text1.getText() + "0");
		}	       
	    }
	}
	if (e.getSource() == add25c) {
	    if(amt + 0.25 < 10.00){
		amt = amt + 0.25;
		text2.setText("$" + amt);
		if (text2.getText().length() == 4) {
		    text2.setText(text2.getText() + "0");
		}
	    }
	    else{
		System.out.println("Too much dough");
	    }
	}
	if (e.getSource() == add1d) {
	    if(amt + 1.00 < 10.00){
		amt = amt + 1.00 ;
		text2.setText("$" + amt);
		if (text2.getText().length() == 4) {
		    text2.setText(text2.getText() + "0");
		}
	    }
	    else{
		System.out.println("Too much dough");
	    }
	}
	if (e.getSource() == add5d) {
	    if(amt + 5.00 < 10.00){
		amt = amt + 5.00 ;
		text2.setText("$" + amt);
		if (text2.getText().length() == 4) {
		    text2.setText(text2.getText() + "0");
		}
	    }
	    else{
		System.out.println("Too much dough");
	    }
	}
	if(e.getSource() == pay){
	    if(amt >= prc){
		System.out.println("Your Change is $" + (amt - prc));
		amt = 0.00;
		text2.setText("$" + amt + "0");
	    }
	    else{
		System.out.println("You do not have enough money");
	    }
	}
    }

    public static void main(String[] args){
	Machine a = new Machine();
	a.setVisible(true);
    }
}

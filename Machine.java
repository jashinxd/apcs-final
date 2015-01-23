import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Machine extends JFrame implements ActionListener{
    private Container pane;
    private JButton[] Buttons = new JButton[20];
    private JButton add25c, add1d, add5d, replenish,reset,simulate;
    private double[] sprices = new double[20];
    private double[] profit = new double[20];
    private int[] stocks = new int[20];
    //amount inserted into the machine
    private double amt = 0.00;
    //price of item on displayed on vendind machine
    private double prc = 0.00;
    private double change = 0.00;
    private double earn = 0.00;
    private JTextArea text1,text2,text3,response,earning;
    private JPanel machine;
    private JLabel price, inserted, Stock,ProfitMade;
    private VM Vend;
    
    public Machine(){
	setTitle("Vending Machine");
	setSize(600,450);
	setLocation(500,200);
	setResizable(false);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	pane = getContentPane();
	pane.setLayout(new FlowLayout());

	//Displays the price of the item clicked on
	price = new JLabel("Price:");
	pane.add(price);	
	text1 = new JTextArea();
	text1.setColumns(5);
	text1.setRows(1);
	text1.setEditable(false);
       	text1.setBorder(BorderFactory.createLineBorder(Color.red,2));
	pane.add(text1);

	//Displays the amount inserted
	inserted = new JLabel("Amt Inserted");
	pane.add(inserted);
	text2 = new JTextArea("$0.00");
	text2.setColumns(5);
	text2.setRows(1);
	text2.setEditable(false);
	text2.setBorder(BorderFactory.createLineBorder(Color.red,2));
	pane.add(text2);

	//Displays number of items left in the machine
	Stock = new JLabel("Stocks Left");
	text3 = new JTextArea("0");
	text3.setColumns(5);
	text3.setRows(1);
	text3.setEditable(false);
	text3.setBorder(BorderFactory.createLineBorder(Color.red,2));
	pane.add(Stock);
	pane.add(text3);


	//Buttons for Items
	JPanel machine = new JPanel();
	machine.setLayout(new GridLayout(10,2));
	VM vend = new VM();
	for(int i = 0;i<20;i ++){
	    Buttons[i] = new JButton(vend.getItems().get(i).getname());
	    sprices[i] = vend.getItems().get(i).getsprice();
	    profit[i] = sprices[i] - vend.getItems().get(i).getbprice();
	    stocks[i] = vend.getItems().get(i).getstocks();
	    Buttons[i].setPreferredSize(new Dimension(250,30));
	    machine.add(Buttons[i]);
	    Buttons[i].addActionListener(this);
	}

	machine.setBorder(BorderFactory.createLineBorder(Color.blue,2));
	pane.add(machine);

	//Buttons to Insert Money,replenish,and profit
	add25c = new JButton("Add $0.25");
	add25c.addActionListener(this);
	pane.add(add25c);
	add1d = new JButton("Add $1.00");
	add1d.addActionListener(this);
	pane.add(add1d);
	add5d = new JButton("Add $5.00");
	add5d.addActionListener(this);
	pane.add(add5d);
	replenish = new JButton("Replenish Stock");
        replenish.addActionListener(this);
	pane.add(replenish);
	reset = new JButton("Reset Profit");
	reset.addActionListener(this);
	pane.add(reset);
	simulate = new JButton("simulation");
	simulate.addActionListener(this);
	pane.add(simulate);

	//Change and Messages
	response = new JTextArea();
	response.setColumns(25);
	response.setRows(1);
	response.setEditable(false);
	response.setBorder(BorderFactory.createLineBorder(Color.red,2));
	pane.add(response);

	//Profit made by machine
	ProfitMade = new JLabel("Profit Made");
	earning = new JTextArea("$0.00");
	earning.setColumns(5);
	earning.setRows(1);
	earning.setEditable(false);
        earning.setBorder(BorderFactory.createLineBorder(Color.red,2));
	pane.add(ProfitMade);
	pane.add(earning);
	
    }
    public void actionPerformed(ActionEvent e) {
	for (int i = 0; i < 20; i++) {
	    if (e.getSource() == Buttons[i]) {
		prc = sprices[i];
		text3.setText("" + stocks[i]);
		text1.setText("$"+sprices[i]);
		response.setText("");
		// adds extra 0 for displaying purposes
		if (text1.getText().length() == 4) {
		    text1.setText(text1.getText() + "0");
		}
	        if (amt < prc && amt > 0.00){
		    
		    response.setText("You do not have enough money, you need $" + (prc - amt) + " more"); 
		}
		else if(amt >= prc && stocks[i] > 0){
		    
		    stocks[i] = stocks[i] -1;
		    text3.setText("" + stocks[i]);
		    response.setText("Your change is $" + (amt - prc));
		    earn = earn + profit[i];
		    earning.setText("$" + earn);
		    //Aesthetic reasons
		    int len = earning.getText().length();
		    if(earning.getText().substring(len - 2, len - 1).equals(".")){
			earning.setText(earning.getText() + "0");
		    }
		    // See L124
		    if (response.getText().length() == 19) {
			response.setText(response.getText() + "0");
		    }
		    amt = 0.00;
		    prc = 0.00;
		    text1.setText("$" + prc);
		    // See L124
		    if (text1.getText().length() == 4) {
			text1.setText(text1.getText() + "0");
		    }
		    text2.setText("$" + amt);
		    // See L124
		    if (text2.getText().length() == 4) {
			text2.setText(text2.getText() + "0");
		    }
		}
		else if (stocks[i] == 0){
		    response.setText("there are no more stocks");
		}
	    }
	}
	if (e.getSource() == add25c) {
	    if(amt + 0.25 < 10.00){
		amt = amt + 0.25;
		text2.setText("$" + amt);
		// See L124
		if (text2.getText().length() == 4) {
		    text2.setText(text2.getText() + "0");
		}
	    }
	    else{
		response.setText("Machine does not take more than $10");
	    }
	}
	if (e.getSource() == add1d) {
	    if(amt + 1.00 < 10.00){
		amt = amt + 1.00 ;
		text2.setText("$" + amt);
		// See L124
		if (text2.getText().length() == 4) {
		    text2.setText(text2.getText() + "0");
		}
	    }
	    else{
	        response.setText("Machine does not take more than $10");
	    }
	}
	if (e.getSource() == add5d) {
	    if(amt + 5.00 < 10.00){
		amt = amt + 5.00 ;
		// See L116
		text2.setText("$" + amt);
		if (text2.getText().length() == 4) {
		    text2.setText(text2.getText() + "0");
		}
	    }
	    else{
	        response.setText("Machine does not take more than $10");
	    }
	}
	if(e.getSource() == replenish){
	    Random r = new Random();
	    int compare = 0;
	    //Stocks replenish only if the random is greater than current stock
	    for(int i = 0; i < stocks.length; i ++){
		compare = r.nextInt(11) + 5;
		if(compare > stocks[i]){
		    stocks[i] = compare;
		}
	    }
	    response.setText("Stocks replenished");
	}
	//Resets the profit
	if(e.getSource() == reset){
	    earn = 0.00;
	    earning.setText("$" + earn + "0");
	}
	if(e.getSource() == simulate){
	    Random r = new Random();
	    int rand = 0;
	    for(int i = 0; i < 20; i ++){
		rand = r.nextInt(20);
		//Will buy only if there are stocks left
		if(stocks[rand] > 0){
		    stocks[rand] = stocks[rand] - 1;
		    earn = earn + profit[rand];
		    earning.setText("$" + earn);
		    //Aesthetic reasons
		    int len = earning.getText().length();
		    if(earning.getText().substring(len - 2, len - 1).equals(".")){
			earning.setText(earning.getText() + "0");
		    }
		}
	    }
	}
    }
    public static void main(String[] args){
	Machine a = new Machine();
	a.setVisible(true);
    }
}

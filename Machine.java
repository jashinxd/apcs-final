import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Machine extends JFrame{
    private Container pane;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
    private JButton[] Buttons = new JButton[20];
    JButton[] Button = {b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20};
    private VM jason;
    public Machine(){
	setTitle("Vending Machine");
	setSize(600,600);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = getContentPane();
	pane.setLayout(new GridLayout(5,4,25,25));
	VM jason = new VM();
	for(int i = 0;i<20;i ++){
	    Buttons[i] = new JButton(jason.getItems().get(i).getname());
	    pane.add(Buttons[i]);
	}
     
    }
    public static void main(String[] args){
	Machine a = new Machine();
	a.setVisible(true);
    }

}

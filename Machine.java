import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Machine extends JFrame{
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
    public Machine(){
	setTitle("Vending Machine");
	setSize(600,600);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
     
    }
    public static void main(String[] args){
	Machine a = new Machine();
	a.setVisible(true);
    }

}

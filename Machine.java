import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Machine extends JFrame{
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

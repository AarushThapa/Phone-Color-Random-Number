import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class RandomPanel extends JPanel implements ActionListener
{
    // declaring all frame, panel, button and label
    JFrame second;
    JPanel panel1;
    JPanel panel2;
    JButton btn_1;
    JLabel display;
    public RandomPanel(){
        try{
    // creating a new frame
    second = new JFrame("Random Text Generator");
    second.setLayout(new GridLayout(2,0));
    second.setSize(400,400);
    second.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // creating two  new panels
    panel1 = new JPanel();
    panel2 = new JPanel();
    
    // creating a new label
    display = new JLabel();
    
    // creating a new button
    btn_1 = new JButton("New Random");
    btn_1.addActionListener(this);
    
    // adding the panels in frame
    second.add(panel1);
    second.add(panel2);
    
    // adding the display in panel one
    panel1.add(display);
    
    // adding the button in panel two
    panel2.add(btn_1);
    
    second.setVisible(true);
    }
    catch(Exception ex){
    System.out.println("Error: "+ ex.getMessage());
    }

    }
    @Override
    public void actionPerformed(ActionEvent x){
        // to check if the button is clicked
    if(x.getSource().equals(btn_1)){
        // generating a random number from 1 to 100
    int e= (int) (100*Math.random()+1);
    String str = String.valueOf(e);
    display.setFont(new Font("TimesRoman", Font.PLAIN,100));
    // displaying the number in the given font 
    display.setText(str);
    }
    }
}

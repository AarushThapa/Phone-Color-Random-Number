import java.awt.*;
import javax.swing.*;
import java.awt.color.*;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ColorDisplay implements ActionListener
{
    // declaring varaible from frame, label, panel and button
   JFrame display;
   JLabel colordisplay;
   JLabel red_label;
   JLabel green_label;
   JLabel blue_label;
   JTextField green_txt;
   JTextField blue_txt;
   JTextField red_txt;
   JPanel part1;
   JPanel part2;
   JPanel part3;
   JButton btn_color;
   public ColorDisplay(){
       try{
   // creating a new frame
   display = new JFrame();
   display.setSize(500,300);
   display.setLayout(new GridLayout(3,0));
   display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   // creating two new panel
   part1 = new JPanel();
   part2 = new JPanel();
   part2.setLayout(new GridLayout(2,0));
   part3 = new JPanel();
   
   // creating label for the display and the color names
   colordisplay = new JLabel("Color Display");
   colordisplay.setFont(new Font("TimesRoman",Font.PLAIN,70));
   red_label= new JLabel("Red",SwingConstants.CENTER);
   red_label.setPreferredSize(new Dimension(100,100));
   green_label= new JLabel("Green",SwingConstants.CENTER);
   blue_label= new JLabel("Blue",SwingConstants.CENTER);
   
   // creating new text to input the numeric values
   red_txt = new JTextField(3);
   green_txt = new JTextField(3);   
   green_txt.setPreferredSize(new Dimension(90,30));
   blue_txt = new JTextField(3); 
   blue_txt.setPreferredSize(new Dimension(90,30));
   
   // creating a new button to change the color
   btn_color = new JButton("Display Color");
   btn_color.addActionListener(this);
   
   // adding the display in panel 1, label and text field in panel 2 and button in panel 3
   part1.add(colordisplay);
   part2.add(red_label);
   part2.add(green_label);
   part2.add(blue_label);
   part2.add(red_txt);
   part2.add(green_txt);
   part2.add(blue_txt);
   part3.add(btn_color);
   
   // adding all the panel in frame 
   display.add(part1);
   display.add(part2);
   display.add(part3);
   
   display.setVisible(true);
   }
   catch(Exception ex){
    System.out.println("Error: "+ ex.getMessage());
   }
  }
  @Override
  public void actionPerformed(ActionEvent x){
    if(x.getSource().equals(btn_color)){
        try{
        int r = Integer.parseInt(red_txt.getText());        
        int g = Integer.parseInt(green_txt.getText());       
        int b = Integer.parseInt(blue_txt.getText());     
        // changing the color of the display
        part1.setBackground(new Color(r,g,b));
    }
    catch(NumberFormatException ex){
    System.out.println("Error: "+ex.getMessage());
    }
    catch(IllegalArgumentException ex){
    System.out.println("Error: "+ex.getMessage());
    }
    catch(Exception ex){
    System.out.println("Error: "+ex.getMessage());
    }
    }
    }
}

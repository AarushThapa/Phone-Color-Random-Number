import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Phone implements ActionListener, PhoneInterface
{
    // Declaring all the variables, frame,panel, buttons, and text space
    JFrame app;
    JPanel panel1;
    JPanel panel2;
    JButton btn_clear;
    JButton btn_1;
    JButton btn_2;
    JButton btn_3;
    JButton btn_4;
    JButton btn_5;
    JButton btn_6;
    JButton btn_7;
    JButton btn_8;
    JButton btn_9;
    JButton btn_0;
    JButton btn_call;
    JTextField txt_space;
    
    public Phone(){
        
        try{
    // creating a new frame
    app = new JFrame("Phone");
    app.setSize(350,250);
    app.setLayout(new FlowLayout());
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // creating two new panels
    panel1= new JPanel();
    panel2= new JPanel();
    panel2.setLayout(new GridLayout(4,3,10,10));
    
    txt_space = new JTextField(22);
    txt_space.setPreferredSize(new Dimension(300,30));
    
    btn_1= new JButton("1");
    btn_1.setPreferredSize(new Dimension(90,30));
    btn_1.addActionListener(this);
    
    btn_2= new JButton("2");
    btn_2.setPreferredSize(new Dimension(90,30));
    btn_2.addActionListener(this);
    
    btn_3= new JButton("3");
    btn_3.setPreferredSize(new Dimension(90,30));    
    btn_3.addActionListener(this);
    
    btn_4= new JButton("4");
    btn_4.setPreferredSize(new Dimension(90,30));
    btn_4.addActionListener(this);
    
    btn_5= new JButton("5");
    btn_5.setPreferredSize(new Dimension(90,30));
    btn_5.addActionListener(this);
    
    btn_6= new JButton("6");
    btn_6.setPreferredSize(new Dimension(90,30));
    btn_6.addActionListener(this);
    
    btn_7= new JButton("7");
    btn_7.setPreferredSize(new Dimension(90,30));
    btn_7.addActionListener(this);
    
    btn_8= new JButton("8");
    btn_8.setPreferredSize(new Dimension(90,30));
    btn_8.addActionListener(this);
    
    btn_9= new JButton("9");
    btn_9.setPreferredSize(new Dimension(90,30));
    btn_9.addActionListener(this);
    
    btn_0= new JButton("0");
    btn_0.setPreferredSize(new Dimension(90,30));
    btn_0.addActionListener(this);
    
    btn_clear = new JButton("Clear");
    btn_clear.setPreferredSize(new Dimension(90,30));
    btn_clear.addActionListener(this);
    
    btn_call= new JButton("Call");
    btn_call.setPreferredSize(new Dimension(90,30));
    btn_call.addActionListener(this);
    
    // adding the panels in frame
    app.add(panel1);
    app.add(panel2);
    // adding in panel one for the text space
    panel1.add(txt_space);
    
    // adding in panel two: all the buttons 
    panel2.add(btn_1);
    panel2.add(btn_2);
    panel2.add(btn_3);
    panel2.add(btn_4);
    panel2.add(btn_5);
    panel2.add(btn_6);
    panel2.add(btn_7);
    panel2.add(btn_8);
    panel2.add(btn_9);
    panel2.add(btn_clear);
    panel2.add(btn_0);
    panel2.add(btn_call);
    
    // app.setRelativeLocationTo(null);
    app.setResizable(false);
    app.setVisible(true);
    }
    catch(Exception ex){
    System.out.println("Error: "+ ex.getMessage());
    }
    }
    @Override
    
    public void actionPerformed(ActionEvent e){
       // knowing which button was pressed and displaying it in text view
     if(e.getSource().equals(btn_1)){
        String tex = txt_space.getText() + btn_1.getText(); 
        txt_space.setText(tex);
        }
     if(e.getSource().equals(btn_2)){
        String tex = txt_space.getText() + btn_2.getText(); 
        txt_space.setText(tex);
        }
     if(e.getSource().equals(btn_3)){
        String tex = txt_space.getText() + btn_3.getText(); 
        txt_space.setText(tex);
        }
     if(e.getSource().equals(btn_4)){
        String tex = txt_space.getText() + btn_4.getText(); 
        txt_space.setText(tex);
        }
     if(e.getSource().equals(btn_5)){
        String tex = txt_space.getText() + btn_5.getText(); 
        txt_space.setText(tex);
        }
     if(e.getSource().equals(btn_6)){
        String tex = txt_space.getText() + btn_6.getText(); 
        txt_space.setText(tex);
        }
     if(e.getSource().equals(btn_7)){
        String tex = txt_space.getText() + btn_7.getText(); 
        txt_space.setText(tex);
        }
     if(e.getSource().equals(btn_8)){
        String tex = txt_space.getText() + btn_8.getText(); 
        txt_space.setText(tex);
        }   
     if(e.getSource().equals(btn_9)){
        String tex = txt_space.getText() + btn_9.getText(); 
        txt_space.setText(tex);
        }
     if(e.getSource().equals(btn_0)){
        String tex = txt_space.getText() + btn_0.getText(); 
        txt_space.setText(tex);
        }
        
        // calling clear function when the button is clicked
     if(e.getSource().equals(btn_clear)){ 
        clear();
        }
        
     // calling call function when calling and hangout function when hanging out the phone
     if(e.getSource().equals(btn_call)){
       if(btn_call.getText().equals("Call")){
       String ph = txt_space.getText();
       call(ph);
        }
       else if(btn_call.getText().equals("Hang up")){
        clear();
        hangup();
       }
     }
    }
    @Override
    public void call(String phoneNumber){
        // checking if the length of the number is 10
        if(phoneNumber.length()==10){
        txt_space.setText("Calling "+phoneNumber);
        btn_call.setText("Hang up");
       }
       else{
        txt_space.setText("Wrong number");
        }
    }
    public void hangup(){
        // changing the text of button call
        btn_call.setText("Call");
    }
    public void clear(){
        // making the textfield empty
        txt_space.setText("");
    }
}

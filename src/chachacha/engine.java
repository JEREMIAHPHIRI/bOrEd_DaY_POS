/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chachacha;
import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author j3r3miah
 */
public class engine extends JFrame{
    JLabel nameLabel,firstnumLabel,secondnumLabel,answerLabel;
    JTextField name,firstnum,secondnum,answer;
    JPanel labelPanel,barPanel,subcontainer,container;
    JButton button;

public engine()
 {super(" The Accountant");
  setLayout(new FlowLayout());
  
     name=new JTextField(8);
     firstnum=new JTextField(8);
     secondnum=new JTextField(8);
     answer=new JTextField(8);
     answer.setEditable(false);
     
//button for processing

button=new JButton("PAYOUT");
// panel controls Below
     
     labelPanel=new JPanel(new GridLayout(3,1,3,4));
     barPanel=new JPanel(new  GridLayout(3,1,3,4));
     subcontainer=new JPanel(new GridLayout(2,2,5,2));
     container=new JPanel(new GridLayout(2,1));
     
     
     //label containers
     
        nameLabel=new JLabel("ENTER YOUR NAME");
        firstnumLabel=new JLabel("CASHED IN");
        secondnumLabel=new JLabel("AMOUNT OF ACTUAL PRODUCTS:");
        answerLabel=new JLabel("CHANGE:");
     
     //putting everything together
     
        labelPanel.add(firstnumLabel,BorderLayout.EAST);
        labelPanel.add(secondnumLabel);
        labelPanel.add(answerLabel);
        
       // barPanel.add(name);
        barPanel.add(firstnum,BorderLayout.WEST);
        barPanel.add(secondnum);
        barPanel.add(answer);

       
        subcontainer.add(labelPanel);
        subcontainer.add(barPanel);
        subcontainer.add(button);
        add(subcontainer);
       
        
        //actionListening
      handle handler=new handle();
       firstnum.addActionListener(handler);
        secondnum.addActionListener(handler);
        answer.addActionListener(handler);
        button.addActionListener(handler);
        
        
         
       
 }    
    //event handling proceedure
        public class handle implements ActionListener
        { 
          public void actionPerformed(ActionEvent ae)
          {if(ae.getSource()==button)
            {
                try
                {
                    String firstnumtext=firstnum.getText();
                    String secondnumtext=secondnum.getText();
                    
                    double fn=Double.parseDouble(firstnumtext);
                    double sn=Double.parseDouble(secondnumtext);
                    
                    double math= fn-sn;
                     double finalanswer=math;
                      String getAnswer=String.valueOf(finalanswer);
                     answer.setText(getAnswer);
                     
                    JOptionPane.showMessageDialog(null,"THANKS FOR TRYING IT OUT... YEP I WAS BORED");
                
                
                }
                catch(Exception a)
                {
                  JOptionPane.showMessageDialog(null,"WRONG INPUT");
                
                
                }
          
          
          
          
            }
          
          
          }
        
        
        
        
        }  


}

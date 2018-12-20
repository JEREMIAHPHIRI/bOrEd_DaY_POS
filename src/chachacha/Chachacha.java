/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chachacha;
import javax.swing.*;
/**
 *
 * @author j3r3miah
 */
public class Chachacha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        engine object=new engine();
        object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        object.setSize(500,210);
        object.setVisible(true);
    }
    
}

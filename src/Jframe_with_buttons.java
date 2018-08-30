
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Jframe_with_buttons {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        String[] options = new String[3];
        options[0] = new String("I Need To Buy");
        options[1] = new String("Learn More");
        options[2] = new String("I Don't Want to Buy");
        int showOptionDialog = JOptionPane.showOptionDialog(frame.getContentPane(),"You Need to Buy Pro Version of this Software To Access These Reports!","Do You need to Buy the Pro Version", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
        //System.out.println(showOptionDialog);
        if (showOptionDialog==0) {
           
        }
        else if (showOptionDialog==1) {
           
        }
        else{
        
        }
   
    }
}

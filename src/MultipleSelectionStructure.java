// A simple java Applet which is a Java application that is integrated into a webpage. 

import java.awt.Graphics;
import javax.swing.*; // This line imports JOptionPane and JApplet classes from the javax.swing package.



// This line extends JApplet class means that MultipleSelectionStructure is an applet and it inherits properties and methods from JApplet
public class MultipleSelectionStructure extends JApplet {
    // creating a integer variable to hold the users choice
     int choice;
    
     // A method for intialization tasks 
    public void init(){ 
        String input;
        
        //This line displays an input dialog box
        // The box prompts the user to enter a value
        input = JOptionPane.showInputDialog(
        "Enter 1 to draw lines\n" +
        "Enter 2 to draw rectangles\n" +
        "Enter 3 to draw ovals\n" );        
        
       // converting a string to a integer value and storing in the choice variable
       choice = Integer.parseInt( input );
      
      
       
       
    }
    // A method for whenever the applet needs to be painted or repainted
    public void paint (Graphics g){
        // creating a for loop as well as a switch case to draw the users choice
        // loop exceutes 10 times
        for (int i = 0; i < 10; i++){
            switch(choice){
                case 1:
                    g.drawLine(10, 10, 250, 10 + i * 10);
                    break;
                case 2:
                    g.drawLine(10 + i * 10, 10 +i * 10,
                               50 + i * 10, 50 + i * 10);
                    break;
                case 3:
                    g.drawLine(10 + i * 10, 10 +i * 10,
                               50 + i * 10, 50 + i * 10);
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Invalid value entered");
            }
            
        }
        
    }
  
    public static void main(String[] args) {
       MultipleSelectionStructure mss = new MultipleSelectionStructure(); // creating an object for MultipleSelectionStructure 
        mss.init(); // calling the init method so it can display

        JFrame frame = new JFrame("Drawing Example"); // creating a new JFrame object 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mss);
        frame.setSize(400, 400); // the size of the frame , width and height
        frame.setVisible(true); // this line makes the frame visible on the screen
        
    }
    
}

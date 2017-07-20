import java.awt.*;
import java.awt.event.*;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class SimpleGUI extends JApplet {
   public static void main(String [] args) {
      // Initialize Window and Call it Window.
      JFrame window = new JFrame("Window");

      // EventListner: Kill Command Line Program On Close.
      window.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });

      // MANDATORY CONFIGURATION TO SHOW GUI
      window.setSize(new Dimension(500, 500));
      window.setVisible(true);
   }
}

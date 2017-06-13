
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author thiagomurphy
 */

public class Painter {
    
    public static void main(String[] args){
        
        //create JFrame
        JFrame app = new JFrame();
        
        PaintPanel paintPanel = new PaintPanel();//create paint panel
        app.add(paintPanel, BorderLayout.CENTER);//in center
        
        //create a label and place it in SOUTH of BorderLayout
        app.add(new JLabel("Drag the mouse to draw"), BorderLayout.SOUTH);
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(400, 200);//set frame size
        app.setVisible(true);//display frame
    }//end main
}//end class Painter

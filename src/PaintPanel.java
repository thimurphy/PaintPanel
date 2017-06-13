
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;


/**
 *
 * @author thiagomurphy
 */


public class PaintPanel extends JPanel{
    
    private int pointCount = 0;//count number of points
    
    //array of 10000 java.awt.Point references
    private Point[] points = new Point[10000];
    
    //set up GUI and register mouse event handler
    public PaintPanel(){
        
        //handle frame mouse motion event
        addMouseMotionListener( 
                new MouseMotionAdapter(){ //anonymous inner class
                    
                    //store drag coordinates and repaint
                    public void mouseDragged(MouseEvent event){
                        
                        if(pointCount < points.length){
                            points[pointCount] = event.getPoint();//find point
                            ++pointCount;//increase number of points in the array
                            repaint();//repaint JFrame
                            
                        }//end if statement
                    }//end inner class
            
        });//end MouseMotionListner method
        
    }//end constructor
    
    //draw ovals in a 4 by 4 bounding box at specified locations on windows
    public void paintComponent(Graphics g){
        super.paintComponent(g);//clears drawing area
        
        //draw all point in array
        for(int i = 0; i < pointCount; i++){
            g.fillOval(points[i].x, points[i].y, 4, 4);
        }//end for
    }//end method paintComponent
    
}//end class PaintPanel

/**
 * Write a description of class LoopDrawing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawingPicture extends JComponent{
    public void paintComponent(Graphics g){

	Color White = new Color(255, 255, 255);
	

        Graphics2D g2 = (Graphics2D)g;

	g2.setColor(White);

	
	Rectangle box2 = new Rectangle(0, 0, 1000, 1000);
	g2.fill(box2);

	Color Blue = new Color(13, 22, 41);
	g2.setColor(Blue);
	
	g2.setStroke(new BasicStroke (10));

	Ellipse2D.Double circle3 = new Ellipse2D.Double(100, 112.5, 600, 480);
	g2.fill(circle3);

	g2.setColor(White);

	g2.setStroke(new BasicStroke (10));	

	Ellipse2D.Double circle2 = new Ellipse2D.Double(150, 150, 500, 400);
	g2.fill(circle2);
        
	g2.setStroke(new BasicStroke (50));
	
	Color Orange = new Color(185, 67, 31);
	g2.setColor(Orange);
	
	Ellipse2D.Double circle1 = new Ellipse2D.Double(175, 175, 450, 350); 
	g2.fill(circle1);
	
	g2.setColor(White);

	Ellipse2D.Double circle4 = new Ellipse2D.Double(200, 200, 400, 300); 
	g2.fill(circle4);
	

	Rectangle box1 = new Rectangle(550, 275, 150, 175);
	g2.fill(box1);
	

	g2.setStroke(new BasicStroke (1));


   	// comment this out once you have finished
        //drawGrid(g2);
    }
    public void drawGrid(Graphics g2){
        g2.setColor(new Color(211, 211, 211));
        
        // Draw vertical lines
        for(int x = 0; x < 1000; x += 50){
            g2.drawLine(x, 0, x, 1000);
            g2.drawString("" + x, x, 10);
        }
        
        // Draw horizontal lines
        for(int y = 50; y < 1000; y += 50){
            g2.drawLine(0, y, 1000, y);
            g2.drawString("" + y, 0, y);
        }
    }
}
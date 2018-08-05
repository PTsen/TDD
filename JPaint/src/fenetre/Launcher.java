package fenetre;

import javax.swing.*;
import java.awt.*;

public class Launcher 
{
	public static void main (String args[]) 
	{      
		SplashProgress progress = new SplashProgress();
		
    	JWindow window = new JWindow();
    	window.getContentPane().add(
    	    new JLabel(new ImageIcon("images/plogo.png")),BorderLayout.CENTER);
    	
    	window.getContentPane().add(progress.getBar(), BorderLayout.SOUTH);
    	window.setBounds(500, 150, 450, 350);
    	window.setVisible(true);
    	
    	try 
    	{
    	    Thread.sleep(11000);
    	} 
    	catch (InterruptedException e) 
    	{
    	    e.printStackTrace();
    	}
    	
    	window.setVisible(false);
    	JpaintInterface jpaint = new JpaintInterface();
    	window.dispose();
    	
    }
}

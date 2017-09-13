/**
* (Tutor: display HTML files and change in response to a slider)
* (Assignment number: Recitation Project 1)
* Completion time: 10 hours
*
* @author Megan Hiestand,  @version 2
*/

import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.html.HTMLEditorKit;

import java.awt.*;
import java.io.*;
import java.net.URL;


public class Tutor extends JPanel{

		//int to determine sliders position
	 int sliderPosition;
	 
	 	//create name label for position 0
	JLabel initialname = new JLabel ("Megan Hiestand");
	
		//create Jpane to sit in Jframe 
	JEditorPane javaFrame = new JEditorPane();
	
	java.net.URL htmlFile1 = Tutor.class.getResource(
            "P1.html");
	java.net.URL htmlFile2 = Tutor.class.getResource(
            "P2.html");
	java.net.URL htmlFile3 = Tutor.class.getResource(
            "P3.html");
	java.net.URL htmlFile4 = Tutor.class.getResource(
            "P4.html");
	
	
	public Tutor() throws IOException
	{
		sliderPosition = 0; 
			//creates dynamic frame
		setLayout(new GridBagLayout());
        GridBagConstraints newframe = new GridBagConstraints();
        	//sets frame to html files 
        add(initialname, newframe);
        	//sets JEditorPane to HTML
       HTMLEditorKit AddFrame = new HTMLEditorKit();
       javaFrame.setEditorKit(AddFrame);
	}

	//method in universe class that knows location of slider 
	public void sliderChange (int location) 
	{
		sliderPosition= location;
		try {
		
		if(sliderPosition==1)
		{	
			javaFrame.setPage(htmlFile1);
		}
		else if(sliderPosition==2)
		{
			javaFrame.setPage(htmlFile2);
		}
		else if(sliderPosition==3)
		{
			javaFrame.setPage(htmlFile3);
		}
		else if(sliderPosition==4) 
		{
			javaFrame.setPage(htmlFile4);
		}
		else //default position 0
		{
			add(initialname);
		}
		
		}
	//end of try block

		catch(FileNotFoundException e)
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		catch (IOException e)
	{
			javaFrame.setText("Could not display HTML page");
	}	
	//end of catch statements	
	}

}
//end of program 

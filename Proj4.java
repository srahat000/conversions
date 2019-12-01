//Sabahat Rahat
//chapter 4- critical thinkingn question
//this program gives the user the option to do 2 conversions
//the user can either choose to convert a number to a hexstring, 
//ocstring, and binstring
//or the user can choose to convert feet and inches to centimeters and
//meters

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Proj4 extends Applet implements ActionListener{
	
	Button button1, button2, button3, button4;
	Label label1, label2;
	TextField text1, text2;
	
	int number;
	String hexstring, octstring, binstring;
	Double feet, inches;
	double tempInches, tempTotal, centMtr, mtr;
	
	public void init() {
		
		//Button1 asks if users wants to convert decimal to
		//hecidecimal, octal, and binary 
		setLayout(null);
		button1 = new Button("Decimal to hexidecimal, octal, and Binary conversion");
		button1.setBounds(30, 30, 150, 30);
		add(button1);
		button1.addActionListener(this);
		
		
		//Button2 asks if user wants to convert feet and inches to
		//centimeters and meters
		button2 = new Button("Feet and inches to Centimeters and meters conversion");
		button2.setBounds(200, 30, 150, 30);
		add(button2);
		button2.addActionListener(this);
		
		
		//button3 allows the user to convert after they 
		//have entered the decimal number
		button3 = new Button("Convert decimal");
		button3.setBounds(30,240,150,30);
		add(button3);
		button3.addActionListener(this);
		button3.hide(); //this button is hidden from user when the applet
		//is first intiated
		
		
		//button 4 allows user to convert feet and inches after they have types
		//in the necessary textboxes 
		button4  = new Button("Convert feet and inches");
		button4.setBounds(200,240,150,30);
		add(button4);
		button4.addActionListener(this);
		button4.hide();//this is hidden intially
		
		//label 1 is a label that can be set to ask the user different questions
		//based on their choice. It is also hidden until the user 
		//decides between the 2 conversions
		label1 = new Label();
		label1.setBounds(30,90,150,15);
		add(label1);
		label1.hide();
		
		
		//text 1 is the textfield for label 1 that is also
		//hidden until the user makes a decision
		text1 = new TextField(10);
		text1.setBounds(180,90,150,20);
		add(text1);
		text1.hide();
		
		//label2 can also ask the user different questions
		//based on their choice and is hidden
		label2 = new Label();
		label2.setBounds(30,150,150,15);
		add(label2);
		label2.hide();
		
		//text 2 is the textfield for label 2 and 
		//is hidden
		text2 = new TextField(10);
		text2.setBounds(180,150, 150,20);
		add(text2);
		text2.hide();
		
	}
	
	
	//when an action is performed, the program determines
	//which button called this function and based on the button
	//the specific conversion takes place
	public void actionPerformed(ActionEvent e) {
		
		//decimal conversion set a question for label 1 and now 
		//shows that labels and textfields that were hidden
		if(e.getSource() == button1)
		{
			label1.setText("Decimal: ");
			label1.show();
			label2.hide();
			text1.show();
			text2.hide();
			
			button3.show();
			button4.hide();
				
		}
		
		//if feet and inches conversion is chosen
		//label 1 and label2 are set to a different text value
		if(e.getSource() == button2)
		{
			label1.setText("Feet: ");
			label1.show();
			text1.show();
			
			label2.setText("Inches: ");
			label2.show();
			text2.show();
			
			button4.show();
			button3.hide();
			
		}
		
		//convert decimal is chosen
		//and converison takes place
		if(e.getSource() == button3)
		{
			number = Integer.parseInt(text1.getText());
			hexstring = Integer.toHexString(number).toUpperCase();
			octstring = Integer.toOctalString(number);
			binstring = Integer.toBinaryString(number);
			
			//conversion is displayed to the screen
			showStatus("The decimal "+ number + 
					" as a hexideciaml is "+ hexstring + ", as a Octal number is "
					+ octstring + ", and as a binary number is " + binstring + ".");
		}
		
		
		//convert feet and inches is chosen
		//and conversion takes place
		if(e.getSource() == button4)
		{
			feet = Double.valueOf(text1.getText());
			inches = Double.valueOf(text2.getText());
			tempInches = feet.doubleValue() * 12;
			tempTotal = tempInches + inches.doubleValue();
			centMtr = tempTotal * 2.54;
			mtr = centMtr / 100;
			
			//results are shown to the screen
			showStatus(feet + " feet and " + inches + " inches converts to "
					+ centMtr + " centimeters and " + mtr + " meters.");
		}
	}
	}



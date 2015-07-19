//Michael Cadet CSC210 121

/**
Write a program that prompts the user to input an integer between 0 and 35. 
If the number is less than or equal to 9, the program should output the number;
otherwise, it should output A for 10, B for 11 C for 12… and Z for 35. 
**/

import javax.swing.JOptionPane;
public class exercise4
{

public static void main(String[] args)
{

int i,number1;
char a,b,c,z;
String dummy;

dummy = JOptionPane.showInputDialog("Enter a number");
number1 = Integer.parseInt(dummy);


 	 while((number1>=0)&&(number1<=35))
  		{

        if(number1==10)
        {   
        	System.out.println("A");
         }

        else if(number1==11)
        {   
        	System.out.println("B");
         }
		 else if(number1==12)
        {   
        	System.out.println("C");
         }
		else if(number1==35)
        {   
        	System.out.println("Z");
         }
		else if(number1<=9)
        {   
        	System.out.println(""+number1);
         }


		dummy = JOptionPane.showInputDialog("Enter a number");
		number1 = Integer.parseInt(dummy);
		}
	
	System.out.println("Sorry, Try Again");

	}
} 


/**
     ----jGRASP wedge: pid for wedge is 5556.
     ----jGRASP wedge2: pid for wedge2 is 5480.
     ----jGRASP wedge2: actual command sent ["C:\Program Files (x86)\Java\jdk1.6.0_18\bin\java.exe" exercise4].
     ----jGRASP wedge2: pid for process is 3608.
    
    
    Try Again
    Z
    B
    A
    2
    
    **/
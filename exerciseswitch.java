/**
Write a program
**/

//Michael Cadet 
import javax.swing.JOptionPane;
public class exerciseswitch
{
  public static void main(String[] args)
  {
  
  //VARIABLES
  int num1,num2,result;
  String dummy;
  char type;
  
  //Q1
  dummy = JOptionPane.showInputDialog("Enter a Number");
  num1 = Integer.parseInt(dummy);
  
  //Q2
  dummy = JOptionPane.showInputDialog("Enter a Operation (Multiply, Divide, Add, Subtract)");
  type = dummy.charAt(0);
  
  //Q3
  dummy = JOptionPane.showInputDialog("Enter a Second Value");
  num2 = Integer.parseInt(dummy);
  
  
  switch(type)
  {
  
   case '+': System.out.println("The answers to "+num1+" + "num2" is "+(num1+num2)+"");
	break;
	case '-': System.out.println("The answers to "+num1+" - "num2" is "+(num1-num2)+"");
	break;
	case 'x': System.out.println("The answers to "+num1+" x "num2" is "+(num1*num2)+"");
	break;
	case '/': System.out.println("The answers to "+num1+" / "num2" is "+(num1/num2)+"");
	break;
	
 }
	
  
  }
}
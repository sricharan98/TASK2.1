/**
*THIS PROGRAM DEFINES THE CALCULATION OF ADDITION,MULTIPLICATION,DIVISION OF NUMBERS
*@author:NANNURI SRI CHARAN REDDY
*@version:1.0
*/
public class calculate
{	
	//Calculate the Addition of numbers
	public int addition(int number1,int number2)
	{
		return number1+number2;
	}
	//Calculate the Multiplication of numbers
	public int multiplication(int number1,int number2)
	{
		return number1*number2;	
	}
	//Calculate the Division of numbers
	public double division(int number1,int number2)
	{
		if(number2!=0 )
		return number1/number2;
		else
		{
			//IF DIVISOR IS ZERO
			try
			{
				throw new ArithmeticException();
			}
			catch(ArithmeticException e) 
			{
			}
			return 0.0;
		}	
	}
}


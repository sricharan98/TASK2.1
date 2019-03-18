import static org.junit.Assert.*;

import org.junit.Test;

public class calculateTestMultiply {

	@Test
	public void multiplicationTest() 
	{
		calculate cal=new calculate();
		int result=cal.multiplication(10,30);
		assertEquals(300,result);
	}

}

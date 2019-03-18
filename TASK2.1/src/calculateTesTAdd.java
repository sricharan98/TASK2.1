import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Nannuri.SriCharanReddy
 *
 */
public class calculateTesTAdd {

	@Test
	public void additionTest() 
	{
		calculate cal=new calculate();
		int result=cal.addition(10,30);
		assertEquals(40,result);
	}

}

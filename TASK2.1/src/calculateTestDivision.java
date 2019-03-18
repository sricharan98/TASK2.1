import static org.junit.Assert.*;

import org.junit.Test;

public class calculateTestDivision {

	@Test
	public void divisionTest() {
		calculate cal=new calculate();
		double result=cal.division(30,10);
		assertEquals(3,result,0.1);
	}

}

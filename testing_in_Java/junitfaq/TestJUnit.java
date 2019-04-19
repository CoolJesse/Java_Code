
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit{
	
	@Test
	public void testSetup(){
		String str= "I'm done with Junit setup";
		assertEquals("I'm done with Junit setup",str);
	}
}
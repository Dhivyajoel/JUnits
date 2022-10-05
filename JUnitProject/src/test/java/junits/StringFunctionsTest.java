package junits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringFunctionsTest {
	
	@Test
	public void Test1() {
		
		assertTrue(StringFunctions.isPalindrom("RADAR"));
	}
	
	@Test
	public void Test2() {
		
		assertFalse(StringFunctions.isPalindrom("PRIYA"));
	}

}


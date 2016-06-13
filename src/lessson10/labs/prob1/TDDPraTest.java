package lessson10.labs.prob1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TDDPraTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		List<String> words = Arrays.asList("sanje","bhusal");
		List<String> changedWords = Arrays.asList("sanjE","bhusaL");
		TDDPractice tp1 = new TDDPractice();
		assertEquals(changedWords, tp1.changeLastCharToUpper(words));
	}

}

package lessson10.labs.prob1;

import java.util.List;
import java.util.stream.Collectors;

public class TDDPractice {

	List<String> changeLastCharToUpper(List<String> words) {	
		//words.stream().map(s -> changeToUpper(s)).forEach(System.out::println);
		
		List<String> changedoutput = words.stream().map(s -> changeToUpper(s)).collect(Collectors.toList());
		return changedoutput;
	}

	public static String changeToUpper(String s) {
		return s.substring(0, s.length() - 1) + s.substring(s.length() - 1).toUpperCase();
	}

}

package lessson10.labs.prob1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TDDPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	List<String> changeLastCharToUpper(List<String> words)
	{
	List<String> changedoutput = words.stream().map(s -> s.substring(0, s.length()-2)+s.substring(s.length()-1).toUpperCase()).collect(Collectors.toList());
	return changedoutput;
	}

}

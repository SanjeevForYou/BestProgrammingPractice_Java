package lesson10.labs.prob5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FixThis {
	//This method creates a compiler error -- try to fix it
	List<String> processList(List<String> list) throws InputTooLongException {
		
			List<String>  result = new ArrayList<>();
			result = list.stream()
					   .map(x -> {
						   try {
							   return this.doNothingIfShort(x);
						} catch (InputTooLongException e) {
							// TODO: handle exception
							return e.getMessage();
						}}) // This will fail to compile 
			           .collect(Collectors.toList());	
	return result;
	}
	
	 
	 String doNothingIfShort(String input) throws InputTooLongException {
		 try {
			 if (input.length() > 3) throw new InputTooLongException();
		} catch (InputTooLongException e) {
			// TODO: handle exception
			throw e;
		}
	   return input;
	}
	
	public static void main(String[] args) {
		FixThis ft = new FixThis();
		List<String> words1 = Arrays.asList("not", "too", "big", "yet");
		
		System.out.println("What happern");
		try {
			System.out.println(ft.processList(words1));
			
			System.out.println("What happern");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error :" + e.getMessage());
		}
	
	}
	
	class InputTooLongException extends Exception {
		private static final long serialVersionUID = 1L;
		public InputTooLongException() {
			super("Must be length 3 or less");
		}
		public InputTooLongException(String s) {
			super(s);
		}
		public InputTooLongException(Throwable t) {
			super(t);
		}
	}
}

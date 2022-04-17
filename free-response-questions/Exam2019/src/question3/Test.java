package question3;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		String openDel = "(";
		String closeDel = ")";
		String[] tokens = { "(", "x + y", ")", " * 5" };
		Delimiters delimiter = new Delimiters(openDel, closeDel);
		ArrayList<String> delims=delimiter.getDelimitersList(tokens);
		for (String del : delims) {
			System.out.println(del);
		}
		System.out.println(delimiter.isBalanced(delims));

	}

}

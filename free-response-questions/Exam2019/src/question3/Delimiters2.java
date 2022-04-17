package question3;

import java.util.ArrayList;

public class Delimiters2 {
	/** The open and close delimiters. */
	private String openDel;
	private String closeDel;

	/**
	 * Constructs a Delimiters object where open is the open delimiter and close is
	 * the close delimiter. Precondition: open and close are non-empty strings.
	 */
	public Delimiters2(String open, String close) {
		openDel = open;
		closeDel = close;
	}

	/**
	 * Returns an ArrayList of delimiters from the array tokens, as described in
	 * part (a).
	 */
	public ArrayList<String> getDelimitersList(String[] tokens) { 
		/* to be implemented in part (a) */
		ArrayList<String> delimiters=new ArrayList<String>();
		for (int i = 0; i < tokens.length; i++) {
			if(tokens[i].equals(openDel)||tokens[i].equals(closeDel))
				delimiters.add(tokens[i]);
		}
		return delimiters;
	}

	/**
	 * Returns true if the delimiters are balanced and false otherwise, as described
	 * in part (b). Precondition: delimiters contains only valid open and close
	 * delimiters.
	 */
	public boolean isBalanced(ArrayList<String> delimiters) { 
		/* to be implemented in part (b) */
		int openDelCount=0;
		int closeDelCount=0;
		for (String del : delimiters) {
			if(del.equals(openDel)) {
				openDelCount++;
			}else {
				closeDelCount++;
			}
			if(closeDelCount>openDelCount) {
				return false;
			}
			
		}
		if(openDelCount!=closeDelCount) {
			return false;
		}
		return true;
	}
	// There may be instance variables, constructors, and methods that are not
	// shown.
}

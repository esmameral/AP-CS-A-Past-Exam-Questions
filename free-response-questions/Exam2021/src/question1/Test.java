package question1;

public class Test {

	public static void main(String[] args) {
		WordMatch wm=new WordMatch("concatenation");
		
		System.out.println(wm.scoreGuess("nation"));
		System.out.println(wm.scoreGuess("ten"));
		System.out.println(wm.findBetterGuess("ten","nation"));

		System.out.println(wm.scoreGuess("con"));
		System.out.println(wm.scoreGuess("cat"));
		System.out.println(wm.findBetterGuess("con","cat"));
		
	

	}

}

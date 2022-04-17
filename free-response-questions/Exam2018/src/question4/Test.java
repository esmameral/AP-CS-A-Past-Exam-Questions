package question4;

public class Test {

	public static void main(String[] args) {
		int[][] arr2D = { { 0, 1, 2 }, 
				{ 3, 4, 5 }, 
				{ 6, 7, 8 }, 
				{ 9, 5, 3 } };
		
		int[][] a1 = { { 10,30,20,0}, 
				{ 0,20,30,10 }, 
				{ 30,0,10,20 }, 
				{ 20,10,0,30 } };
		System.out.println(ArrayTester.isLatin(a1));
		System.out.println(ArrayTester.isLatin(arr2D));
		

	}

}

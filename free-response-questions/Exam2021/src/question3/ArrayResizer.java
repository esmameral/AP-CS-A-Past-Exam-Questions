package question3;

public class ArrayResizer {

	public static boolean isNonZeroRow(int[][] array2D, int r) {
		
		for (int data : array2D[r]) {
			if(data==0)
				return false;
		}
		return true;
	}
	
	public static int numNonZeroRows(int[][] array2D) {
		int count=0;
		for (int i = 0; i < array2D.length; i++) {
			if(isNonZeroRow(array2D, i))
				count++;
		}
		return count;
		
	}
	
	public static int[][] resize(int[][] array2D){
		int rowCount=numNonZeroRows(array2D);
		int[][] smaller=new int[rowCount][array2D[0].length];
		int i=0;
		for (int j = 0; j < array2D.length; j++) {
			if(isNonZeroRow(array2D, j)) {
				smaller[i]=array2D[j];
				i++;
			}
			
		}
			
		return smaller;
		}
		
	
}

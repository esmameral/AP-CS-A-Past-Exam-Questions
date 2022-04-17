package question4;

import java.util.Iterator;

public class ArrayTester {
	/**
	 * Returns an array containing the elements of column c of arr2D in the same
	 * order as they appear in arr2D. Precondition: c is a valid column index in
	 * arr2D. Postcondition: arr2D is unchanged.
	 */
	public static int[] getColumn(int[][] arr2D, int c) {
		/* to be implemented in part (a) */ 
		int[] a=new int[arr2D.length];
		
		for (int i = 0; i < arr2D.length; i++) {
			a[i]=arr2D[i][c];
			
		}
		return a;}

	/**
	 * Returns true if and only if every value in arr1 appears in arr2.
	 * Precondition: arr1 and arr2 have the same length. Postcondition: arr1 and
	 * arr2 are unchanged.
	 */
	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		/* implementation not shown */ 
		for (int a : arr1) {
			boolean isExists=false;
			for (int b : arr2) {
				if(a==b) {
					isExists=true;
					break;
				}
			}
			if (!isExists)
				return false;
			
		}
		return true;
	
	}

	/**
	 * Returns true if arr contains any duplicate values; false otherwise.
	 */
	public static boolean containsDuplicates(int[] arr) {
		/* implementation not shown */ 
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					return true;
				}
					
			}
		}
		return false;
	}

	/**
	 * Returns true if square is a Latin square as described in part (b); false
	 * otherwise. Precondition: square has an equal number of rows and columns.
	 * square has at least one row.
	 */
	public static boolean isLatin(int[][] square) {
		/* to be implemented in part (b) */ 

		int[] firstRow=square[0];
		if(containsDuplicates(firstRow))
			return false;
		
		for (int i = 1; i < square.length; i++) {
			if(!hasAllValues(firstRow, square[i]))
				return false;
		}
		for (int i = 0; i < square.length; i++) {
			int[] column=getColumn(square, i);
			if(!hasAllValues(firstRow, column))
				return false;
		}
		
		return true;
		}
}

package question3;

public class ArrayResizerTest {

	public static void main(String[] args) {
		int[][] arr= {{2,1,0},{1,3,2},{0,0,0},{4,5,6}};
		for (int[] row : arr) {
			for (int i = 0; i < row.length; i++) {
				System.out.print(row[i]+" ");
			}
			System.out.println();
		}
		System.out.println(ArrayResizer.isNonZeroRow(arr, 0));
		System.out.println(ArrayResizer.isNonZeroRow(arr, 1));
		System.out.println(ArrayResizer.isNonZeroRow(arr, 2));
		System.out.println(ArrayResizer.isNonZeroRow(arr, 3));
		System.out.println(ArrayResizer.numNonZeroRows(arr));
		
		
		
		int[][] smaller=ArrayResizer.resize(arr);
		for (int[] row : smaller) {
			for (int i = 0; i < row.length; i++) {
				System.out.print(row[i]+" ");
			}
			System.out.println();
		}
	}
}

package com.db.codecontest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}



package com.learn.mongodb;

public class MergeSort {

	static int arry[] = new int[] { 3, 1, 5, 2, 6, 8 };

	public static void main(String a[]) {

		mergeSort(0, arry.length - 1, arry);
	}

	public static void mergeSort(int left, int right, int ary[]) {

		System.out.println("Entering into Merge sort with Left:" + left
				+ "Right:" + right);

		int mid = 0;

		if (right > left) {

			System.out
					.println("Entering into Merge sort with if condition success");

			mid = (right + left) / 2;

			mergeSort(left, mid, ary);

			mergeSort(mid + 1, right, ary);

			merge_copy(ary, left, mid, right);

		}

		System.out.println("Exit into Merge sort");
	}

	private static void merge_copy(int[] ary, int left, int mid, int right) {
		// TODO Auto-generated method stub

		System.out.println("Entering into Merge copy sort with Left:" + left
				+ "Right:" + right + "Mid:" + mid);

		int leftPos = left;

		int midPos = mid;

		int rightPos = right;

		int[] leftArray = new int[6];

		int[] rightArray = new int[6];

		int k = 0;

		for (int i = leftPos; i <= mid; i++, k++) {

			leftArray[k] = ary[i];
		}

		int k1 = 0;
		for (int j = midPos + 1; j <= rightPos; j++, k1++) {

			rightArray[k1] = ary[j];
		}

		for (int t = 0; t < k; t++) {
			System.out.println("Left arry ele:" + leftArray[t]);
		}

		for (int t1 = 0; t1 < k1; t1++) {
			System.out.println("Right arry ele:" + rightArray[t1]);
		}

		int iterationI = 0;

		int iterationJ = 0;

		int iterationK = 0;

		while (iterationI < k && iterationJ < k1) {

			if (leftArray[iterationI] <= rightArray[iterationJ]) {

				ary[iterationK] = leftArray[iterationI];

				iterationK++;

				iterationI++;
			}

			else {
				ary[iterationK] = rightArray[iterationJ];

				iterationK++;

				iterationJ++;
			}

		}

		if (iterationI <= k) {
			for (int t = iterationJ - 1; t < k; t++) {

				ary[t] = leftArray[t];
			}
		}
		if (iterationJ < k1) {

			for (int t1 = iterationI; t1 < k1; t1++) {

				ary[t1] = rightArray[t1];
			}
		}
		for (int s = 0; s <= ary.length - 1; s++) {
			System.out.println("Original arry after Sorting :" + ary[s]);
		}

	}
}

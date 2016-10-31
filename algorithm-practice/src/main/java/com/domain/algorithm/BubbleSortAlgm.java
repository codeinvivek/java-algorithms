package com.domain.algorithm;

/**
 * 
 * @author Vivek
 *
 */
public class BubbleSortAlgm {

	/**
	 * sorts the list-to-be-sorted with bubble-sort algm
	 * 
	 * @param listToSort
	 * @return
	 */
	protected int[] getBubbleSortedList(int listToSort[]) {

		int arrLen = listToSort.length;
		int k;
		int resultArr[] = null;
		for (int m = arrLen; m >= 0; m--) {
			for (int i = 0; i < arrLen - 1; i++) {
				k = i + 1;
				if ((Integer) listToSort[i] > (Integer) listToSort[k]) {
					// ..performs ascending sort
					resultArr = swapListAscending(i, k, listToSort);
				} else {
					// ..call of swap in else, will sort descending
				}
			}
		}
		return resultArr;
	}// ..end of the method

	/**
	 * 
	 * @param a
	 * @param b
	 * @param list
	 * @return
	 */
	private int[] swapListAscending(int a, int b, int[] list) {
		int temp;
		temp = (Integer) list[a];
		list[a] = (Integer) list[b];
		list[b] = temp;
		return list;
	}// ..end of the method

	/**
	 * Executor main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int[] listToSort = { 1, 2, 4, 6, 3, 2, 8, 4 };
		BubbleSortAlgm sortAlgm = new BubbleSortAlgm();
		int[] retultSet = sortAlgm.getBubbleSortedList(listToSort);

		for (int i : retultSet) {
			System.out.println(i);
		}

	}// ..end of the method

}

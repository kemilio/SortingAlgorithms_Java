package main;

import sortingMethods.BubbleSort;
import sortingMethods.MergeSort;
import sortingMethods.QuickSort;
import sortingMethods.InsertionSort;
import sortingMethods.SortArray;
public class Main {

	public static void main(String[] args) {
		int[] arraya = new int[4];
		int num = 5227;
		arraya[0] = num/1000;
		arraya[1] = (num-arraya[0]*1000)/100;
		arraya[2] = (num-arraya[0]*1000-arraya[1]*100)/10;
		arraya[3] = (num-arraya[0]*1000-arraya[1]*100-arraya[2]*10)/1;
		
		SortArray array = new SortArray(100000, false);
		SortArray array2 = new SortArray(100000, false);
		SortArray array3 = new SortArray(100000, false);
		SortArray array4 = new SortArray(100000, false);
		QuickSort quickSorter = new QuickSort();
		MergeSort mergeSorter = new MergeSort();
		InsertionSort insSorter = new InsertionSort();
		BubbleSort bubSorter = new BubbleSort();
		
		System.out.println("Unsorted array: \n" + array.print());
		System.out.println("Sorting...");
		long clock = System.currentTimeMillis();
		array = quickSorter.sort(array, array.getLength());
		long runningTime = System.currentTimeMillis();
		long totalTime = runningTime - clock;
		System.out.println("Sorted array (quick sort): \n" + array.print());
		System.out.println("Total time taken (quick sort): " + totalTime/1000.0 + " seconds\n");
		
		System.out.println("Unsorted array: \n" + array2.print());
		System.out.println("Sorting...");
		clock = System.currentTimeMillis();
		array2 = mergeSorter.sort(array2, array2.getLength());
		runningTime = System.currentTimeMillis();
		totalTime = runningTime - clock;
		System.out.println("Sorted array (merge sort): \n" + array2.print());
		System.out.println("Total time taken (merge sort): " + totalTime/1000.0 + " seconds\n");
		
		System.out.println("Unsorted array: \n" + array3.print());
		System.out.println("Sorting...");
		clock = System.currentTimeMillis();
		array3 = insSorter.sort(array3, array3.getLength());
		runningTime = System.currentTimeMillis();
		totalTime = runningTime - clock;
		System.out.println("Sorted array (insertion): \n"+ array3.print());
		System.out.println("Total time taken (insertion): " + totalTime/1000.0 + " seconds\n");
		
		System.out.println("Unsorted array: \n" + array4.print());
		System.out.println("Sorting...");
		clock = System.currentTimeMillis();
		array4 = bubSorter.sort(array4,  array4.getLength());
		runningTime = System.currentTimeMillis();
		totalTime = runningTime - clock;
		System.out.println("Sorted array (bubble): \n"+ array4.print());
		System.out.println("Total time taken (bubble): " + totalTime/1000.0 + " seconds");
	}
}
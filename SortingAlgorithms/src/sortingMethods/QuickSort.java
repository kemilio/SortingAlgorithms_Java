package sortingMethods;

import sortingInterface.Sortable;
import sortingMethods.SortArray;

public class QuickSort extends Sortable {
	private int pivot;
	private int leftIndex;
	private int rightIndex;
	private int placeHolder;
	private int pivotIndex;
	
	public SortArray sort(SortArray array, int length) {
		
		quickSort(array, 0, length);
		return array;
	}
	
	private void quickSort(SortArray array, int low, int high) {
		if (low < high - 1) {
			pivot = array.getIndex(low);
			leftIndex = low + 1;
			rightIndex = high - 1;
			while (leftIndex < rightIndex) {
				if (array.getIndex(leftIndex) > pivot && array.getIndex(rightIndex) < pivot) {
					placeHolder = array.getIndex(leftIndex);
					array.setIndex(leftIndex, array.getIndex(rightIndex));
					array.setIndex(rightIndex, placeHolder);
				}
				if (array.getIndex(leftIndex) <= pivot) leftIndex++;
				if (array.getIndex(rightIndex) >= pivot) rightIndex --;
			}
			pivotIndex = low;
			if (pivot > array.getIndex(rightIndex)) {
				placeHolder = array.getIndex(rightIndex);
				array.setIndex(rightIndex, pivot);
				array.setIndex(pivotIndex, placeHolder);
			}
			while (pivotIndex > rightIndex - 1) {
				placeHolder = array.getIndex(pivotIndex + 1);
				array.setIndex(pivotIndex + 1, pivot);
				array.setIndex(pivotIndex, placeHolder);
				pivotIndex++;
			}
			quickSort(array, low, leftIndex);
			quickSort(array, rightIndex, high);
		}
	}
}
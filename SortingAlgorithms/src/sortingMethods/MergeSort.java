package sortingMethods;

import sortingInterface.Sortable;
import sortingMethods.SortArray;

public class MergeSort extends Sortable {
	private int leftIndex;
	private int rightIndex;
	private int leftLength;
	private int rightLength;
	
	public SortArray sort(SortArray array, int length) {
		return splitMerge(array, length/2);
	}
	private SortArray splitMerge(SortArray array, int length) {
		if (length > 0) {
			SortArray left = new SortArray(length, true);
			SortArray right = new SortArray(length, true);
			for (int i = 0; i < length; ++i) {
				left.setIndex(i, array.getIndex(i));
				right.setIndex(i, array.getIndex(i + length));
			}
			SortArray newleft = splitMerge(left, left.getLength()/2);
			SortArray newright = splitMerge(right, right.getLength()/2);
			SortArray merge = doMerge(newleft, newright);
			array = merge;
			}
		return array;
	}
	
	private SortArray doMerge(SortArray left, SortArray right) {
		leftLength = left.getLength();
		rightLength = right.getLength();
		leftIndex = 0;
		rightIndex = 0;
		int mergedLength = leftLength + rightLength;
		SortArray merged = new SortArray(mergedLength, true);
		while (leftIndex < leftLength && rightIndex < rightLength) {
			if (left.getIndex(leftIndex) < right.getIndex(rightIndex)) {
				merged.setIndex(leftIndex + rightIndex, left.getIndex(leftIndex));
				leftIndex++;
			}
			else {
				merged.setIndex(leftIndex + rightIndex, right.getIndex(rightIndex));
				rightIndex++;
			}
		}
		while (leftIndex < leftLength) {
			merged.setIndex(leftIndex + rightIndex, left.getIndex(leftIndex));
			leftIndex++;
		}
		while (rightIndex < rightLength) {
			merged.setIndex(leftIndex + rightIndex, right.getIndex(rightIndex));
			rightIndex++;
		}
		return merged;
	}
}
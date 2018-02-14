package sortingMethods;

import sortingInterface.Sortable;
import sortingMethods.SortArray;

public class InsertionSort extends Sortable {
	private int index;
	private int placeHolder;
	
	public SortArray sort(SortArray array, int n) {
		for (int i = 1; i < n; ++i) {
			index = i;
			while (index > 0 && array.getIndex(index - 1) > array.getIndex(index)) {
				placeHolder = array.getIndex(index - 1);
				array.setIndex((index - 1), array.getIndex(index));
				array.setIndex(index, placeHolder);
				index--;
			}
		}
		return array;
	}
}
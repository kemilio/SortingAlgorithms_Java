package sortingMethods;

import sortingInterface.Sortable;
import sortingMethods.SortArray;

public class BubbleSort extends Sortable {
	private int placeHolder;
	public SortArray sort(SortArray array, int length) {
		for (int i = 0; i < length; ++i) {
			for (int j = 0; j < length - 1; ++j) {
				if (array.getIndex(j) > array.getIndex(j + 1)) {
					placeHolder = array.getIndex(j);
					array.setIndex(j, array.getIndex(j + 1));
					array.setIndex(j + 1, placeHolder);
				}
			}
		}
		return array;
	}
}
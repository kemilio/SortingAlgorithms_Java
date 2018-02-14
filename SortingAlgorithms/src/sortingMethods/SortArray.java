package sortingMethods;
import java.util.Random;

public class SortArray {
	private int[] array;
	private int length;
	
	public SortArray(int n, boolean empty) {
		this.array = new int[n];
		this.length = n;
		if (!empty) {
		Random rand = new Random(randomize());
		for (int i = 0; i < n; ++i) {
			array[i] = Math.abs(rand.nextInt() % 523);
		}
		}
	}
	
	public SortArray(int n, int[] arrayIn) {
		this.array = new int[n];
		this.length = n;
		for (int i = 0; i < n; ++i) {
			array[i] = arrayIn[i];
		}
	}
	
	public int getLength() {
		return this.length;
	}
	
	public int getIndex(int i) {
		if (this.length < i) return -1; 
		return this.array[i];
	}
	
	public void setIndex(int i, int value) {
		if (this.length > i) this.array[i] = value;
	}
	
	public String print() {
		String ret = "";
		int total = this.length;
		if (total > 200) {
			ret = "Heres the first 200 elements\n";
			total = 200;
		}
		for (int i = 0; i < total; ++i) ret += this.array[i] + " ";
		return ret;
	}
	
	private int randomize() {
		return (int) (System.currentTimeMillis() % 100);
	}
}
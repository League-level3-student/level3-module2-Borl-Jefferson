package _01_Sorting_Algorithms;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ThanosSorter extends Sorter {
	public ThanosSorter() {
		type = "Thanos";
	}

	/*
	 * Thanos Sort is the sorting algorithm used by mighty titan Thanos. When Thanos
	 * observes that the array is unsorted, he simply snaps his fingers and removes
	 * half of the array items to bring balance to the array. Thanos will keep
	 * snapping his fingers until the remaining elements are completely sorted. For
	 * example: int[] arr = {12, 100, 200, 201, 97, 33, 100, 687};
	 * 
	 * Thanos looks at this array from left to right and sees the the first element
	 * that isn't greater than the previous one is 97 (12, 100, 200, 201 are all in
	 * order). In quiet rage, Thanos randomly picks half of the elements in the
	 * array and removes them. In this case he removes the second half, so the array
	 * now looks like: {12, 100, 200, 201, 0, 0, 0, 0} // second half removed
	 * 
	 * The remaining non-0 values are now in order and balance is restored to the
	 * array. If Thanos removed the first half, the array would be: {0, 0, 0, 0, 97,
	 * 33, 100, 687}
	 * 
	 * The first unordered number is 33, so Thanos snaps his fingers and removes
	 * half again: {0, 0, 0, 0, 0, 0, 100, 687} // first half or {0, 0, 0, 0, 97,
	 * 33, 0, 0} // second half
	 * 
	 * If the first half is removed the result is sorted. If the second half is
	 * removed 33 isn't sorted so Thanos snaps his fingers again! The result is
	 * either: {0, 0, 0, 0, 0, 33, 0, 0} // first half or {0, 0, 0, 0, 97, 0, 0, 0}
	 * // second half
	 * 
	 * NOTE: The algorithm doesn't necessarily have to take away half from the front
	 * or back of the array. You can implement an algorithm that takes elements away
	 * randomly until half (in this case (n-1)/2) remain. The algorithm is up to
	 * you!
	 */
	@Override
	void sort(int[] array, SortingVisualizer display) {
	for (int m = 0; m < m+1; m++) {
		
	
		boolean sorted = false;
		
		boolean front;
		Random r = new Random();
	
		while (sorted==false) {
			
			int sr = 0;
		int sl = 0;
			try {
				TimeUnit.MILLISECONDS.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			display.updateDisplay();
			sorted=false;
			
			sl = 999799;
			front = r.nextBoolean();

			// getting sr/l

			for (int j = 0; j < array.length; j++) {
				if (array[j] != 0) {
					sr = j;
					if (sl == 999799) {
						sl = j;
					}
				}
			}

			// removing half
if(isitsorted(array)) {
				sorted=true;
		System.out.println(sorted);
}
			if(front & sorted==false) {
				for (int i = sl; i < sl+sr/2-sl/2+1; i++) {
					array[i]=0;
					
					
				}
			}
			if(!front & sorted==false) {
				
				for (int i =sr; i > sl+sr/2-sl/2; i--) {
			
						array[i]=0;
				
				}
				
			}
			
			}
			if(sorted) {
				break;
			}
			display.updateDisplay();
		}
		/*try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0; i < array.length; i++) {
	            array[i] = r.nextInt(500);
	        }*/
		}
	

	
	
	
	public boolean isitsorted(int[] array) {
		boolean sorted = true;
		for (int i = 1; i <= array.length - 1; i ++) {
			
			if (array[i-1] > array[i] & array[i]!=0) {
			sorted =false;
				
			}
		}
		
	//	System.out.println(sorted);
		return sorted;
	}
}
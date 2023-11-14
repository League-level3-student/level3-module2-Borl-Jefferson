package _01_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
    public BubbleSorter() {
        type = "Bubble";
    }

    /* 
     * Use the bubble sorting algorithm to sort the array.
     * You can use display.updateDisplay() to show the current
     * progress on the graph.
     */
    
    //if 2 numbers aren't in order, it swaps them
    //use while loop
    @Override
    void sort(int[] array, SortingVisualizer display) {
        boolean still = true;
        int place=0;
        while(still) {
        	//still=false;
for (int i = 0; i <= array.length-3; i+=2) {
	System.out.println(i);
	if(array[i]>array[i+2]) {
		place=array[i];
		array[i]=array[i+2];
		array[i+2]=place;
		still=true;
		 
	}
	display.updateDisplay();
	
}
for (int i = 1; i <= array.length-2; i+=2) {
	System.out.println(i);
	if(array[i]<array[i+2]) {
		place=array[i];
		array[i]=array[i+2];
		array[i+2]=place;
		still=true;
		 
	}
	display.updateDisplay();
	
}
        	
        }
        
       
    }
}

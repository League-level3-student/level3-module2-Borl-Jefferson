package _01_Sorting_Algorithms;

import java.util.Random;

import javax.swing.JOptionPane;

public class BogoSorter extends Sorter {
    public BogoSorter() {
        type = "Bogo";
    }

    /*
     * Bogo sort is a joke sorting algorithm. It is considered the most
     * inefficient sorting algorithm while still maintaining the possibility
     * of eventually sorting data.
     * 
     * It works by following these steps:
     * STEP 1. Is the array in order?
     * if yes, finished; if no, go to step 2.
     * STEP 2. Take two random elements in the array and swap them.
     * STEP 3. Go back to step 1.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
    	
        boolean still = true;
        Random r = new Random();
        int place = 0;
        int r1 = 0;
        int r2 =0;
        while(still) {
        	still=false;
        	for (int i = 0; i < array.length-1; i++) {
			if(array[i]>array[i+1]) {
         r1 = r.nextInt(array.length);
         r2 = r.nextInt(array.length);
        place=array[r2];
        array[r1]=array[r2];
        array[r2]=place;
        display.updateDisplay();
        still=true;
        	}	
			}
        	
        	
        }
        JOptionPane.showMessageDialog(null, "done");
    }
}

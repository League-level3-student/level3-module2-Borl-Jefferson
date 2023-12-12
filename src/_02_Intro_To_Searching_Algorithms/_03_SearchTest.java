package _02_Intro_To_Searching_Algorithms;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;


class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
    	String[] words = {"pear", "apple", "orange", "plum", "watermelon"};
    	String value = "plum";
        // 1. Use the assertEquals() method to test your linear search method
    	assertEquals(3, _01_LinearSearch.linearSearch(words, value));
        //assertEquals(false, true);
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int[]  nums = {5, 6, 7, 28, 32, 54, 69};
    	int value = 32;
        assertEquals(4, _02_BinarySearch.binarySearch(nums, 0, 6, value));
    }
}

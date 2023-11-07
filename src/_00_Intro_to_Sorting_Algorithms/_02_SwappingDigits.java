package _00_Intro_to_Sorting_Algorithms;

class _02_SwappingDigits {

    // 1. Complete the method so that the first two elements of the array are
    //    swapped.
    public static void swapArrayOfTwo(int[] arr) {
int one=arr[0];
int two=arr[1];
arr[0]=two;
arr[1]=one;
    }

    // 2. Complete the method so that it sorts the array using a bubble sort.
    //    Iterate through the array and when you find two elements that are out
    //    of order, swap them. Repeat this until the array is in order.
    public static void sortIntArray(int[] arr) {

   
			boolean still = true;
		while(still==true) {
			 still=false;
        for (int i = 0; i < arr.length-1; i++) {
       
        	if(arr[i]>arr[i+1]) {
        		still=true;
        		int one=arr[i];
        		int two=arr[i+1];
        		arr[i]=two;
        		arr[i+1]=one;	
        	}
        	
        	
        }
        
		}
}
    // 3. Complete the method so that it finds the middle number in the array.
    //    *Hint* it helps to sort it first.
    //    *Double Hint* Use the method you already wrote in step 2 to sort it
    public static int findMiddle(int[] arr) {

    	int counter=0;
    	int first=0;
    	int second=0;
    	int one=0;
    	int two=0;
    	boolean ran=false;
    	boolean still = true;
  
        for (int i = 1; i < arr.length-1; i++) {
       
        	
        	
        	if(arr[i]>arr[i+1]) {
        		still=true;
        			if(counter>0) {
        			counter=0;
        			second=i;
        			ran=true;
        			one=arr[first];
        			two=arr[second];
        			arr[first]=two;
        			arr[second]=one;
        			
        		}
        		if(counter==0 && ran==false) {
        			first=i;
        		counter++;
        		}
        		ran=false;
        	}
        	
        
		}
  
    int mid=(arr.length/2);
    
   
    	return arr[mid];
    }
}

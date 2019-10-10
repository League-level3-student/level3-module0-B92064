package _01_Simple_Array_Algorithms;

public class _00_1D_Array_Methods {
	// 1. Complete the method so that it returns the sum of all
	// of the integers in the array being passed in
	public static int sumIntArray(int[] values) {
		int total = 0;
		for (int i = 0; i < values.length; i++) {
		total =	total + values[i];
		}
		return total;
	}

	// 2. Complete the method so that it returns the average of all
	// of the integers in the array being passed in
	public static double averageIntArray(int[] values) {
		double total = 0;
		double average;
		for (int i = 0; i < values.length; i++) {
			total += values[i];
			//System.out.println(values[i]);
			
		}
	//	System.out.println(total);
		average = total / values.length;
	//	System.out.println(average);
		return average;
	}
	//made total and average doubles because I forgot to 

	// 3. Complete the method so that it returns true if the integer
	// array contains the value specified by the second parameter.
	// It should otherwise return false.
	public static boolean containsIntValue(int[] array, int value) {
		boolean contains = false;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == value) {
				contains = true;
			}
		}
if(contains == true) {
	return true;
}else {
		return false;
}
	}

	// 4. Complete the method so that it returns the index of the first instance that the specified value occurs in the array.
	// If the array does not contain the specified value, it should return -1.
	public static int getIndex(int[] arr, int value) {
		boolean contains = false;
		int svalue =0;
		
		for (int i = 0; i < arr.length; i++) {
			if(contains == false) {
			if(arr[i] == value) {
				svalue = i;
				contains = true;
				
			}
			} // was returning too many answers because no stop function was added, so would run forever. if(contains==false ) stopped it.
		}
if(contains == true) {
	return svalue;
}else {
		return -1;
}
	}
}

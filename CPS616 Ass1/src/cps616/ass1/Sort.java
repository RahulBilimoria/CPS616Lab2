/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cps616.ass1;

/**
 *
 * @author minim_000
 */
public class Sort {

    public static void slowsort(int arr[]) { //bubble sort
        int n = arr.length;
        for (int x = 0; x < n-1; x++) {
            for (int y = 0; y < n - x - 1; y++) {
                if (arr[y] > arr[y + 1]) /* For descending order use < */ {
                    int swap = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = swap;
                }
            }
        }
    }

    public static void fastsort(int arr[], int low, int high) { // quicksort
        if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			fastsort(arr, low, j);
 
		if (high > i)
			fastsort(arr, i, high);
    }
    
    public static void fast(int low, int high){
        
    }

}

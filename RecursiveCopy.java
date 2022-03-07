package sysImplementation;

import java.util.ArrayList;

public class UtilitiesRec {
	
	
	public static void changeArrays(int[] array1, int[] array2){
		changeArrays(array1, array2, 0);
	}

	private static void changeArrays(int[] array1, int[] array2, int index) {
		if (array1.length == index || array2.length == index) {
			return;
		}
		if (array1[index] == array2[index]
				|| array1[index] < array2[index]) {
			changeArrays(array1, array2, index + 1);
		}
		if (array1[index] > array2[index]) {
			int store = array1[index];
			array1[index] = array2[index];
			array2[index] = store;
			changeArrays(array1, array2, index + 1);
		}
	}
	
	public static void changeList(ArrayList<Integer> myList){
		changeList(myList, 0, myList.size() - 1);
	}
	

	private static void changeList(ArrayList<Integer> myList, int start, int end){
		if (start == end || start > end) {
			return;
		}
		if (myList.get(start) == null || myList.get(end) == null) {
			changeList(myList, start + 1, end - 1);
		}
		else if (myList.get(start) == myList.get(end)) {
			myList.set(start, 131);
			myList.set(end, 131);
			changeList(myList, start + 1, end - 1);
		}
		else {
			myList.set(end, myList.get(start));
			changeList(myList, start + 1, end - 1);
		}
	}
}

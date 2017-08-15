package com.kodali.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortDesc {
	private int count;
	private int[] array;
	static Scanner s = new Scanner(System.in);

	public int[] getInteger() {
		System.out.println("Enter the number of elements that should be in an array: ");
		count = s.nextInt();
		array = new int[count];
		for (int i = 0; i < count; i++) {
			System.out.println("Enter " + i + " element: ");
			array[i] = s.nextInt();
		}
		return array;
	}

	public void printArray() {
		System.out.println("Elements entered in the array: " + Arrays.toString(array));
	}

	public void sortArray() {
		Arrays.sort(array);
		int[] desc = new int[count];
		for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
			desc[i] = array[j];
		}
		System.out.println("Elements sorted in descending order: " + Arrays.toString(desc));
	}

}

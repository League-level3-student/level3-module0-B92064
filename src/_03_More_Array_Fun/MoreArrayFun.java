package _03_More_Array_Fun;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import org.junit.jupiter.api.Test;

import _01_Simple_Array_Algorithms._00_1D_Array_Methods;

public class MoreArrayFun {
	
	static Random r = new Random();
	// 1. Create a main method to test the other methods you write.

	public static void main(String[] args) {
		String[] cows = {"cows", "chicken", "donkey","pig"};
		printArray(cows);
		System.out.println("");
		System.out.println("lmao");
		System.out.println("");
		printArrayBackwards(cows);
		System.out.println("");
		System.out.println("lmao");
		System.out.println("");
		printOdd(cows);
		System.out.println("");
		System.out.println("lmao");
		System.out.println("");
		printRandomOrder(cows);
	}
	
	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	private static void printArray(String[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	private static void printArrayBackwards(String[] s) {
		for (int i = s.length-1; i > -1; i--) {
			System.out.println(s[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	private static void printOdd(String[] s) {
		for (int i = 0; i < s.length; i++) {
			if (i % 2 == 0) {

			} else {
				System.out.println(s[i]);
			}
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	private static void printRandomOrder(String[] s) {
		for (int i = 0; i < s.length ; i++) {
			int rand = r.nextInt(s.length);
			System.out.println(s[rand]);
		}
	}
}

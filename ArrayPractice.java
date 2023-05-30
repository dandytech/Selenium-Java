package javaOOPBasic;

import org.testng.annotations.Test;

public class ArrayPractice {

	@Test
	public void oneDimension() {
		int a[] = new int[5];
		a[0] = 2;
		a[1] = 3;
		a[2] = 6;
		a[3] = 9;
		a[4] = 11;
		// to print all
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	// smart way to declare and assign to it
	@Test
	public void oneDimension2() {
		int b[] = { 2, 5, 6, 7, 23, 6 };
		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);

		}
	}

	// MultiDimensional Array
	// 4 5 7
	// 6 9 10
	@Test
	public void multiDimension() {
		int a[][] = new int[2][3];
		a[0][0] = 4;
		a[0][1] = 5;
		a[0][2] = 7;
		a[1][0] = 6;
		a[0][1] = 9;
		a[0][2] = 10;
		for (int i = 0; i < 2; i++) { // outer loop
			for (int j = 0; j < 3; j++) {
				System.out.println(a[i][j]);
			}
		}
	}

	// Smarter way to declare and assign to it
	@Test
	public void multiDimension2() {
		int b[][] = { { 4, 5, 7 }, { 6, 9, 10 } };

		for (int i = 0; i < 2; i++) { // outer loop
			for (int j = 0; j < 3; j++) {
				System.out.println(b[i][j]);
			}
		}
	}

}

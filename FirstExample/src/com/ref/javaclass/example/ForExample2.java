package com.ref.javaclass.example;

import java.io.InputStream;
import java.util.Scanner;

public class ForExample2 {

	public ForExample2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number to print?");
		int limit = scr.nextInt();
		/*
		 * 
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		for(int i = 1 ; i <= limit; i++) {
			for(int j = 1; j <= i ; j++) {
				System.out.print( i + ":" + j);
				System.out.print("* ");				
			}
			System.out.println();
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		int[] array1 = {1,2,3,4,5,6,7,8,9,10};
		for(int element: array1) {
			System.out.println(element);
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		for(int element: array1) {
			if(element %2 == 0) {
				continue;
			}
			System.out.println(element);
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		for(int element: array1) {
			if(element == 5) {
				break;
			}
			System.out.println(element);
		}
	}

}

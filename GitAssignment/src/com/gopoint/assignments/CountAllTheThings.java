package com.gopoint.assignments;

import java.io.FileInputStream;
import java.util.Scanner;

public class CountAllTheThings {
	public static void main(String[] args) {
		int digitCount = 0;
		int vowelCount = 0;
		int constantCount = 0;
		int num = 0;
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\Aakashghutke2606\\Desktop\\file\\Abc.txt");
			Scanner scan = new Scanner(file);
			while (scan.hasNext()) {
				String str = scan.nextLine();
				for (int i = 0; i < str.length(); i++) {
					char ch = str.charAt(i);
					if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'
							|| ch == 'I' || ch == 'O' || ch == 'U') {
						vowelCount++;
					} else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
						constantCount++;
					}

					if (ch >= '0' && ch <= '9') {
						digitCount++;
					}
				}
			}
			System.out.println("Count the total numbers of Vowels : " + vowelCount);
			System.out.println("Count the total numbers of Consonant : 	" + constantCount);
			System.out.println("Count the total number of Digit : " + digitCount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

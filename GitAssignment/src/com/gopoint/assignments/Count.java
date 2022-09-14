package com.gopoint.assignments;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Count {
	public static void main(String[] args) {
		int vowelCount =0;
		int numberCount =0;
		int num =0;
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\Aakashghutke2606\\Desktop\\file\\Abc.txt");
			Scanner scan = new Scanner(file);
			while(scan.hasNext()) {
				String str = scan.nextLine();
				for(int i =0; i<str.length();i++) {
					char ch = str.charAt(i);
					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
							ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'	) {
						vowelCount++;
					}
					if (ch>='0' && ch<='9') {
						numberCount++;
					}
				}
			}
			System.out.println("Total number of Vowels Count : "+vowelCount);
			System.out.println("Total number of numbers Count : "+numberCount);
			scan.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
	}
}

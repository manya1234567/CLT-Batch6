package day08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DevCode2 {

	static void logic() throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter number");
	try {
		int number = Integer.parseInt(br.readLine());
		System.out.println(number);
	}
	
	}
}

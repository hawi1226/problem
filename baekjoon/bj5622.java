package com.ssafy.algo;

import java.util.Scanner;

public class bj5622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		//A=65,
		int sum = 0;
		
		for(int i=0;i<str.length();i++) {
			int x = (int)str.charAt(i) - 65; 
			if((x/3) < 5) {
				sum += x/3;
			}
			else if(x < 19) sum += 5;
			else if(x < 22) sum += 6;
			else sum += 7;
			
			System.out.println(sum);
		}
		
		System.out.println(sum+(str.length()*3));
		
		sc.close();
	}

}

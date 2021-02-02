package com.ssafy.algo;

import java.util.Scanner;

public class bj10250 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();//È½¼ö
		
		for(int i=0;i<T;i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			
			int level = n % h;
			if(level == 0) level = h;
			
			
			//int result = n/h + (n%h)*100;
			int result = (level)*100 + (((n-1)/h)+1);
			
			System.out.println(result);
		}
		
		
		sc.close();
	}

}

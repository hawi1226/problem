package com.ssafy.algo.swea;

import java.util.Scanner;

public class c0201 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		String a = sc.nextLine();
		
		for(int i=0;i<T;i++) {
            
			String in = sc.nextLine();
			
			int j,result = 0;

			for(j=0;j<in.length();j++) {
				if(in.charAt(j) == '1') {
					result++;
					break;
				}
			}
			
			for(;j<in.length()-1;j++) {
				if(in.charAt(j) != in.charAt(j+1)) result++;
			}

			
			System.out.println(result);
		}
        sc.close();
	}
	
}

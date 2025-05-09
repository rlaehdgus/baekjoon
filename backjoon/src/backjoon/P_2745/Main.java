package backjoon.P_2745;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static String str = "0123456789ABCDEFGHIHKLNMOPQRSTUVWXYZ";

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		/*
		 * 문제: 
		 * B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
		 * 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
		 * A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
		 * 
		 * 입력: 
		 * 첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)
		 * B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같다.
		 * 
		 * 출력: 
		 * 첫째 줄에 B진법 수 N을 10진법으로 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		String N = sc.nextLine(); // 변환할 수
		Double B = sc.nextDouble(); // 진법
		
		
		// 한글자씩 잘라서 배열에 저장
		String[] NSplit = N.split("");
		String[] strSplit = str.split("");

		String[] sum = new String[NSplit.length];
		
		int result = 0; // 결과 값
		
		
		// 입력한 데이터를 변환 처리
		for(int i = 0; i < NSplit.length; i++) {
			
			for(int j = 0; j < strSplit.length; j++) {
				
				if(NSplit[i].equals(strSplit[j])) {
				
					// 계산하기 편하게 뒷자리부터 데이터 저장
					sum[(NSplit.length-1) - i] = String.valueOf(j);
					
				}
				
			}
			
		}

		// 10진수 변환
		for(int i = 0; i < sum.length; i++) {
			
			result += (Double.parseDouble(sum[i]) * Math.pow(B, i));
			
		}
		
		System.out.println(result);
		
	}

}

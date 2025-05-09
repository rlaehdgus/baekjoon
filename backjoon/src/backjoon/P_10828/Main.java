package backjoon.P_10828;

import java.util.Scanner;
import java.util.Stack;

/*
 * 문제:
 * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 * 
 * 명령은 총 다섯 가지이다.
 * 
 * push X: 정수 X를 스택에 넣는 연산이다.
 * pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * size: 스택에 들어있는 정수의 개수를 출력한다.
 * empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
 * top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * 
 * 
 * 입력:
 * 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 
 * 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
 * 
 * 
 * 출력:
 * 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
 * 
 */
public class Main {
	
	static Stack<Integer> stack = new Stack<Integer>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String cmnd = ""; // 명령어
		int value = 0; // 스택에 저장할 값
		
		int N = sc.nextInt(); // 명령어 반복 횟수
		
		for(int i = 0; i < N; i++) {
			
			cmnd = sc.next();
			
			if("push".equals(cmnd)) {
				
				value = sc.nextInt();
				
				push(value);
				
			} else if("pop".equals(cmnd)) {
				
				System.out.println(pop());
				
			} else if("size".equals(cmnd)) {
				
				System.out.println(size());
				
			} else if("empty".equals(cmnd)) {
				
				System.out.println(empty());
				
			} else if("top".equals(cmnd)) {
				
				System.out.println(top());
				
			}
			
		}

	}
	
	/**
	 * Stack에 값 저장
	 * @param value
	 */
	public static void push(int value) {
		stack.push(value);
	}
	
	/**
	 * Stack에 저장되어있는 최상단 정수 제거
	 * @return
	 */
	public static int pop() {
		int size = stack.size();
		int value = 0;
		
		if(size > 0) {
			value = stack.pop();
		} else {
			value = -1;
		}
		
		return value;
	}
	
	/**
	 * Stack에 저장되어있는 정수 개수
	 * @return
	 */
	public static int size() {
		return stack.size();
	}
	
	/**
	 * Stack에 정수가 존재하는지 확인
	 * @return
	 */
	public static int empty() {
		boolean isEmpty = stack.empty();
		int value = 0;
		
		if(isEmpty) {
			value = 1;
		}
		
		return value;
	}
	
	/**
	 * Stack에 저장되어있는 최상단 정수 출력
	 * @return
	 */
	public static int top() {
		boolean isEmpty = stack.empty();
		int value = 0;
		
		if(isEmpty) {
			value = -1;
		} else {
			value = stack.peek();
		}
		
		return value;
	}

}

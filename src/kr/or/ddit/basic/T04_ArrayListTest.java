package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class T04_ArrayListTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> lists = new ArrayList<String>();
		
//		// 문제1) 5명의 별명을 입력하여 ArrayList에 저장하고
//		//		별명의 길이가 제일 긴 별명을 출력하시오.
//		//		(단, 각 별명의 길이는 모두 다르게 입력한다.)
//		for(int i = 1; i <= 5; i++) {
//			System.out.println(i + "번째 별명 : ");
//			String input = sc.nextLine();
//			lists.add(input);
//		}
//		
//		String maxinput = lists.get(0);
//		for(int i = 1; i < lists.size(); i++) {
//				if(maxinput.length() < lists.get(i).length()) {
//					maxinput = lists.get(i);
//				}
//		}
//		System.out.println("제일 긴 별명 : " + maxinput);
		
		// 문제2) 문제1에서 별명의 길이가 같은 것을 여러개 입력했을 때도 처리되도록 하시오.
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + "번째 별명 : ");
			String input = sc.next();
			lists.add(input);
		}
		
		// maxLen은 제일 긴 별명의 길이를 저장하는 변수
		int maxLen = lists.get(0).length();
		for(int i = 1; i < lists.size(); i++) {
			if(maxLen < lists.get(i).length()) {
				maxLen = lists.get(i).length();
			}
		}
		
		System.out.println("제일 긴 별명들");
		for(int i = 0; i < lists.size(); i++) {
			if(maxLen == lists.get(i).length()) {
				System.out.println(lists.get(i));
			}
		}
		
		
		
	}

}

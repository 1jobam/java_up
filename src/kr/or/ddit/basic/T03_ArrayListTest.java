package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class T03_ArrayListTest {

	public static void main(String[] args) {
		// 문제) 5명의 사람 이름을 입력하여 ArrayList에 저장하고
		//		이 중에 '김'씨 성의 이름을 출력하시오.
		//		(단, 입력은 Scanner를 입력하여 입력 받는다)
		
		ArrayList<String> names = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5명의 이름을 입력하여주세요. (첫번째)>");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + "번째 이름 : ");
			String name = sc.next();
			names.add(name);
		}
		
		
		for(int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			
//			if(name.charAt(0) == '김') {
//				System.out.println(name);
//			}
			
			if(name.substring(0,1).equals("김")) {
				System.out.println(name);
			}
			
//			if(name.indexOf("김") == 0) {
//				System.out.println(name);
//			}
//			
//			if(name.startsWith("김")) {
//				System.out.println(name);
//			}
		}
		
	}
	
}

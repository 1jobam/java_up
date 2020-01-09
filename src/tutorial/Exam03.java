package tutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Exam03 {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		new Exam03().start();
	}
	
	public void start() {	
		int menu;
		
		do {
			System.out.println("=====================");
			System.out.println("Lotto 프로그램");
			System.out.println("---------------------");
			System.out.println("1. Lotto 구입");
			System.out.println("2. 프로그램 종료");
			System.out.println("=====================");
			System.out.println("메뉴선택 : ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1 :
				Lotto();
				break;
			case 2 :
				System.out.println("감사합니다");
				System.exit(0);
				break;
			}
			break;
		}while(menu != 0);
		
	}
	
	public void Lotto() {
		int input;
		int coin;
		int temp;
		System.out.println("=====================");
		System.out.println("Lotto 구입 시작");
		System.out.println("---------------------");
		System.out.println("Lotto 구입 페이지\n(1000원에 로또번호 하나입니다.)");
		System.out.println("=====================");
		System.out.println("금액 입력 : ");
		input = Integer.parseInt(sc.nextLine());
		coin = input / 1000;
		temp = input % 1000;
		if(!(input >= 1000)) {
			System.out.println("현재 입력한 금액 : " + input + "원 \n★★★★돈같고와★★★★");
			start();
		}
		System.out.println("행운의 로또번호는 아래와 같습니다.\n");
		for(int i = 1; i <= coin; i++) {
			System.out.print("로또번호" + i + " : ");
			Random();
		}System.out.println();
		System.out.println("받은 금액은 " + input + "원 이고 " + "거스름돈은 " + temp + "원 입니다.\n");
		start();
	}
	
	public void Random() {
		Set<Integer> ranSet = new HashSet<Integer>();
		int[] num = new int[6];
		
		while(ranSet.size() < num.length) {
			ranSet.add( (int)(Math.random() * 45) + 1 );
		}
		
		List<Integer> change = new ArrayList<Integer>(ranSet);
		Collections.sort(change);
		
		for(int i = 0; i < num.length; i++) {
			num[i] = change.get(i);
			if(i != num.length -1) {
			System.out.print(num[i] + ", ");
			}
		}System.out.println();
		
	}
	
}



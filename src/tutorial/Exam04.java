package tutorial;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exam04 {
	
	Scanner sc = new Scanner(System.in);
	Map<Object, String> hash = new HashMap<>();
	
	public static void main(String[] args) {
		System.out.println("********************");
		System.out.println("호텔 문을 열었습니다.");
		System.out.println("********************");
		new Exam04().start();
	}
	
	public void start() {
		int menu;
		
		do {
			System.out.println("\n**********************************");
			System.out.println("어떤 업무를 하시겠습니까?");
			System.out.println("1.체크인\t2.체크아웃\t3.객실상태\t4.업무종료");
			System.out.println("**********************************");
			System.out.print("메뉴선택 => ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1 :
				checkin();
				break;
			case 2 :
				checkout();
				break;
			case 3 :
				roomlist();
				break;
			case 4 :
				System.out.println("********************");
				System.out.println("호텔 문을 닫았습니다.");
				System.out.println("********************");
				System.exit(0);
				break;
			}
			break;
		}while(menu != 0);
	}
	
	
	
	public void checkin() {
		int number = 0;
		String name = null;
		
		System.out.println("어느방에 체크인 하시겠습니다.");
		System.out.print("방번호 입력 => ");
		number = Integer.parseInt(sc.nextLine());
		
		if(hash.get(number) != null) {
			System.out.println(number + "방에는 이미 사람이 있습니다.");
			start();
		}
		System.out.println("누구를 체크인 하시겠습니까?");
		System.out.print("이름 입력 => ");
		name = sc.nextLine();
		
		hash.put(number, name);
		System.out.println(hash.get(number) + "님 체크인 되었습니다.");

		start();
	}

	public void checkout() {
		int number;
		
		System.out.println("어느방을 체크아웃 하시겠습니까?");
		System.out.print("방번호 입력 =>");
		number = Integer.parseInt(sc.nextLine());
		
		if(hash.get(number) == null) {
			System.out.println(number + "방에는 체크인한 사람이 없습니다.");
			start();
		}
		
		hash.remove(number);
		System.out.println("체크아웃 되었습니다.");
		
		start();
	}	
	
	public void roomlist() {
		Set<Map.Entry<Object, String>> hashset = hash.entrySet();
		
		Iterator<Map.Entry<Object, String>> enit = hashset.iterator();

		while(enit.hasNext()) {
			Map.Entry<Object, String> roomen = enit.next();
			System.out.println("방번호 : " + roomen.getKey() + ", 투숙객 : " + roomen.getValue());
		}
		
		start();
	}
	
}

	class room{ //객실 VO
		private int number;
		private String name;
		public room(int number, String name) {
			super();
			this.number = number;
			this.name = name;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
//		@Override
//		public String toString() {
//			return "방번호 : " + number + ", 이름 : " + name;
//		}
	}

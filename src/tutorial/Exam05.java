package tutorial;

import java.util.Scanner;

public class Exam05 {
	/*
		 문제) 태양계 행성을 나타내는 enum Planet을 이용하여 구하시오.
		(단, enum 객체 생성시 반지름을 이용하도록 정의하시오.) 
		
		예) 행성의 반지름(KM):
		수성(2439), 
		금성(6052), 
		지구(6371), 
		화성(3390), 
		목성(69911), 
		토성(58232), 
		천왕성(25362), 
		해왕성(24622)
	 */
	
	Scanner sc = new Scanner(System.in);
	double pi = Math.PI;
	
	public enum Planet{
		수성(2439), 금성(6052), 지구(6371), 화성(3390), 목성(69911), 토성(58232), 천왕성(25362), 해왕성(24622);
		
		private double km;
		
		private Planet(double data) {
			km = data;
			
		}
		
		public double getkms() {
			return km;
		}
	}
	
	public static void main(String[] args) {
		new Exam05().menu();
		
	}
	
	public void menu() {
		int menu;
		
		while(true) {
		System.out.println("==============================================");
		System.out.println("태양계 행성의 면적을 구하는 프로그램에 오신것을 환영합니다.");
		System.out.println("1. 원하는 행성 면적 조회");
		System.out.println("2. 행성 전체 조회");
		System.out.println("0. 프로그램 종료하기");
		System.out.println("==============================================");
		System.out.print("입력 > ");
		
		menu = Integer.parseInt(sc.nextLine());
		
		switch(menu) {
			case 1 :
				self();
				break;
			case 2 :
				all();
				break;
			case 0 :
				System.out.println("행성 면적 구하는 프로그램을 이용해주셔서 감사합니다.");
				System.exit(0);
				break;
		}
		
		break;
		}
	}
	
	
	public void all() {
		Planet[] planets = Planet.values();
		
		System.out.println("==============================================");
		System.out.println("행성 면적 전체 조회...");
		System.out.println("==============================================");
		for(int i = 0; i < planets.length; i++) {
			System.out.println(planets[i].name() + ", " + (planets[i].getkms() * 2) * pi);
		}
		System.out.println("---------------------------------------------");
		System.out.println("행성 면적 출력 완료...");
		
		menu();
	}
	
	public void self() {
		String menu = null;
		Planet siz;
		
			System.out.println("==============================================");
			System.out.println("원하는 행성을 입력하여 주세요.");
			System.out.println("수성, 금성, 지구, 화성, 목성, 토성, 천왕성, 해왕성");
			System.out.println("----------------------------------------------");
			System.out.println("행성 조회를 마치시려면 0번을 입력하여주세요.");
			System.out.println("==============================================");
			System.out.print("입력 > ");
			
			menu = sc.nextLine();
			
			switch(menu) {
			case "0" : menu();break;
			}
			
			siz = Planet.valueOf(menu);
			
			System.out.println("----------------------------------------------");
			System.out.println("입력하신 행성은 : " + siz.name() + "\n행성의 면적은 : " + (siz.getkms() * 2) * pi + " 입니다.");
			System.out.println("----------------------------------------------");
			System.out.println("조회해 주셔서 감사합니다.");
			self();
			
			
	}
	
}
	

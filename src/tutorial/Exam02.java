package tutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Exam02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<student> studentList = new ArrayList<>();
		
		studentList.add(new student("601289", "가나니", 55, 60, 35));
		studentList.add(new student("123456", "박하니", 50, 60, 70));
		studentList.add(new student("960120", "나가니", 80, 90, 75));
		studentList.add(new student("234567", "머하니", 70, 40, 30));
		studentList.add(new student("562134", "보스니", 30, 10, 20));
		
		String num = null;
		String name = null;
		int guk = 0;
		int english = 0;
		int math = 0;
		int sum = 0;
		int rank = 1;
		
		System.out.println("학번 적어 >");
		num = sc.nextLine();
		System.out.println("이름 적어 >");
		name = sc.nextLine();		
		System.out.println("국어점수 적어 >");
		guk = Integer.parseInt(sc.nextLine());		
		System.out.println("영어점수 적어 >");
		english = Integer.parseInt(sc.nextLine());
		System.out.println("수학점수 적어 >");
		math = Integer.parseInt(sc.nextLine());
		
		studentList.add(new student(num, name, guk, english, math));
		
		
		System.out.println("정렬 없이 출력하기 >");
		System.out.println("================================");
		for(student asc : studentList) {
			sum = asc.getGuk() + asc.getMath() + asc.getEnglish();
			asc.setSum(sum);
//			asc.setRank(rank++);
			System.out.println(asc);
		}
		
//		rank = 1;
		System.out.println();
		Collections.sort(studentList);
		System.out.println("학번의 오름차순 정렬 출력 >");
		System.out.println("================================");
		for(student asc : studentList) {
//			asc.setRank(rank++);
			System.out.println(asc);
		}

		rank = 1;
		System.out.println();
		Collections.sort(studentList, new SortSumDesc());
		System.out.println("총점의 역순(내림차순) && 총점이 같으면 학번(내림차순) 정렬 출력 >");
		System.out.println("================================");
		for(student asc : studentList) {
			rank = 1;
			for(student asc2 : studentList){ // 비교할 자료
				if(asc.getSum() < asc2.getSum() ){
					rank++;
				}
			}

			asc.setRank(rank);
			System.out.println(asc);

		}
		
		
		
		
	}
	
}

class SortSumDesc implements Comparator<student> {

	@Override
	public int compare(student mem1, student mem2) { //외부클래스를 이용한 정렬 (총점 내림차순, 같을경우 학번 오름차순)
		
		if(mem1.getSum() > mem2.getSum()) {
			return -1;
		}else if(mem1.getSum() == mem2.getSum()) {
			return mem1.getNum().compareTo(mem2.getNum()) * -1;
		}else {
			return 1;
		}
	}
	
}


class student implements Comparable<student>{
	
	private String num;
	private String name;
	private int guk;
	private int english;
	private int math;
	private int sum;
	private int rank;


	public student(String num, String name, int guk, int english, int math) {
		super();
		this.num = num;
		this.name = name;
		this.guk = guk;
		this.english = english;
		this.math = math;
	}
	
	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}


	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}


	public String getNum() {
		return num;
	}


	public void setNum(String num) {
		this.num = num;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getGuk() {
		return guk;
	}


	public void setGuk(int guk) {
		this.guk = guk;
	}


	public int getEnglish() {
		return english;
	}


	public void setEnglish(int english) {
		this.english = english;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() { 
		return "학번=" + num + ", 이름=" + name + ", 국어점수=" + guk + ", 영어점수=" + english + ", 수학점수=" + math + ", 총점=" + sum + ", 등수=" + rank; 
	}

	@Override
	public int compareTo(student asc) {
		return getNum().compareTo(asc.getNum());
	}


	
}
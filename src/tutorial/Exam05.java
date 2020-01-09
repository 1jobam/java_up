package tutorial;

public class Exam05 {
	double pi = Math.PI;
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
		Exam05 pi = new Exam05();
		Planet as = Planet.수성;
		
		System.out.println(pi.pi);
		System.out.println(as.name());
		System.out.println((as.getkms() * 2) * pi.pi);
	}
	
}


public class Mammal extends Object { //모든 클래스는 Object의 자식이라 생략되어있다.
		private String name;
		//public Mammal() {} //기본생성자 명시적 표현
		public Mammal(String name) {
			this.name = name;
			
		}
		public String getName() {
			return name;
		}
	}
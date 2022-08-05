
public class InheritanceDemo {
	public static void main(String[] args) {
		ThreeD td = new ThreeD();
		td.print();
	}
}
class TwoD{
	int x = 5, y =10;
	public TwoD() {
		System.out.println("I'm TwoD");
	}
	void print(){
		System.out.printf("(x,y) = (%d, %d)\n",this.x, this.y);
	}
}
class ThreeD extends TwoD{ //TwoD의 자원에 접근하였으니 상속이라고 한다.(ThreeD가 TwoD의 자원을 사용할 수있다.)
	int z = 100;
	public ThreeD() {
		System.out.println("I'm ThreeD");
	}
	
}

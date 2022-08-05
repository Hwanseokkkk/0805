import java.util.Date;

public class Car {
	private String name;
	private int price;
	private String maker;
	private Date today;
	private final double PI;// 상수는 final붙혀야한다 상수는 항상 대문자

	public Car(String name, int price, String maker) {
		this.name = name;
		this.price = price;
		this.maker = maker;
		this.PI = 3.141596;
		System.out.println("방금 객체가 생성되었습니다.");
	}

	{
		// initialization Block
		System.out.println("Who are you?");
		this.today = new Date();

	}

	@Override
	public String toString() {
		return "오늘은" + this.today + "입니다.";

	}
}

public class InheritanceDemo1 {
	public static void main(String[] args) {
		Manager m = new Manager();
		Employee e = new Employee();
		System.out.println(e.salary); //자식주소가 부모자원인 salary 자원을 사용하였다.
	}
}
class Employee extends Manager{//Employee는 Manager의 자식이다.
	String name = "한지민";
	
}
class Manager{
	int salary = 10000000;
}

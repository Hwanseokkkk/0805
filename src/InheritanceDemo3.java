/*상속시 주의할 점 4가지
 * 2. private는 상속되지 않는다.
 * 
 */
public class InheritanceDemo3 {
	public static void main(String[] args) {
		Sparrow sp = new Sparrow(10);
		//System.out.println(sp.name); //private는 상속되지않는다.
		
	}
}

package java_hw_3;

public class p7 {
	public static void main(String[] args) {
		Car car1;
		car1 = new Car();
		
		car1.num = 1234;
		car1.gas = 242.5;
		
		Car car2;
		car2 = new Car();
		
		car2.num = 5678;
		car2.gas = 45.2;
			
		System.out.println("car1車號是" +car1.num);
		System.out.println("car1汽油量是" +car1.gas);
		
		System.out.println("car2車號是" +car2.num);
		System.out.println("car2汽油量是" +car2.gas);
	}
}
/*	
class Car
{
	int num;
	double gas;
}
*/

package java_hw_3;

public class p17 {
	public static void main(String[] args) {
		Car car1;
		car1 = new Car();
		
		car1.setNumGas(1243, 24.7);
		
		int number = car1.getnum();
		double gasoline = car1.getgas();
		
		System.out.println("調查樣品車時得知");
		System.out.println("車號為" + number + "，汽油量為" + gasoline);
	}
}
/*
class Car
{
	int num;
	double gas;
	
	int getnum() 
	{
		System.out.println("調查車號");
		return num;
	}
	double getgas() 
	{
		System.out.println("調查汽油量");
		return gas;
	}
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + "，將汽油量設為" + gas);
	}
}
*/


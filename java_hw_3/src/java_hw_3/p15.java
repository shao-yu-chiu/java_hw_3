package java_hw_3;

public class p15 {
	public static void main(String[] args) {
		Car car1;
		car1 = new Car();
		
		int numI = 5312;
		double gasI = 52.6;
		
		car1.setNumGas(numI, gasI);
	}
}
/*
class Car
{
	int num;
	double gas;
	
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + "，將汽油量設為" + gas);
	}
	
	void show()
	{
		System.out.println("車號為" + num);
		System.out.println("汽油量為" + gas);
	}
}
*/

import java.util.Scanner;
public class calculation
{
	public static void main(String args[])
	{
		System.out.print("Enter your monthly salary");
		Scanner scanner=new Scanner(System.in);
		double salary=scanner.nextDouble();
		double pt=cp(salary);

		System.out.print("Professional Tax=" + pt);
		scanner.close();
		
	}

	static double cp(double salary)
	{
		double pt=0;
		if (salary<=10000)
		pt=0;
		else if(salary<=25000)
		pt=100;
		else if(salary<=50000)
		pt=200;
		else if(salary<=75000)
		pt=300;
		else if(salary<=100000)
		pt=450;
		else
		pt=650;
		return pt;
	}
}
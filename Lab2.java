import java.util.Scanner;
class Lab2
{
	public static int reverseN(int num)
	{
		int red=0;
		while(num!=0)
		{ 
			red=red*10+num%10;
			num/=10;
		}
		return red;
	}
	public static int sumD(int num)
	{
		int sum=0;
		while(num!=0)
		{
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
	public static boolean isPrime(int n)
	{
		if(n<2)
			return false;
		for(int i=2; i<=Math.sqrt(n); i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}

	public static void range(int start, int end)
	{
		System.out.print("Prime numbers in the range " + start + " to " + end + ": ");
		for(int i=start; i<=end; i++)
		{
			if(isPrime(i))
				System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String []args)
	{
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("\n Menu:");
			System.out.println("1. Reverse the number");
			System.out.println("2. Sum of the digits of number");
			System.out.println("3. Print prime numbers in a range");
			System.out.print("4. Exit\n");
        		System.out.print("Enter your choice (1/2/3/4): ");
			int choice = scanner.nextInt();
			switch(choice)
			{
				case 1: System.out.print("Enter a number: ");
					int n1 = scanner.nextInt();
					int rev = reverseN(n1);
					System.out.print("Reversed number: " + rev);
					break;
					
				case 2: System.out.print("Enter a number: ");
					int n2 = scanner.nextInt();
					int digitSum = sumD(n2);
					System.out.println("Sum of digits = " + digitSum);
					break;
				case 3: System.out.print("Enter the start of the range: ");
					int startRange = scanner.nextInt();
					System.out.print("Enter the end of the range: ");
					int endRange = scanner.nextInt();
					range(startRange, endRange);
					break;
				case 4: System.out.println("Exiting the program.");
					System.exit(0);
						
				default: System.out.println("Invalid choice. Please enter a valid option.");
			}
		}
	}
}
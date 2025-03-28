import java.util.Scanner;
class Lab3
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = s.nextInt();
        int[] array = new int[size];

        System.out.println("Enter elements to insert into the array: ");
        for(int i = 0; i < size; i++)
        {
            array[i] = s.nextInt();
        }

        System.out.print("Array Elements: ");
        for(int i = 0; i < size; i++)
        {
            System.out.print(array[i] + " ");
        }

        int p, e;
        System.out.println("\n Enter the position where you want to insert: ");
        p = s.nextInt();

        System.out.println("Enter the element which you want to insert: ");
        e = s.nextInt();
        
        array[p - 1] = e;

        System.out.println("Array Elements: ");
        for(int i = 0; i < size; i++)
        {
            System.out.print(array[i] + " ");
        }

        s.close();
	}
}
import java.util.*;

public class Exp {
    void method() {
        int x, i, choice, n = 0;
        int sum = 0, largest = 0, smallest = 0;
        Scanner st = new Scanner(System.in);
        
        System.out.println("Enter N number:");
        n = st.nextInt();
        
        int a[] = new int[n];
        System.out.println("Enter numbers one by one:");
        for (i = 0; i < n; i++) {
            a[i] = st.nextInt();
        }
        
        System.out.println("\nMenu:");
        System.out.println("1. Sum of even numbers");
        System.out.println("2. Largest number");
        System.out.println("3. Smallest number");
        System.out.println("4. Exit");
        
        System.out.println("Enter your choice (1/2/3/4):");
        choice = st.nextInt();
        st.close();
        
        switch (choice) {
            case 1:
                for (i = 0; i < n; i++) {
                    if (a[i] % 2 == 0) {
                        sum += a[i];
                    }
                }
                System.out.println("Sum of even numbers: " + sum);
                break;
            
            case 2:
                for (i = 0; i < n; i++) {
                    if (a[i] > largest) {
                        largest = a[i];
                    }
                }
                System.out.println("Largest number is: " + largest);
                break;
            
            case 3:
                smallest = a[0];
                for (i = 0; i < n; i++) {
                    if (a[i] < smallest) {
                        smallest = a[i];
                    }
                }
                System.out.println("Smallest number is: " + smallest);
                break;
            
            case 4:
                System.out.println("Exiting the program...");
                break;
            
            default:
                System.out.println("Invalid choice!");
                break;
		}
	}
}

class Lab4 {
    public static void main(String[] args) {
        Exp ex = new Exp();
        ex.method();
	}
}
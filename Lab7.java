class Person
{
    String name;
    String aadharNumber;

    public Person(String name, String aadharNumber) {
        this.name = name;
        this.aadharNumber = aadharNumber;
    }
}

class Student extends Person {
    String studentId;

    public Student(String name, String aadharNumber, String studentId) {
        super(name, aadharNumber);
        this.studentId = studentId;
    }
}

class Employee extends Person {
    String employeeId;

    public Employee(String name, String aadharNumber, String employeeId) {
        super(name, aadharNumber);
        this.employeeId = employeeId;
    }
}

public class Lab7 {
    public static void main(String[] args) {
        Person[] people = {
                new Student("John Doe", "123456789012", "S123"),
                new Employee("Jane Smith", "987654321098", "E456"),
                // Add more students and employees as needed
        };

        String searchAadhar = "123456789012";

        for (Person person : people)
        {
            if (person.aadharNumber.equals(searchAadhar))
            {
                System.out.println("Person found:");
                System.out.println("Name: " + person.name);
                System.out.println("AADHAR Number: " + person.aadharNumber);

                if (person instanceof Student) {
                    System.out.println("Student ID: " + ((Student) person).studentId);
                } else if (person instanceof Employee) {
                    System.out.println("Employee ID: " + ((Employee) person).employeeId);
                }

                break;
            }
        }
    }
}
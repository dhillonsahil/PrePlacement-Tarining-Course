# Q1 
```java
import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
```

# Q2 : 
```java
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int numTerms = scanner.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= numTerms; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

```

# Q3 
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        int number;

        System.out.println("Enter a list of numbers (enter -1 to finish):");

        do {
            number = scanner.nextInt();

            if (number != -1) {
                numbers.add(number);
            }
        } while (number != -1);

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.size();

        System.out.println("Average: " + average);
    }
}
```

# Q4
```java
import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int largest;

        if (num1 >= num2) {
            if (num1 >= num3) {
                largest = num1;
            } else {
                largest = num3;
            }
        } else {
            if (num2 >= num3) {
                largest = num2;
            } else {
                largest = num3;
            }
        }

        System.out.println("The largest number is: " + largest);
    }
}


```

# Q5 
```java
public class VariableTypes {
    public static void main(String[] args) {
        int myInteger = 42; // Declare and initialize an integer variable
        double myDouble = 3.14; // Declare and initialize a double variable
        String myString = "Hello, World!"; // Declare and initialize a String variable

        // Print the values of the variables
        System.out.println("Integer value: " + myInteger);
        System.out.println("Double value: " + myDouble);
        System.out.println("String value: " + myString);
    }
}

```
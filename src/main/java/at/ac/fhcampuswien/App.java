package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901" + System.lineSeparator() +
                "         __" + System.lineSeparator() +
                " _(\\    |@@|" + System.lineSeparator() +
                "(__/\\__ \\--/ __" + System.lineSeparator() +
                "   \\___|----|  |   __" + System.lineSeparator() +
                "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
                "       /\\__/\\ \\__O (__" + System.lineSeparator() +
                "      (--/\\--)    \\__/" + System.lineSeparator() +
                "      _)(  )(_" + System.lineSeparator() +
                "     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        char a = 'Z';
        int b = 0xface;
        int c = 012;
        long d = 80L;
        float e = 44e-1f;
        float f = 5.5f;
        double g = 8.88e1;
        double h = 99.9;

        int sum = (int) a + b + c + (int) d + (int) e + (int) f + (int) g + (int) h;
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println("Before Swap:");
        System.out.print("x: ");
        System.out.print("y: ");

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swap:" + System.lineSeparator() + "x: " + x + System.lineSeparator() + "y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n1: ");
        int n1 = scanner.nextInt();
        System.out.print("n2: ");
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.print("n1 > n2" + System.lineSeparator());
        } else if (n2 > n1) {
            System.out.print("n2 > n1" + System.lineSeparator());
        } else if (n1 == n2) {
            System.out.print("n1 == n2" + System.lineSeparator());
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter annual Revenue: ");
        int s = scanner.nextInt();

        if (s < 0 || s >= 100000) {
            System.out.print("Invalid Revenue" + System.lineSeparator());
        } else if (s >= 0 && s < 20000 ) {
            System.out.print("Poor Sales Revenue" + System.lineSeparator());
        } else if (s >= 20000 && s < 50000) {
            System.out.print("Average Sales Revenue" + System.lineSeparator());
        } else if (s >= 50000 && s < 80000) {
            System.out.print("Good Sales Revenue" + System.lineSeparator());
        } else if (s >= 80000 && s < 100000) {
            System.out.print("Excellent Sales Revenue" + System.lineSeparator());
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter CommissionClass: ");
        int a = scanner.nextInt();

        switch (a) {
            case 1:
                System.out.print("Your Commission Rate was set to 0.01" + System.lineSeparator());
                break;
            case 2:
                System.out.print("Your Commission Rate was set to 0.02" + System.lineSeparator());
                break;
            case 3:
                System.out.print("Your Commission Rate was set to 0.03" + System.lineSeparator());
                break;
            case 4:
                System.out.print("Your Commission Rate was set to 0.04" + System.lineSeparator());
                break;
            default:
                System.out.print("Your Commission Rate was set to 0.0" + System.lineSeparator());
                break;
        }
    }

    //todo Task 9
    public void leapyear(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Year: ");
        int y = scanner.nextInt();

        if ((y%100) == 0 && (y%400) != 0) {
            System.out.print("Not a Leapyear" + System.lineSeparator());
        } else if ((y%4) == 0 || (y%400) == 0 ) {
            System.out.print("Leapyear" + System.lineSeparator());
        } else {
            System.out.print("Not a Leapyear" + System.lineSeparator());
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int before = scanner.nextInt();
        int after = 0;

        while (before != 0 && before < 1000) {
            int ldigit = before % 10; // getting the last digit
            after = after * 10 + ldigit;
            before /= 10;
        }
        System.out.print(after + System.lineSeparator());
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}
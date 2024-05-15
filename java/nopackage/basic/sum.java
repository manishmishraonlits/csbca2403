import java.util.Scanner;

class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        System.out.print("Enter another number: ");
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println("The sum is " + c);
        scanner.close();
    }
}
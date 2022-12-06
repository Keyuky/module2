import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Greeting: ");
        String greeting = sc.nextLine();
        String result = " Hello " + greeting;
        System.out.println(result);

        String myName = "Tèo";
        System.out.printf(result + " My name's %s" , myName);

        sc.close();
    }
}

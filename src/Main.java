import java.util.*;

public class Main {
    public static void main(String[] args) {

        int a, b, c;

        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter the number a: ");
        a = inp.nextInt();

        System.out.print("Please enter the number b: ");
        b = inp.nextInt();

        System.out.print("Please enter the number c: ");
        c = inp.nextInt();

        if ((a != b) && (b != c) && (a != c)) {

            if ((a < b) && (a < c)) { // if "a" is minimum
                if (b < c) {
                    System.out.println("a < b < c");
                } else {
                    System.out.println("a < c < b");
                }
            } else if ((b < a) && (b < c)) { // if "b" is minimum
                if (a < c) {
                    System.out.print("b < a < c");
                } else {
                    System.out.print("b < c < a");
                }
            } else { // "a" is not minimum, "b" is not minimum; so "c" is minimum
                if (a < b) {
                    System.out.print("c < a < b");
                } else {
                    System.out.print("c < b < a");
                }
            }
        } else {
            System.out.print("Please enter different numbers!");
        }
    }
}
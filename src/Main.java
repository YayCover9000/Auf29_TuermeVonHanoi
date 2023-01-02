import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int naechsteZahl = sc.nextInt();
        int aufruf1 = Main.Hanoi(naechsteZahl);
        System.out.println(naechsteZahl);

    }public static int Hanoi(int a) {
        int zahl = a;
        int[] array = new int[zahl];
        int[] arrayZwischen = new int[zahl];
        for(int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            arrayZwischen[i] = array[i];
            arrayZwischen[i] = Hanoi(array[zahl] - 1);
            System.out.println(arrayZwischen[i]);
/*            int print = arrayZwischen[i];*/
        }
        return 0;
    }
}
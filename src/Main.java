import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int naechsteZahl = sc.nextInt();
        int aufruf1 = Main.Hanoi(naechsteZahl);
        int n = 4; // Number of disks
        // Main.towerOfHanoi(n, 'A', 'C', 'B'); // A, B and C are names of rods
        System.out.println("Pos iens" + naechsteZahl);

    }public static int Hanoi(int naechsteZahl) {
        int zahl = naechsteZahl;
        int[] array = new int[zahl];
        int[] arrayZwischen = new int[zahl];
        int laenge = arrayZwischen.length - 1;
        for(int i = 0; i < array.length; i++) {
            array[i] = i;

            for(int j = laenge; j > -1; j--) {

/*                int[] x = new int [2];
                x[y] = array[i -1];*/
                arrayZwischen[j] = array[i];

            }
            laenge = laenge - 1;

        }
        for(int e : array)
            System.out.println(e);
        for(int e : arrayZwischen)
            System.out.println(e);
        return arrayZwischen[1];
    }
    //public static int Hanoi2(int naechsteZahl, int n, char from_rod, char to_rod, char aux_rod){
        // Java recursive program to solve tower of hanoi puzzle
            // Java recursive function to solve tower of hanoi puzzle
            static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
                if (n == 1)
                {
                    System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
                    return;
                }
                towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
                System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
                towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
            }

}



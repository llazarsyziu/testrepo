import java.util.Scanner;

public class Mbledh4Numra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Shkruani numrin e parë: ");
        int numri1 = input.nextInt();

        System.out.print("Shkruani numrin e dytë: ");
        int numri2 = input.nextInt();
        System.out.print("Shkruani numrin e trtë: ");
        int numri3 = input.nextInt();
        System.out.print("Shkruani numrin e kater: ");
        int numri4 = input.nextInt();

        int rezultati = numri1 + numri2 + numri3 + numri4;
        System.out.println("Shuma e numrave është: " + rezultati);

        input.close();
    }
}


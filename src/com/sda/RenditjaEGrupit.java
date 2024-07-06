package com.sda;

import java.util.Arrays;
import java.util.Scanner;

public class RenditjaEGrupit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sa elemente ka grupi numerik? ");
        int n = scanner.nextInt();
        double[] grupiNumerik = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Jepni elementin numerik " + (i + 1) + ": ");
            grupiNumerik[i] = scanner.nextDouble();
        }
        Arrays.sort(grupiNumerik);
        System.out.print("Grupi numerik i renditur: ");
        for (int i = 0; i < n; i++) {
            System.out.print(grupiNumerik[i] + (i < n - 1 ? ", " : ""));
        }
        System.out.println();
        System.out.print("Sa elemente ka grupi i vargjeve? ");
        int m = scanner.nextInt();
        scanner.nextLine();
        String[] grupiVargjeve = new String[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Jepni vargun " + (i + 1) + ": ");
            grupiVargjeve[i] = scanner.nextLine();
        }
        Arrays.sort(grupiVargjeve);
        System.out.print("Grupi i vargjeve i renditur: ");
        for (int i = 0; i < m; i++) {
            System.out.print(grupiVargjeve[i] + (i < m - 1 ? ", " : ""));
        }
        System.out.println();
        scanner.close();
    }
}




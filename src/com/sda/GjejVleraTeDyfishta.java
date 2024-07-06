package com.sda;

import java.util.HashSet;
import java.util.Set;

public class GjejVleraTeDyfishta {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 6, 2, 7, 8, 3};
        Set<Integer> numrat = new HashSet<>();
        Set<Integer> vleraTeDyfishta = new HashSet<>();
        for (int num : array) {
            if (!numrat.add(num)) {
                vleraTeDyfishta.add(num);
            }
        }
        if (vleraTeDyfishta.isEmpty()) {
            System.out.println("Nuk ka vlera të dyfishta në grup.");
        } else {
            System.out.println("Vlerat e dyfishta janë: " + vleraTeDyfishta);
        }
    }
}





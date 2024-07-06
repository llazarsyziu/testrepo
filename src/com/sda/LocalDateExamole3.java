package com.sda;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateExamole3 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017,  1,13);
        LocalDateTime dateTime = date.atTime(1,50,9);
    }
}

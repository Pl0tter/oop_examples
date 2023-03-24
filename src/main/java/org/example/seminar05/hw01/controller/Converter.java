package org.example.seminar05.hw01.controller;

import java.util.Arrays;

public class Converter {
    public static int[] ratioToInt(String num){
        return Arrays.stream(num.split("/")).mapToInt(Integer::parseInt).toArray();
    }

}

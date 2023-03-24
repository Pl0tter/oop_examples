package org.example.seminar05.hw01.model;

import org.example.seminar05.hw01.controller.Converter;

public class SumCalc extends BaseCalc {
    @Override
    public String result() {
        if (numType == 1) {
            return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
        } else if (numType == 2) {
            int[] ratioA = Converter.ratioToInt(a);
            int[] ratioB = Converter.ratioToInt(b);
            int[] res;
            if (ratioA[1] == ratioB[1]) {
                res = new int[]{ratioA[0] + ratioB[0], ratioA[1]};
            } else {
                res = new int[]{ratioA[0] * ratioB[1] + ratioB[0] * ratioA[1], ratioA[1] * ratioB[1]};
            }
            return res[0] + "/" + res[1];
        }
        return null;
    }
}

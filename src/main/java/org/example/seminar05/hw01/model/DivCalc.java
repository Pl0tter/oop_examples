package org.example.seminar05.hw01.model;

import org.example.seminar05.hw01.controller.Converter;

public class DivCalc extends BaseCalc {
    @Override
    public String result() {
        if (numType == 1) {
            return Integer.toString(Integer.parseInt(a) / Integer.parseInt(b));
        } else if (numType == 2) {
            int[] ratioA = Converter.ratioToInt(a);
            int[] ratioB = Converter.ratioToInt(b);
            int[] res = new int[]{ratioA[0] * ratioB[1], ratioA[1] * ratioB[0]};
            return res[0] + "/" + res[1];
        }
        return null;
    }
}

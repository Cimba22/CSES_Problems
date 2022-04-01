package com.cimba.csesproblems.introductoryproblems;

import com.cimba.csesproblems.introductoryproblems.algorithms.WeirdAlgorithm;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Demo {
    public static void main(String[] args) {
        WeirdAlgorithm weirdAlgorithm = new WeirdAlgorithm();
        weirdAlgorithm.algorithm(3);


        //TODO Rounding for time counting
       // DecimalFormat df = new DecimalFormat("#.###");
       // df.setRoundingMode(RoundingMode.CEILING);
       // String time = df.format((long) weirdAlgorithm.algorithm(3) * Math.pow(10, -9)) + " secs";
        //System.out.format("%15s\n",time);
    }
}

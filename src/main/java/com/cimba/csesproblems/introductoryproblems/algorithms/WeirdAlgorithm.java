package com.cimba.csesproblems.introductoryproblems.algorithms;

public class WeirdAlgorithm {

    public void algorithm(long n){

        //long start = System.nanoTime();

        if (n == 1){
            System.out.print(1 + " ");
            return;
        }else {
            System.out.print(n + " ");
            if(n % 2 == 0){
                algorithm(n/2);
            }else {
                algorithm(n * 3 + 1);
            }
        }

        //TODO time counter
        //long finish = System.nanoTime();
        //System.out.println("\n");
        //System.out.println(finish - start);
        //return finish - start;
    }
}

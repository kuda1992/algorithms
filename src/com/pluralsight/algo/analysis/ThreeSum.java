package com.pluralsight.algo.analysis;

import com.pluralsight.algo.algs4.In;
import com.pluralsight.algo.algs4.StdOut;
import com.pluralsight.algo.utils.StopWatch;

import java.net.URL;

public class ThreeSum {


    public static long count(int[] a) {

        int length = a.length;
        long sum = 0;

        for (int i = 0; i < length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        URL path = ThreeSum.class.getResource(args[0]);

        System.out.println(path.getFile());

        int[] a = In.readInts(path.getFile());

        StopWatch stopWatch = new StopWatch();
        StdOut.println(count(a));
        double elapsedTime = stopWatch.elapsedTime();
        System.out.println("the program took " + elapsedTime + " seconds");
    }
}

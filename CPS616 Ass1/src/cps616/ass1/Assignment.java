/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cps616.ass1;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author minim_000
 */
public class Assignment {

    final static int N = 1000000;
    final static int MAXVALUE = 10 * N;
    final static int AVERAGEOVER = 1000000 / N;

    public static void main(String args[]) {
        long fasttime = 0;
        long slowtime = 0;
        long t;
        int arr1[] = new int[N];
        int arr2[] = new int[N];
        for (int i = 0; i < AVERAGEOVER; i++) {
            Random random = new Random();
            for (int x = 0; x < N; x++) {
                int num = random.nextInt(MAXVALUE) + 1;
                arr1[x] = num;
                arr2[x] = num;
            }

            /*System.out.println(Arrays.toString(arr1));
             System.out.println();
             System.out.println(Arrays.toString(arr2));*/
            t = System.nanoTime();
            Sort.fastsort(arr1, 0, arr1.length - 1);
            fasttime = fasttime + (System.nanoTime() - t);
            t = System.nanoTime();
            Sort.slowsort(arr2);
            slowtime = slowtime + (System.nanoTime() - t);

            /*System.out.println(Arrays.toString(arr1));
             System.out.println();
             System.out.println(Arrays.toString(arr2));*/
        }
        System.out.println("Fast sort took " + fasttime/AVERAGEOVER + " nanoseconds.");
        System.out.println("Slow sort took " + slowtime/AVERAGEOVER + " nanoseconds.");
    }
}

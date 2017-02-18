package cps616.lab2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package cps616.lab2;

import java.util.Scanner;

/**
 *
 * @author minim_000
 */
public class Hard {

    public static void main(String args[]) {
        int hs, ht, x;
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        hs = sc.nextInt();
        sc.nextInt();
        ht = sc.nextInt();
        sc.nextLine();
        String image[] = new String[hs];
        String template[] = new String[ht];
        for (x = 0; x < hs; x++) {
            image[x] = sc.nextLine();
        }
        for (x = 0; x < ht; x++) {
            template[x] = sc.nextLine();
        }
        sc.close();
        outerloop:
        for (x = 0; x < hs - ht; x++) {
            if (image[x].contains(template[0])) {
                int y = 0;
                while (y >= 0) {
                    for (int x1 = 0; x1 < ht && x + x1 < hs; x1++) {
                        if (image[x + x1].indexOf(template[x1]) != y) {
                            found = false;
                            break;
                        }
                        found = true;
                    }
                    if (found) {
                        System.out.println(y + " " + x);
                        break outerloop;
                    }
                    y = image[x].indexOf(template[0], y + 1);
                }
            }
        }
        if (!found) {
            System.out.println("no match");
        }
    }
}

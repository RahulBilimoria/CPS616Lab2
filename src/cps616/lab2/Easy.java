package cps616.lab2;

import java.util.Scanner;
public class Easy {
    public static void main(String args[]) {
        int hs, ht;
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        hs = sc.nextInt();
        sc.nextInt();
        ht = sc.nextInt();
        sc.nextLine();
        String image[] = new String[hs];
        String template[] = new String[ht];
        for (int x = 0; x < hs; x++)
            image[x] = sc.nextLine();
        for (int x = 0; x < ht; x++)
            template[x] = sc.nextLine();
        sc.close();
        for (int x = 0; x < hs; x++) {
            if (image[x].contains(template[0])) {
                int y = image[x].indexOf(template[0]);
                for (int x1 = 0; x1 < ht; x1++) {
                    if (image[x + x1].indexOf(template[x1]) != y) {
                        found = false;
                        break;
                    }
                    found = true;
                }
                if (found) {
                    System.out.println(y + " " + x);
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("no match");
        }
    }
}

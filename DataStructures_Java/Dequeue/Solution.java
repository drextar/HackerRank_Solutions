/*
 * ******************************************************************************************
 * Copyright©
 *
 * Este software foi desenvolvido por Vinicius Chiarotti nos desafios na plataforma HackerRank.
 *
 * Criado em: 25/10/2022
 * Autor: Vinicius Chiarotti
 * Contato: vchiarotti@outlook.com
 *
 * ------------------------------------------------------------------------------------------
 * Portfolio: https://drextar.github.io/Portfolio/
 * Github: https://github.com/drextar
 * Linkedin: https://www.linkedin.com/in/vchiarotti/
 * ------------------------------------------------------------------------------------------
 * ******************************************************************************************
 */

package Dequeue;

import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap();
        ArrayDeque<Integer> deque     = new ArrayDeque();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            /* Remove old value (if necessary) */
            if (i >= m) {
                int old = deque.removeFirst();
                if (map.get(old) == 1) {
                    map.remove(old);
                } else {
                    map.merge(old, -1, Integer::sum);
                }
            }

            /* Add new value */
            int num = scan.nextInt();
            deque.addLast(num);
            map.merge(num, 1, Integer::sum);

            max = Math.max(max, map.size());

            /* If all integers are unique, we have found our largest
               possible answer, so we can break out of loop */
            if (max == m) {
                break;
            }
        }

        scan.close();
        System.out.println(max);
    }
}

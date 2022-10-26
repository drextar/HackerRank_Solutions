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

package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        ArrayList<ArrayList<Integer>> lists = new ArrayList();
        for (int row = 0; row < n; row++) {
            int d = scan.nextInt();
            ArrayList<Integer> list = new ArrayList();
            for (int col = 0; col < d; col++) {
                list.add(scan.nextInt());
            }
            lists.add(list);
        }

        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            ArrayList<Integer> list = lists.get(x-1);
            if (y <= list.size()) {
                System.out.println(list.get(y-1));
            } else {
                System.out.println("ERROR!");
            }
        }
        scan.close();
    }
}

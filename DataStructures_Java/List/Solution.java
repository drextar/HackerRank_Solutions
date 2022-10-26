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

package List;

import java.util.Scanner;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        LinkedList<Integer> list = new LinkedList();
        for (int i = 0; i < N; i++) {
            int value = scan.nextInt();
            list.add(value);
        }

        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            String action = scan.next();
            if (action.equals("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } else {
                int index = scan.nextInt();
                list.remove(index);
            }
        }
        scan.close();

        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}

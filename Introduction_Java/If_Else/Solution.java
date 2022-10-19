/*
 * ******************************************************************************************
 * Copyright©
 *
 * Este software foi desenvolvido por Vinicius Chiarotti nos desafios na plataforma HackerRank.
 *
 * Criado em: 19/10/2022
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

package Java_If_Else;

import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if ((N < 1) || (N > 100)) {
            System.out.println("Fora do intervalo!");
        }

        else {
            if (N%2 != 0) {
                System.out.println("Weird");
            }

            else {
                if ((N%2 == 0) && (N >= 2) && (N <= 5)) {
                    System.out.println("Not Weird");
                }

                if ((N%2 == 0) && (N >= 6) && (N <= 20)) {
                    System.out.println("Weird");
                }

                if ((N%2 == 0) && (N > 20))  {
                    System.out.println("Not Weird");
                }
            }
        }
    }
}

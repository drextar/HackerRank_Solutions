/*
 * ******************************************************************************************
 * Copyright©
 *
 * Este software foi desenvolvido por Vinicius Chiarotti nos desafios na plataforma HackerRank.
 *
 * Criado em: 20/10/2022
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

package PrimalityTest;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger n = scan.nextBigInteger();
        scan.close();
        System.out.println(n.isProbablePrime(10) ? "prime" : "not prime");
    }
}

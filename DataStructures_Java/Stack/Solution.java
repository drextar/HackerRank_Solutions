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

package Stack;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayDeque;

class Solution {
    public static void main(String[] args) {
        HashMap<Character, Character> map = new HashMap();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String expression = scan.next();
            System.out.println(isBalanced(expression, map) ? "true" : "false" );
        }
        scan.close();
    }

    private static boolean isBalanced(String expression, HashMap<Character, Character> map) {
        if ((expression.length() % 2) != 0) {
            return false;
        }
        ArrayDeque<Character> deque = new ArrayDeque();
        for (int i = 0; i < expression.length(); i++) {
            Character ch = expression.charAt(i);
            if (map.containsKey(ch)) {
                deque.push(ch);
            } else if (deque.isEmpty() || ch != map.get(deque.pop())) {
                return false;
            }
        }
        return deque.isEmpty();
    }
}

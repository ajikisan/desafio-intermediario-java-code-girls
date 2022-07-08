package desafio.javacodegirls;

import java.util.Scanner;

/**
 * Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R).
 * A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.
 *
 * Dica: Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens (dentre elas o C++),
 * assumem que o resultado da divisão entre dois inteiros é outro inteiro.
 * Entrada
 * O arquivo de entrada contém um valor de ponto flutuante (dupla precisão), correspondente ao raio da esfera.
 *
 * Saída
 * A saída deverá ser uma mensagem "VOLUME" conforme o exemplo fornecido abaixo, com um espaço antes e um espaço
 * depois da igualdade. O valor deverá ser apresentado com 3 casas após o ponto.
 *
 *Entrada
 * O arquivo de entrada contém um valor de ponto flutuante (dupla precisão), correspondente ao raio da esfera.
 *
 * Saída
 * A saída deverá ser uma mensagem "VOLUME" conforme o exemplo fornecido abaixo, com um espaço antes e um espaço
 * depois da igualdade. O valor deverá ser apresentado com 3 casas após o ponto.
 *
 * Exemplos de Entrada:
 * 3
 * 15
 * 1523
 *
 * Exemplos de Saída:
 * VOLUME = 113.097
 * VOLUME = 14137.155
 * VOLUME = 14797486501.627
 *
 */


public class Main {

    public static void main(String[] args) {
        System.out.println("Por gentileza, digite um número:");
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double R = sc.nextDouble();
        double volume = (4/3.0) * pi * (Math.pow(R, 3.0));
        System.out.printf("VOLUME = %.3f%n", volume);
    }
}



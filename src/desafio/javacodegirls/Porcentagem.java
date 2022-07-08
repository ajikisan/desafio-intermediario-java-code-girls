package desafio.javacodegirls;

import java.util.Scanner;

/**
 * Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e
 * válidos.
 * Calcule e imprima o percentual que cada um representa em relação ao total de eleitores.
 *
 * Exemplo 1
 * Entrada
 * 1000
 * 100
 * 150
 * 750
 *
 * Saída
 * Brancos: 10%
 * Nulos: 15%
 * Validos: 75%
 *
 * Exemplo 2
 * Entrada
 * 5000
 * 1300
 * 500
 * 3200
 *
 * Saída
 * Brancos: 26%
 * Nulos: 10%
 * Válidos: 64%
 *
 */

public class Porcentagem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número de habitantes");
     int habitantes = input.nextInt();
        System.out.println("Digite a quantidade de votos em branco");
     int brancos = input.nextInt();
        System.out.println("Digite a quantidde de votos anulados");
     int nulos = input.nextInt();
        System.out.println("Digite a quantidade de votos válidos");
     int validos = input.nextInt();



        int pBrancos = (brancos * 100)/habitantes ;
        int pNulos = (nulos * 100)/habitantes;
        int pValidos = (validos * 100)/habitantes;


        System.out.println("Brancos: " + pBrancos  + "%");

        System.out.println("Nulos: " +  pNulos  + "%");

        System.out.println("Validos: " + pValidos  + "%");
    }

    }



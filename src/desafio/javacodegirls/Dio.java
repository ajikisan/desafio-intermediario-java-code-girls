package desafio.javacodegirls;

import java.util.Scanner;

/**
 * O gerente de uma loja de produtos eletrodomésticos ficou maluco e decidiu que todos o produtos da loja estavam
 * na promoção com 70% de desconto. Ele percebeu que precisa automatizar o seu sistema para que nessas promoções o
 * novo preço seja automaticamente calculado e repassado para os vendedores. Faça um algoritmo que leia o desconto
 * e o preço de um produto e e mostre o seu novo preço com esse desconto.
 *
 * Exemplos de Entrada
 * 2
 * 200
 * Exemplos de Saída
 * 196
 *
 * Exemplos de Entrada
 * 7
 * 800
 * Exemplos de Saída
 * 744
 *
 * Exemplos de Entrada
 * 70
 * 1000
 * Exemplos de Saída
 * 300
 *
 */

public class Dio {
    public static void main(String[] args) {
        System.out.println("Digite o valor do desconto: ");
        Scanner input = new Scanner(System.in);
        int desconto = input.nextInt();
        System.out.println("Digite o valor do produto: ");
        int precoAntigo = input.nextInt();


        int precoNovo = precoAntigo - (precoAntigo * desconto /100);
        System.out.println("Novo preço com o desconto: " + precoNovo);
    }
}

package br.com.tw_java.main;

import java.util.Scanner;

// Declaração de uma classe chamada Main
public class Main {
    // Método principal, ponto de entrada para a execução do programa
    public static void main(String[] args) {

        // Criação de um objeto Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);
/*
        //Imprime a mensagem "Digite seu nome"
        System.out.println("Digite seu nome");
        //Lê a linha de entrada do usuário e armazena na variável nome
        String nome = scanner.nextLine();
        //Imprime o nome inserido pelo usuário no console
        System.out.println(nome);
        //Fecha o objeto Scanner para liberar recursos associados à entrada do usuário
        scanner.close();


        // Entendendo a diferenca entre next () e nextLine() no scanner

        System.out.print("digite uma mensagem.");
        String mensagem = scanner.next();
        String mensagem = scanner.nextLine();
        System.out.println(mensagem);*/

        // Entendendo e configurando o compiler compliance, Interpolação

        System.out.println(" Digite o primeiro numero");
        int numero1 = scanner.nextInt();
        System.out.println("digite a operacao");
        char operacao = scanner.next().charAt(0);
        System.out.println("Digite o segundo numero");
        int numero2 = scanner.nextInt();
        // voce quer fazer a operacao 9+2 ?
        System.out.println(String.format("você quer fazer a operacao %d %c %d ", numero1, operacao, numero2));
        int resultado = 0;

        // Estrutura de tomada de decisao ( if e else )

        if (operacao == '+') {
            resultado = numero1 + numero2;
        } else if (operacao == '-') {
            resultado = numero1 - numero2;
        } else if (operacao == '*') {
            resultado = numero1 * numero2;
        } else if (operacao == '/') {
            resultado = numero1 / numero2;
        } else {
            System.out.println("operacao inválida");
        }
        // interpolação
        System.out.println(String.format("%d %c %d = %d", numero1, operacao, numero2, resultado));
        scanner.close();
    }
}
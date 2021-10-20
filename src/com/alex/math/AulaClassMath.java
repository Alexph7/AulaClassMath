package com.alex.math;

public class AulaClassMath {

        public static void main(String[] args) {

                double quantia; //quantia do deposito nos finais de ano
                double emprestimo = 1000; //valor inicial do emprestimo sem juros
                double taxa = 0.5; //taxa de juros

                System.out.printf("%s%20s %n", " Ano ", " Quantia Depositada "); //cabeçalho

                //Calcula a Quantidade de deposito a cada um dos dez Anos
                for (int ano = 1; ano < 10; ++ano) {

                        quantia = emprestimo * Math.pow(1.0 + taxa, ano); //Calcula a nova Quantidade durante o ano especificado

                        System.out.printf("%4d%,20.2f%n", ano, quantia); //Exibe o ano e a Quantidade

                }
        }

}

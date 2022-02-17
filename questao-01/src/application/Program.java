package application;

import entities.Escada;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Escada escada = new Escada();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de degraus :");
        escada.setN(entrada.nextInt());
        escada.gerarDegraus();
        System.out.println("ESCADA :");
        escada.imprimeEscada();
        entrada.close();
    }
}

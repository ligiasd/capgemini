package application;

import entities.Anagrama;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro nome:");
        String nome1 = leitor.next();
        System.out.println("Digite o segundo nome:");
        String nome2 = leitor.next();
        Anagrama anagrama1 = new Anagrama();
        Anagrama anagrama2 = new Anagrama();
        if (nome1.equals(nome2)) {
            System.out.println("Nomes iguais");
        } else {
            System.out.println("Nomes diferentes");
        }
    }
}

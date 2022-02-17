package application;

import entities.Senha;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua senha :");
        String novaSenha = entrada.next();
        Senha senha = new Senha(novaSenha);
        System.out.println("Quantidades de caracteres informados : " + novaSenha.length());
        System.out.println(senha);
        entrada.close();

    }
}

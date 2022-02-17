package entities;

import javax.swing.*;

public class Anagrama {

    String palavra;
    char vetor[];

    public Anagrama() {
    }

    public Anagrama(String palavra, char[] vetor) {
        this.palavra = palavra;
        this.vetor = vetor;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public char[] getVetor() {
        return vetor;
    }

    public void setVetor(char[] vetor) {
        this.vetor = vetor;
    }

//    Este metodo pede ao usuario para entrar com uma palavra
//	 @return palavra

    private static String Digite_a_palavra() {
        String palavra = "";
        while (palavra.length() <= 2) {
            palavra = JOptionPane.showInputDialog(null,
                    "Digite uma palavra de no minimo 3 caracteres",
                    "Calculando Anagrama", JOptionPane.INFORMATION_MESSAGE);
        }
        return palavra;
    }

    //    Este metodo mostra a palavra. A palavra é armazenada em um vetor para
    //     ficar mais facil o manuseio

    private static void Mostra(char[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");
    }

//    Este metodo recebe uma palavra e remove todos os espaços entre, durante e
//	 no final de qualquer palavra.

    private static String Retira_Espaco(String palavra) {
        String alterada = "", interna = (palavra).trim();
        char c;

        for (int i = 0; i < interna.length(); i++) {
            c = interna.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                alterada += c;
            }
        }

        return alterada;
    }


//      Este metodo recebe o vetor contendo a palavra e mostra para o usuario
//      todas as possibilidades de anagrama com esta palavra.

    private static void Calcula_Anagrama(char vetor[], int k) {
        int i;
        if (k == vetor.length - 1)
            Mostra(vetor);
        else {
            Calcula_Anagrama(vetor, k + 1);
            i = k + 1;
            while (i < vetor.length) {
                Troca_Posicao(vetor, k, i);
                Calcula_Anagrama(vetor, k + 1);
                Troca_Posicao(vetor, k, i);
                i = i + 1;
            }
        }
    }

//    Este metodo efetua a troca das posições desejadas

    private static void Troca_Posicao(char[] vetor, int k, int i) {
        char aux;
        aux = vetor[i];
        vetor[i] = vetor[k];
        vetor[k] = aux;
    }

//    Este metodo recebe a palavra e um vetor vazio e retorna o vetor contendo
//	 a palavra

    private static void Quebra_Palavra(String palavra, char vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = palavra.charAt(i);
        }
    }


}

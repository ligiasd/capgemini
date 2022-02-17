package entities;

import java.util.ArrayList;
import java.util.List;

public class Escada {
    private Integer n;

    private List<String> degraus = new ArrayList<>();

    public Escada() {
    }

    public Escada(Integer n) {
        this.n = n;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public void gerarDegraus() {
        degraus = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            degraus.add(" ".repeat(n - i) + "*".repeat(i + 1));
        }
    }

    public void imprimeEscada() {
        for (String d: degraus) {
            System.out.println(d);
        }
    }
}

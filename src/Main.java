import Models.SemanaEnum;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Exemplo classe enum Semana. Usando JOptionPane.
        String diaDaSemana = (String) JOptionPane.showInputDialog(
                null,
                "Selecione um dia da semana",
                "Dia da semana",
                JOptionPane.PLAIN_MESSAGE,
                null,
                SemanaEnum.values(),
                0
        ).toString();
        System.out.println("O dia da semana escolhido foi " + diaDaSemana.toLowerCase() + ".");

        //Usando switch case e scanner como entrada
        SemanaEnum[] semana = SemanaEnum.values();
        String diaSemana;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um dia da semana");
        diaSemana = sc.next();
        switch (diaSemana.toUpperCase()) {
            case "DOMINGO" -> System.out.println("O dia da semana escolhido foi domingo.");
            case "SEGUNDA" -> System.out.println("O dia da semana escolhido foi segunda.");
            case "TERÇA" -> System.out.println("O dia da semana escolhido foi terça.");
            case "QUARTA" -> System.out.println("O dia da semana escolhido foi quarta.");
            case "QUINTA" -> System.out.println("O dia da semana escolhido foi quinta.");
            case "SEXTA" -> System.out.println("O dia da semana escolhido foi sexta.");
            case "SÁBADO" -> System.out.println("O dia da semana escolhido foi sábado.");
            default -> System.out.println("Dia da semana inválido. Utilize a grafia correta!");
        }
    }
}
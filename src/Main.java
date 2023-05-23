import Models.SemanaEnum;

import javax.swing.*;

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



    }
}
package Automato;

import javax.swing.JOptionPane;

public class AFD {

    private static char palavra[];
    private static int cont;

    public static void iniciar(String linha) {
        palavra = linha.toCharArray();
        cont = 0;
        q0();

    }

    private static void q0() {
        if (cont < palavra.length) {
            if (palavra[cont] == 'i') {
                cont++;
                q1();
            } else if (palavra[cont] == 'z') {
                qf();
            } else {
                qerro();
            }
        } else {
            qerro();
        }
    }

    private static void q1() {

        if (cont < palavra.length) {
            if (palavra[cont] == 'g') {
                cont++;
                q2();
            } else {
                qerro();
            }
        } else {
            qerro();
        }

    }

    private static void q2() {

        if (cont < palavra.length) {
            if (palavra[cont] == 'o') {
                cont++;
                q3();
            } else {
                qerro();
            }
        } else {
            qerro();
        }

    }

    private static void q3() {

        if (cont < palavra.length) {
            if (palavra[cont] == 'r') {
                cont++;
                q0();
            } else {
                qerro();
            }
        } else {
            qerro();
        }

    }

    private static void qf() {
        String aux = "";
        for (int i = 0; i < palavra.length; i++) {
            aux += palavra[i];
        }
        JOptionPane.showMessageDialog(null, "Palavra aceita:    " + aux);

    }

    private static void qerro() {

        String aux = "";
        for (int i = 0; i < palavra.length; i++) {
            aux += palavra[i];
        }
        JOptionPane.showMessageDialog(null, "Palavra NAO aceita:    " + aux);
    }

}

package Principal;

import Automato.AFD;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {

        // passar a localização do txt
        BufferedReader lerArquivo = new BufferedReader(new FileReader("C:\\Users\\igor_\\OneDrive\\Documentos\\NetBeansProjects\\AutomatoFinitoDeterministico\\src\\Util\\AFD.txt"));
        AFD.iniciar(lerArquivo.readLine().trim());
    }
    
}

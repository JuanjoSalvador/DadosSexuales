package dadossexuales;
import java.io.*;

public class dadosSexuales {
    String[] negro = {"Comer", "Lamer", "Tocar", "Besar", "Acariciar", "Succionar"};
    String[] blanco = {"Pecho", "Boca", "Culo", "Zona G", "Cuello", "Orejas"};
    
    public String dadoNegro() {
        int tiradaNegro = (int)(Math.random() * 6);
        return negro[tiradaNegro];
    }
    public String dadoBlanco() {
        int tiradaBlanco = (int)(Math.random() * 6);
        return blanco[tiradaBlanco];
    }
    public void prueba() {
        System.out.println(dadoNegro() + " " + dadoBlanco());
        System.out.println(" ");
        System.out.print("¿Repetimos? Pulsa <Intro> para continuar.");
        System.out.println(" ");
    }
}

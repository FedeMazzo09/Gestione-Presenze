import java.util.*;

public class Test {
    public static void main(String[] args) {
        GestionePresenze registro = new GestionePresenze();

        registro.aggiungiStudente("Dadi", 7);
        registro.aggiungiStudente("Deyae", 11);
        registro.aggiungiStudente("Federico", 15);
        registro.aggiungiStudente("Ilario", 8);

        registro.stampaRegistro();

        registro.registraPresenza("Deyae");

        registro.stampaRegistro();

        System.out.println("Lo studente ha: " + registro.visualizzaPresenze("Dadi"));
    }
}

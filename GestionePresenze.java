import java.util.*;

public class GestionePresenze {
    private HashMap <String, Integer> registro;

    public GestionePresenze() {
        registro = new HashMap<>();
    }

    public void aggiungiStudente(String nome, int presenze) {
        registro.put(nome, presenze);
    }

    public void registraPresenza(String nome) {
        registro.put(nome, registro.get(nome) + 1);
    }

    public void stampaRegistro(){
        for (String key : registro.keySet()) {
            System.out.println("Nome: " + key + " | Assenze: " + registro.get(key));
        }
    }

    public int visualizzaPresenze(String nome) {
        return registro.get(nome);
    }

    public String visualizzaStudenteMax() {
        String studenteMax = null;
        int maxPresenze = -1;

        for (Map.Entry<String, Integer> entry : registro.entrySet()) {
            String nome = entry.getKey();
            int presenze = entry.getValue();

            if (presenze > maxPresenze) {
                maxPresenze = presenze;
                studenteMax = nome;
            }
        }

        return studenteMax;
    }
}
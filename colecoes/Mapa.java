package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto");
        usuarios.put(2, "Rafaela");
        usuarios.put(3, "Kaue");
        usuarios.put(4, "Rebeca");
        
        usuarios.size();

        // Get chave
        usuarios.keySet();

        // Get valor
        usuarios.values();

        // Get chave e valor
        usuarios.entrySet();

        // Contains
        usuarios.containsKey(3);
        usuarios.containsValue("Rebeca");
        
        // Get elemento
        usuarios.get(4);

        // Percorrendo chaves
        for (int chave: usuarios.keySet()) {
            System.out.println(chave);
        };
        
        // Percorrer valor
        for (String valor: usuarios.values()) {
            System.out.println(valor);
        };

        // Percorrer chave valor
        for (Map.Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.print(registro.getKey() + " ==> ");
            System.out.println(registro.getValue());
        };

    }

}

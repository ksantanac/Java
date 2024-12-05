package Fundamentos;

public class ConversaoTiposPrimitivosNumerico {
    public static void main(String[] args) {

        double a = 1; // Implícita
        System.out.println(a);

        float b = (float) 1.12345; // Conversão para float explicíta (CAST)
        System.out.println(b);

        int c = 130;
        byte d = (byte) c; // explicíta (CAST)
        System.out.println(d);

    }
}

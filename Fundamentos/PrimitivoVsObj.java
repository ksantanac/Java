package Fundamentos;

public class PrimitivoVsObj {
    public static void main(String[] args) {
        String s = "Texto";
        s.toUpperCase();
        System.out.println(s);

        // Wrappers são objetos dos tipos primitivos
        int a = 123;
        System.out.println(a);

    }
}

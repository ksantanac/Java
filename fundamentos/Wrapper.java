package fundamentos;

public class Wrapper {
    public static void main(String[] args) {

        // Scanner entrada = new Scanner(System.in);

        // Byte
        Byte b = 100;
        Short s = 1000;

        // Integer.parseInt(entrada.next());
        Integer i = 10000;
        Long l = 1000000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Float f = 123.0F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#'; // Char
        System.out.println(c + "...");



        // entrada.close();
    }
}

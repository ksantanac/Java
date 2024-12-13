package controle;

public class SwitchSemBreak {
    public static void main(String[] args) {

        String faixa = "preta";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei 10");
            case "marrom":
                System.out.println("Sei 09");
            case "roxa":
                System.out.println("Sei 08");
        }
    }
}

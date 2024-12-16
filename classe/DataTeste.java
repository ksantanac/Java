package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 20;
        d1.mes = 8;
        d1.ano = 2024;
        
        var d2 = new Data();
        d2.dia = 13;
        d2.mes = 6;
        d2.ano = 2003;
        
        System.out.println("Você nasceu em: " + d2.dia + "/" + d2.mes + "/" + d2.ano);
        System.out.println(d1.obterDataFormatada());
        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();

        // Desafio Construtor

        // desafio 1
        Data d3 = new Data();
        System.out.println("Você nasceu em: " + d3.dia + "/" + d3.mes + "/" + d3.ano);

        // desafio 2
        Data d4 = new Data();
        // Objetos
        d4.dia = 27;
        d4.mes = 2;
        d4.ano = 1983;
        System.out.println("Você nasceu em: " + d4.dia + "/" + d4.mes + "/" + d4.ano);

    }
}

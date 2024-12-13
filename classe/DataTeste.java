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
    }
}

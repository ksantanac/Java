package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    // Construtor vazio
    Data () {
        dia = 1;
        mes = 1;
        ano = 1970;
    };

    // Construtor com parametros
    Data(int diaInicial, int mesInicial, int anoInicial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    };

    // Metodo
    String obterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
//        return dia + "/" + mes + "/" + ano;
    };

    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }
}

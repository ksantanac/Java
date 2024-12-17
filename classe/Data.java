package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    // Construtor vazio
    Data () {
        //dia = 1;
        //mes = 1;
        //ano = 1970;
        this(1, 1,1970);



    };

    // Construtor com parametros
    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    };

    // Metodo
    String obterDataFormatada(){
        String formato = "%d/%d/%d";
        return String.format(formato, this.dia, this.mes, this.ano);
    };

    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }

}

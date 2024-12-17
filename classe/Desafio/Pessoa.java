package classe.Desafio;

public class Pessoa {

    String nomePessoa;
    double pesoPessoa;

    Pessoa(String nomePessoa, double pesoPessoa){
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
    }

    void comer(Comida comida) {
        if (comida != null) {
            this.pesoPessoa += comida.pesoComida;
        };
    }

    String apresentar() {
        return "Meu nome é " + this.nomePessoa + " e tenho " + this.pesoPessoa + "Kgs.";
    }

}

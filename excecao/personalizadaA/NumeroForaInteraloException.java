package excecao.personalizadaA;

//@SuppressWarnings("serial")
public class NumeroForaInteraloException extends RuntimeException{

    private String nomeDoAtributo;

    public NumeroForaInteraloException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está fora do intervalo.", nomeDoAtributo);
    }

}

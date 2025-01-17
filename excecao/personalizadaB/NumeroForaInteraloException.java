package excecao.personalizadaB;

//@SuppressWarnings("serial")
public class NumeroForaInteraloException extends Exception{

    private String nomeDoAtributo;

    public NumeroForaInteraloException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está fora do intervalo.", nomeDoAtributo);
    }

}

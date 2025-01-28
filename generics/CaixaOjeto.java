package generics;

public class CaixaOjeto {

    private Object coisa;

    public void aguardar(Object coisa) {
        this.coisa = coisa;
    }

    public Object abrir(){
        return coisa;
    }

}

package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void testeAcessos(){

        // System.out.println(esposa.segredo);
        // System.out.println(mae.facoDentroDeCasa);

        // acessados diretamente por conta da herança
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);
    }
}

package oo.encapsulamento;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;

    public Pessoa(String nome, String sobrenome, int idade){
        setIdade(idade);
        setNome(nome);
        setSobrenome(sobrenome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto(){
        return getNome() + " " + getSobrenome();
    }

    // Getter -> metodo para ler o valor
    public int getIdade(){
        return  idade;
    }

    // Setter -> Metodo para alterar valor
    public void setIdade(int novaIdade){
        novaIdade = Math.abs(novaIdade);

        if (novaIdade >= 0 && novaIdade <= 130) {
            this.idade = novaIdade;
        }

    }

    @Override
    public String toString() {
        return "Olá, eu sou o " + getNome() + " e tenho " + getIdade() + " anos.";
    }
}

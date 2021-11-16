package Aula11.Mesa;

public class Preguica extends Animal{
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    public String subirEmArvore(){
        return "Subi na arvore";
    }

    @Override
    public String emitirSom() {
        return "Bocejar";


    }
}

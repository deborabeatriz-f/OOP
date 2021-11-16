package Aula11.Mesa;

public class Cavalo extends Animal {
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    public String correr(){
        return "Correndo no campo";

    }

    @Override
    public String emitirSom() {
        return "Relinchar";

    }
}

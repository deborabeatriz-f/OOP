package Aula11.Mesa;

public class Cachorro  extends Animal{
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    public String correr(){
        return "Correndo no parque";

    }

    @Override
    public String emitirSom() {
        return "Latir";

    }
}

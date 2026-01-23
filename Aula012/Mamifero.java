package Aula012;

public class Mamifero extends Animal {
    private String corPelo;

        public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public float getPeso() {
        return peso;
    }

    public String getCorPelo() {
        return corPelo;
    }
    
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }
}

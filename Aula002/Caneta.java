package Aula002;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampa;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga); 
        System.out.println("Está tampada? " + this.tampa);
    }
    public void rabiscar(){
        if (this.tampa == true){
            System.out.println("ERRO! Não posso rabiscar.");
        } else {
            System.out.println("Estou Rabiscando.");
        }
    }
    public void tampar(){
        this.tampa = true; //this é o nome do objeto que o chamou para aparecer, nesse caso vai ser c1 na tela main
    }
    public void destampar(){
        this.tampa = false;
    }
}

//atributos publicos e privados ao serem instanciados apareceram na resposta, ao contrário dos atributos privados.

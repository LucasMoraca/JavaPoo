package Aula001;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampa;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga); 
        System.out.println("Está tampada? " + this.tampa);
    }
    void rabiscar(){
        if (this.tampa == true){
            System.out.println("ERRO! Não posso rabiscar.");
        } else {
            System.out.println("Estou Rabiscando.");
        }
    }
    void tampar(){
        this.tampa = true; //this é o nome do objeto que o chamou para aparecer, nesse caso vai ser c1 na tela main
    }
    void destampar(){
        this.tampa = false;
    }
}

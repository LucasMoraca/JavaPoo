package Aula013;

public class Aula13 {
    public static void main(String[] args) {
        
        Cachorro c = new Cachorro();

        c.emitirSom();

        c.reagir("Olá");
        c.reagir("Vai apanhar");
        c.reagir(10, 30);
        c.reagir(19, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(7, 35.0f);
    }
  
}

package Aula012;

public class Aula12 {
    public static void main(String[] args) {
    
        Cachorro c = new Cachorro();
        Canguru cg = new Canguru();
        Cobra cb = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish gf = new GoldFish();
        Arara ar = new Arara();

        cg.locomover();
        c.emitirSom();
        cb.locomover();
        t.locomover();
        gf.locomover();
        ar.locomover();
    
    }

}
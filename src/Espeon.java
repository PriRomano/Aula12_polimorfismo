public class Espeon extends Eevee {
    
    //Construtor dos atributos
    public Espeon (String tipo, double altura, int HP, double peso) {
        super (tipo, altura, HP, peso);
    }

    //metodos de ataque
    @Override
    public String ataque () {
        return "Dream Eater";
    }
    @Override
    public String defesa () {
        return "Synchronize";
    }
    @Override
    public String especial () {
        return "Magic Bounce";
    }
}

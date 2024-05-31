public class Vaporeon extends Eevee {
    
    //Construtor dos atributos
    public Vaporeon (String tipo, double altura, int HP, double peso) {
        super (tipo, altura, HP, peso);
    }
    
    //meodos de ataque
    @Override
    public String ataque () {
        return "Aurora Beam";
    }
    @Override
    public String defesa () {
        return "Hydratation";
    }
    @Override
    public String especial () {
        return "Blizzard";
    }
}

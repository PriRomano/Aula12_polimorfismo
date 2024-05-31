public class Flareon extends Eevee {
    
    //Construtor dos atributos
    public Flareon (String tipo, double altura, int HP, double peso) {
        super (tipo, altura, HP, peso);
    }

    //metodos de ataque
    @Override
    public String ataque () {
        return "Incinerate";
    }
    @Override
    public String defesa () {
        return "Flash Fire";
    }
    @Override
    public String especial () {
        return "Gust";
    }
}

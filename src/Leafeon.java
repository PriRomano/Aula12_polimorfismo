public class Leafeon extends Eevee {
    
    //Construtor dos atributos
    public Leafeon (String tipo, double altura, int HP, double peso) {
        super (tipo, altura, HP, peso);
    }
    
    //metodos de ataque
    @Override
    public String ataque () {
        return "Leaf Blade";
    }
    @Override
    public String defesa () {
        return "Leaf Guard";
    }
    @Override
    public String especial () {
        return "Chlorophyl";
    }
}

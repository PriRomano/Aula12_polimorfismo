public class Sylveon extends Eevee {
    
    //Construtor dos atributos
    public Sylveon (String tipo, double altura, int HP, double peso) {
        super (tipo, altura, HP, peso);
    }
    
    //metodos de ataque
    @Override
    public String ataque () {
        return "Dazzling Gleam";
    }
    @Override
    public String defesa () {
        return "Cute Charm";
    }
    @Override
    public String especial () {
        return "Pixilate";
    }
}

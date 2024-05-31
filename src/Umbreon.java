public class Umbreon extends Eevee {
    
    //Construtor dos atributos
    public Umbreon (String tipo, double altura, int HP, double peso) {
        super (tipo, altura, HP, peso);
    }
    
    //metodos de ataque
    @Override
    public String ataque () {
        return "Dark Pulse";
    }
    @Override
    public String defesa () {
        return "Synchronize";
    }
    @Override
    public String especial () {
        return "Inner Focus";
    }
}

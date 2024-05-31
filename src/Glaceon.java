public class Glaceon extends Eevee {
    
    //Construtor dos atibutos
    public Glaceon (String tipo, double altura, int HP, double peso) {
        super (tipo, altura, HP, peso);
    }

    //metodos de ataque
    @Override
    public String ataque () {
        return "Water Pulse";
    }
    @Override
    public String defesa () {
        return "Ice Body";
    }
    @Override
    public String especial () {
        return "Snow Cloak";
    }
}

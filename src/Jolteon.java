public class Jolteon extends Eevee {
    
    // Construtor dos atributos
    public Jolteon (String tipo, double altura, int HP, double peso) {
        super (tipo, altura, HP, peso);
    }

    //metodos de ataque
    @Override
    public String ataque () {
        return "Trovoada - thunder-Shock";
    }
    @Override
    public String defesa () {
        return "Carga - Wild Charge";
    }
    @Override
    public String especial () {
        return "Raio - Thunder";
    }
}

public class Jolteon extends Eevee {
    
    // Constantes para valores fixos do Jolteon
    private static final String TIPO_J = "Eletrico";
    private static final double ALTURA_J = 0.81; //metros
    private static final int HP_J = 97;
    private static final double PESO_J = 32.52; //kg


    // Construtor padrao
    public Jolteon () {
        super (TIPO_J, ALTURA_J, HP_J, PESO_J);
    }

    // Construtor dos atributos p digitar
    public Jolteon (String tipo, double altura, int HP, double peso) {
        super (tipo, altura, HP, peso);
    }

    
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

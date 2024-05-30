public class Eevee {
    
    // atributos
    private String tipo; // normal
    private double altura; //29cm
    private int HP; //57
    private double peso; //6,44kg

    //tipos de ataques
    public String ataque () {
        return "Ataque rápido";
    }
    public String defesa () {
        return "Desvio";
    }
    public String especial () {
        return "Tri-ataque";
    }
    // eu tenho q fazer o construtor do outros? tenho que usar o super q nem no empregado??
    // Construtor
    public Eevee (String tipo, double altura, int HP, double peso) {
        this.tipo = tipo;
        this.altura = altura;
        this.HP = HP;
        this.peso = peso;
    }

    // getters e setters
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int getHP() {
        return HP;
    }
    public void setHP(int hP) {
        this.HP = hP;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    // eu tenho que fazer isso?
    // get dos ataques
    //public String getAtaque () {
    //    return ataque();
    //}

}
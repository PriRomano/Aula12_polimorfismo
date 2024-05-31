public class Eevee {
    
    // atributos
    private String tipo;    
    private double altura;  
    private int HP;         
    private double peso;

    // Construtor dos atributos
    public Eevee (String tipo, double altura, int HP, double peso) {
        this.tipo = tipo;
        this.altura = altura;
        this.HP = HP;
        this.peso = peso;
    }

    //metodos de ataques
    public String ataque () {
        return "Ataque rápido";
    }
    public String defesa () {
        return "Desvio";
    }
    public String especial () {
        return "Tri-ataque";
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
}
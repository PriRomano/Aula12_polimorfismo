public class Eevee {
    

    // atributos
    private String tipo; // normal
    private int altura, HP; //29cm, 57
    private double peso; //6,44kg


    //metodos
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
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getHP() {
        return HP;
    }
    public void setHP(int hP) {
        HP = hP;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
}
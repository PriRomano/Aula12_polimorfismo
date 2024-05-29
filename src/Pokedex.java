public class Pokedex {
    public static void main(String[] args) throws Exception {
        Eevee e = new Eevee ();
        Jolteon j = new Jolteon ();

        //Implementar as outras classes - falta ver os nomes dos ataques
        // implementar getters e setters
        // implementar o construtor, com os valores das variáveis
        // implementar o método imprimir, exibir os valores das variáveis e os métodos
        // exibir o resultado na classe Pokedex
        
        // mandar link do github na atividade


        // Print da Eeve
        System.out.println ("Eu sou: Eevee");
        System.out.println("Ataque: " + e.ataque());
        System.out.println("Defesa: " + e.defesa());
        System.out.println("Especial: " + e.especial());

        // Pula linha
        System.out.println(" ");

        // Print do Jolteon 
        System.out.println("Eu sou: Jolteon");
        System.out.println("Ataque: " + j.ataque());
        System.out.println("Defesa: " + j.defesa());
        System.out.println("Especial: " + j.especial());

        //e=j; -    P deixar os valores da Eeve = os do jolteon
        //System.out.println ("Eu sou: Eevee");
        //System.out.println("Ataque: " + e.ataque());
        //System.out.println("Defesa: " + e.defesa());
        //System.out.println("Especial: " + e.especial());


    }
}

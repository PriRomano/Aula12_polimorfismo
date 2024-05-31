public class Pokedex {
    public static void main(String[] args) throws Exception {
        /*declaração das variáveis (e, j, es, f, g, l, s, u, v) de cada objeto (Eevee, Jolteon...). 
        Criando novos objetos (new) e chamando o construtor Eevee("Normal"...)*/
        Eevee e = new Eevee ("Normal", 0.29, 57, 6.44);
        Jolteon j = new Jolteon ("Elétrico", 0.81, 97, 32.52);
        Espeon es = new Espeon ("Psiquico", 0.68, 56, 17.75);
        Flareon f = new Flareon ("Fogo", 0.95, 69, 26.35);
        Glaceon g = new Glaceon ("Gelo", 0.63, 85, 15.50);
        Leafeon l = new Leafeon ("Planta", 1.03, 92, 22.39);
        Sylveon s = new Sylveon ("Fada", 0.87, 63, 20.04);
        Umbreon u = new Umbreon ("Sombrio", 1.00, 169, 27);
        Vaporeon v = new Vaporeon ("Agua", 1.03, 143, 32.11);
    

        //Print da Eeve
        System.out.println("Eu sou: Eevee");
        imprimirE(e);

        System.out.println(" ");

        //Print do Jolteon
        System.out.println("Eu sou: Jolteon");
        imprimirJ(j);
        
        System.out.println(" ");
        
        //Print do Espeon
        System.out.println("Eu sou: Espeon");
        imprimirEs(es);

        System.out.println(" ");

        //Print do Flareon
        System.out.println("Eu sou: Espeon");
        imprimirF(f);

        System.out.println(" ");

        //Print do Glaceon
        System.out.println("Eu sou: Glaceon");
        imprimirG(g);

        System.out.println(" ");

        //Print do Leafeon
        System.out.println("Eu sou: Leafeon");
        imprimirL(l);

        System.out.println(" ");

        //Print do Sylveon
        System.out.println("Eu sou: Sylveon");
        imprimirS(s);

        System.out.println(" ");

        //Print do Umbreon
        System.out.println("Eu sou: Umbreon");
        imprimirU(u);

        System.out.println(" ");

        //Print do Vaporeon
        System.out.println("Eu sou: Vaporeon");
        imprimirV(v);

        }

        //metodo imprimir Eevee
        public static void imprimirE(Eevee e) {
            System.out.println("Tipo: " + e.getTipo());
            System.out.println("Altura: " + e.getAltura() + "m");
            System.out.println("HP: " + e.getHP());
            System.out.println("Peso: " + e.getPeso() + "kg");
            System.out.println("Ataque: " + e.ataque());
            System.out.println("Defesa: " + e.defesa());
            System.out.println("Especial: " + e.especial());
        }

        //metodo imprimir Jolteon
        public static void imprimirJ(Jolteon j) {
            System.out.println("Tipo: " + j.getTipo());
            System.out.println("Altura: " + j.getAltura() + "m");
            System.out.println("HP: " + j.getHP());
            System.out.println("Peso: " + j.getPeso() + "kg");
            System.out.println("Ataque: " + j.ataque());
            System.out.println("Defesa: " + j.defesa());
            System.out.println("Especial: " + j.especial());
        }
        
        //metodo imprimir Espeon
        public static void imprimirEs(Espeon es) {
            System.out.println("Tipo: " + es.getTipo());
            System.out.println("Altura: " + es.getAltura() + "m");
            System.out.println("HP: " + es.getHP());
            System.out.println("Peso: " + es.getPeso() + "kg"); 
            System.out.println("Ataque: " + es.ataque());
            System.out.println("Defesa: " + es.defesa());
            System.out.println("Especial: " + es.especial());
        }

        //metodo imprimir Flareon
        public static void imprimirF(Flareon f) {
            System.out.println("Tipo: " + f.getTipo());
            System.out.println("Altura: " + f.getAltura() + "m");
            System.out.println("HP: " + f.getHP());
            System.out.println("Peso: " + f.getPeso() + "kg");
            System.out.println("Ataque: " + f.ataque());
            System.out.println("Defesa: " + f.defesa());
            System.out.println("Especial: " + f.especial());
        }
        
        //metodo imprimir Glaceon 
        public static void imprimirG(Glaceon g) {
            System.out.println("Tipo: " + g.getTipo());
            System.out.println("Altura: " + g.getAltura() + "m");
            System.out.println("HP: " + g.getHP());
            System.out.println("Peso: " + g.getPeso() + "kg");
            System.out.println("Ataque: " + g.ataque());
            System.out.println("Defesa: " + g.defesa());
            System.out.println("Especial: " + g.especial());
        }
        
        //metodo imprimir Leafeon 
        public static void imprimirL (Leafeon l) {
            System.out.println("Tipo: " + l.getTipo());
            System.out.println("Altura: " + l.getAltura() + "m");
            System.out.println("HP: " + l.getHP());
            System.out.println("Peso: " + l.getPeso() + "kg");
            System.out.println("Ataque: " + l.ataque());
            System.out.println("Defesa: " + l.defesa());
            System.out.println("Especial: " + l.especial());
        }
        
        //metodo imprimir Sylveon
        public static void imprimirS(Sylveon s) { 
            System.out.println("Tipo: " + s.getTipo());
            System.out.println("Altura: " + s.getAltura() + "m");
            System.out.println("HP: " + s.getHP());
            System.out.println("Peso: " + s.getPeso() + "kg");
            System.out.println("Ataque: " + s.ataque());
            System.out.println("Defesa: " + s.defesa());
            System.out.println("Especial: " + s.especial());
        }
        
        //metodo imprimir Umbreon
        public static void imprimirU (Umbreon u) {
            System.out.println("Tipo: " + u.getTipo());
            System.out.println("Altura: " + u.getAltura() + "m");
            System.out.println("HP: " + u.getHP());
            System.out.println("Peso: " + u.getPeso() + "kg");
            System.out.println("Ataque: " + u.ataque());
            System.out.println("Defesa: " + u.defesa());
            System.out.println("Especial: " + u.especial());
        }
        
        //metodo imprimir Vaporeon 
        public static void imprimirV (Vaporeon v) {
            System.out.println("Tipo: " + v.getTipo());
            System.out.println("Altura: " + v.getAltura() + "m");
            System.out.println("HP: " + v.getHP());
            System.out.println("Peso: " + v.getPeso() + "kg");
            System.out.println("Ataque: " + v.ataque());
            System.out.println("Defesa: " + v.defesa());
            System.out.println("Especial: " + v.especial());
        }


        //P deixar os valores da Eevee = Jolteon
        //e=j;
        //System.out.println ("Eu sou: Eevee");
        //System.out.println("Ataque: " + e.ataque());
        //System.out.println("Defesa: " + e.defesa());
        //System.out.println("Especial: " + e.especial());
    }

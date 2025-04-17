public class exemplo {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Laura";
        pessoa1.idade = 21;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Jones";
        pessoa2.idade = 25;

        /*pessoa1.status();
        pessoa2.status();*/

        pessoa1.falar();
        pessoa1.falar();
        pessoa1.parar_falar();

        pessoa1.comer();
        pessoa1.comer();
        pessoa1.falar();
        pessoa1.parar_comer();

        pessoa1.falar();
        pessoa1.comer();
    }
}

class Pessoa{
    String nome;
    int idade;
    boolean falando = false;
    boolean comendo = false;

    // Métodos 
    public void status(){
        System.out.println("Nome: " + this.nome + ".");
        System.out.println("Idade: " + this.idade + ".");
        System.out.println("Falando: " + this.falando + ".");
        System.out.println("Comendo: " + this.comendo + ".");
    }

    public void falar(){
        if(this.falando == true){
            System.out.println(this.nome + " ja estava falando.");
        }
        else if(this.comendo == true){
            System.out.println(this.nome + " nao pode falar comendo.");
        }
        else{
            this.falando = true;
            System.out.println(this.nome + " comecou a falar.");
        }
    }

    public void comer(){
        if(this.comendo == true){
            System.out.println(this.nome + " ja estava comendo.");
        }
        else if(this.falando == true){
            System.out.println(this.nome + " nao pode comer falando.");
        }
        else{
            this.comendo = true;
            System.out.println(this.nome + " comecou a comer.");
        }
    }

    public void parar_comer(){
        if(this.comendo == false){
            System.out.println(this.nome + " nao estava comendo, entao nao pode parar de comer."); 
        }
        else{
            this.comendo = false;
            System.out.println(this.nome + " parou de comer.");
        }
    }

    public void parar_falar(){
        if(this.falando == false){
            System.out.println(this.nome + " nao estava falando, entao nao pode parar de falar."); 
        }
        else{
            this.falando = false;
            System.out.println(this.nome + " parou de falar.");
        }
    }
}
public class Bevanda {
    //attributi
    private String nome;
    private double prezzo;

    //costruttori
    public Bevanda (String nome, double prezzo) {
        this.nome=nome;
        this.prezzo=prezzo;
    }

    //metodi
    public void setNome (String nome) {
        this.nome=nome;
    }
     public void setPrezzo (double prezzo) {
        this.prezzo=prezzo;
     }

     public String getNome (){
        return this.nome;
     }

     public double getPrezzo() {
        return this.prezzo;
     }
}

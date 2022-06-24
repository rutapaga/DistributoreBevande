/*Distributore di Bevande 🛵

  Scrivere un programma in grado di modellare la gestione di un distributore di bevande.
  Il distributore gestirà una lista di 2 tipi diversi di prodotti: Caffè e Cappuccino.
  Progettare la classe DistributoreDiBevande costruito con un intero n
  che determina il numero di prodotti nel distributore
  Ogni tipo di prodotto può avere un codice univoco
  e un prezzo uguali nel tempo (ossia per uno stesso tipo di prodotto).


  La classe prevede i seguenti metodi:

        caricaProdotto: dato un Prodotto p in input, lo carica nel distributore
        inserisciImporto: permette di inserire un importo nella macchinetta
        scegliProdotto: dato in ingresso un codice di prodotto, restituisca il prodotto associato a quel codice
        (se l’importo inserito lo consente) e decrementi il saldo disponibile nel distributore
        saldoAttuale: restituisce il saldo attuale del distributore
        getResto: restituisce il resto dovuto e azzeri il saldo */

public class DistributoreDiBevande {
    //attributi
    private int numeroProdotti;
    private int ncaffè=0;

    private Caffè caffè;
    private int ncappuccini=0;

    private Cappuccino cappuccino;

    private int nprodottiNelDistributore=0;
    private double saldo = 0;


    //costruttori
    public DistributoreDiBevande ( int numeroProdotti,Caffè caffè, Cappuccino cappuccino) {
        this.numeroProdotti=numeroProdotti;
        this.caffè=caffè;
        this.cappuccino=cappuccino;
    }

    //metodi
    public boolean caricaProdotto (Bevanda prodotto) {
        if (this.nprodottiNelDistributore < this.numeroProdotti) {
            if (prodotto.getNome() == this.caffè.getNome()) {
                this.ncaffè++;
                this.nprodottiNelDistributore++;
                return true;
            } else if (prodotto.getNome() == cappuccino.getNome()) {
                this.ncappuccini++;
                this.nprodottiNelDistributore++;
                return true;
            }
            return false;
        }
        return false;
    }



        public void inserisciImporto (double importo) {
        this.saldo+=importo;
    }


    public boolean scegliProdotto ( String bevanda) {
        if (bevanda==this.caffè.getNome() && this.ncaffè > 0 && this.saldo >= this.caffè.getPrezzo()) {
            this.ncaffè--;
            this.nprodottiNelDistributore--;
            this.saldo-=this.caffè.getPrezzo();
            return true;
        }
        else if (bevanda == this.cappuccino.getNome() && this.ncappuccini > 0 && this.saldo >= this.cappuccino.getPrezzo()) {
            this.ncappuccini--;
            this.nprodottiNelDistributore--;
            this.saldo-=this.cappuccino.getPrezzo();
            return true;
        }
        return false;
    }

    public double saldoAttuale () {
        return this.saldo;
    }

    public double getResto () {
        double resto= this.saldo;
        this.saldo=0;
        return resto;

    }
}


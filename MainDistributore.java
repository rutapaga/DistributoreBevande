public class MainDistributore {
    public static void main(String[] args) {
        Caffè caffe = new Caffè("caffe", 0.5);
        Cappuccino cappuccino = new Cappuccino("cappuccino", 1);
        DistributoreDiBevande distributoreDiBevande = new DistributoreDiBevande(10, caffe, cappuccino);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(cappuccino);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(cappuccino);
        distributoreDiBevande.caricaProdotto(caffe);
        System.out.println(distributoreDiBevande.saldoAttuale() == 0);
        System.out.println(distributoreDiBevande.getResto() == 0);
        distributoreDiBevande.inserisciImporto(0.4);
        System.out.println(distributoreDiBevande.scegliProdotto("caffe") == false);
        distributoreDiBevande.inserisciImporto(0.2);
        System.out.println(distributoreDiBevande.scegliProdotto("caffe") != false);
        System.out.println(distributoreDiBevande.getResto()-0.10 < 1E-6);
        System.out.println(distributoreDiBevande.saldoAttuale() == 0);
        System.out.println(distributoreDiBevande.scegliProdotto("caffe") == false);
        distributoreDiBevande.inserisciImporto(2.0);
        System.out.println(distributoreDiBevande.scegliProdotto("caffe") != false);
        System.out.println(distributoreDiBevande.scegliProdotto("cappuccino") != false);
        System.out.println(distributoreDiBevande.scegliProdotto("caffe") != false);
        System.out.println(distributoreDiBevande.saldoAttuale() == 0);
        System.out.println(distributoreDiBevande.getResto()-0.10 < 1E-6);
    }
}

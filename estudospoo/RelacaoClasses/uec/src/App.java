public class App {
    public static void main(String[] args) throws Exception {
       Lutador l[] = new Lutador[6]; //serão 6 lutadores e estou declarando isso usando array list/vetores
       
      l[0] = new Lutador("pretty boy", "frança", 31, 1.75f, 68.9f, 11, 2, 1);
       l[0].status();

       l[1] = new Lutador ("putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);

       l[2] = new Lutador("snapshadow", "cuba", 35, 1.65f, 80.9f, 12, 2, 1);

       l[3] = new Lutador ("Rafaele", "Venezuela", 20, 1.70f, 81.6f, 12, 0, 2);

       l[4]=new Lutador("Junior", "Brasil", 37, 1.72f, 119.3f, 5, 4,3);

       l[5]=new Lutador ("Neslow" ,"Nova Zelandia", 30, 1.81f, 105.7f, 12, 2, 4);

       Luta uec03= new Luta();
       uec03.marcarLuta(l[1], l[1]);
       uec03.lutar();


    }
    
}

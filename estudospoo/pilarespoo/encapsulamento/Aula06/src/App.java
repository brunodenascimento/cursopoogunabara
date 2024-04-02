public class App {
    public static void main(String[] args) throws Exception {
      ControleRemoto c = new ControleRemoto();
      //são usados apenas os métodos da interface
        c.ligar();
        c.play();
        c.abrirMenu();
    }
}

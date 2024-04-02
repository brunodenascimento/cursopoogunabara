public class App {
    public static void main(String[] args) throws Exception {
    Caneta c1 = new Caneta();
    c1.cor="Azul";
    c1.ponta=0.5f;
    c1.tampada=false;
    c1.carga=0;
    c1.modelo="";
    c1.status();
    c1.destampar();
    c1.rabiscar();


    Caneta c2=new Caneta();

    c2.status();
    c2.tampar();
    c2.rabiscar();
    
    }
}

public class App {
    public static void main(String[] args) throws Exception {
    Caneta c1 = new Caneta(); /*criando um objeto da classe caneta q nesse caso é c1 */

        c1.modelo="BIC CRISTAL"; /*pode se mudar o modelo pois é um atributo público */
        c1.cor="azul";
        //c1.ponta=0.5f; /*da erro pois o acesso de ponta é privado */
        c1.carga=80;/*carga é protegido ou seja só pode ser utilizado por suas classes e subclasses, como é esse caso*/
       // c1.tampada=true;
        c1.status();
        c1.rabiscar();
        c1.destampar();



    
    }
}

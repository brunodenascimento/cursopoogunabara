
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Uma Caneta "+ this.cor);
        System.out.println ("Esta tampada? "+this.tampada);
        System.out.println("modelo "+this.modelo);
        System.out.println("carga "+ this.carga);
        System.out.println("ponta "+this.ponta);

    }
    void rabiscar() {
        if (this.tampada==true){
            System.out.println("Não posso rabiscar");  }
            
            else{
                System.out.println("Estou rabiscando");
            }
      
    }

    void tampar(){
        this.tampada=true;
    }

    void destampar () {
        this.tampada=false;

    }

}

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    public String cor;



    public Caneta(String m, String c, float p){//método construtor é aquele método que tem o mesmo nome da classe
       this.ponta=p;
        this.modelo=m;
        this.cor=c;
        this.tampar();
    }
    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo=m;
    }
    public float getPonta(){
    return this.ponta;
}
    public void setPonta (float p){
    this.ponta=p;
}
    public void tampar(){
        this.tampada=true;
    }
    public void destampar(){
        this.tampada=false;
    }

    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("A cor da Caneta é: "+ this.cor);
        System.out.println("Tampada:" + this.tampada);
    }
    
}

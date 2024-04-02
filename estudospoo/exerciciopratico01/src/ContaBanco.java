public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("Número da conta: "+this.getnumConta());
        System.out.println("Tipo da conta: "+this.getTipo());
        System.out.println("Essa conta pertence à/ao Sr./Sra. : "+this.getDono());
        System.out.println("O seu saldo atual é: "+this.getSaldo());  
        System.out.println("Status da conta: "+this.status()); //tive problema com essa linha pois se eu pôr this.getStatus da erro.
    }

    //métodos
    public void depositar(float v){
        if(status==true)/*ou getStatus(true)*/{
          //  saldo=saldo+v; OU this.saldo=this.saldo+v;
            this.setSaldo(getSaldo()+v);
        }
        else{
            System.out.println("Impossível depositar, pois a sua conta está fechada. ");
        }
    }

    public void sacar(float v){
        if(status==true){
            if(saldo>=v){
                saldo=saldo-v;
            System.out.println("Saque realizado com sucesso na conta de: "+ this.getDono());
            }
            else {
                System.out.println("Impossível sacar porque o saldo é menor que o valor desejado para sacar");
            }
        }
        else if (status==false){
            System.out.println("Impossível sacar. conta inativa. ");
        }
    }
    //existe uma taxa de mensalidade para quem tem conta nessse banco. para usuários de conta corrente, de 12 reais, para conta poupança, 20 reais.
    public void pagarMensalidade(){
        float v;
        v=0;
        if (tipo.equals("CC")){
            v=12;
        }
        else if (tipo.equals("CP")){
            v=20;
        }
        if(status==true){
            if(saldo>v){
                saldo=saldo-v;
                System.out.println("Mensalidade paga com sucesso. Obrigado pelo seu pagamento, "+this.getDono());
            }
        else {
            System.out.println("Saldo insuficiente");
        }
        }
        else {
            System.out.println("Impossível pagar");
        }
    }

    //métodos especiais
    /*construtor */
    public ContaBanco(){
        saldo=0; //ou this.setSaldo(0); 
        status=false; //ou this.setStatus(false);

        //qualquer conta criada será iniciada com o saldo 0 e com status inativo
    }

    public void setNumConta(int n){
        numConta=n;
    }
    public int getnumConta(){
        return this.numConta;
    }
    public void setTipo(String t){
        tipo=t;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setDono(String d){
        dono=d;
    }
    public String getDono(){
        return this.dono;
    }

    public void setSaldo(float s){
        saldo=s;
    }
    public float getSaldo(){
        return this.saldo;
    }

    public void setstatus(boolean ss){
        status=ss;
    }
    public boolean status(){
        return this.status;
    }
    //preciso abrir o tipo da conta. se a sua conta for poupança você ganha 150 reais e se for corrente você ganha 50 reais
    public void abrirConta(String t){
       this.setTipo(t);
       this.setstatus(true);
       if(tipo=="CC"){
        this.setSaldo(50); //saldo=50;
       }
       else if(tipo=="CP"){
       this.setSaldo(150); //saldo=150; 
       }
       System.out.println("Conta aberta com sucesso");

    }
    //a conta só pode ser fechada se não estiver com saldo e com nenhuma dívida
    public void fecharConta(){
        if(this.getSaldo()>0){
            System.out.println("Conta com dinheiro. Retire tudo para que a conta possa ser encerrada. ");
        }
        else if (this.getSaldo()<0){
            System.out.println("Conta em débito. Quite suas dívidas para que a conta possa ser encerrada. ");
        }
        else{
            this.setstatus(false);
            System.out.println("Conta fechada com sucesso. ");
        }
    }
}

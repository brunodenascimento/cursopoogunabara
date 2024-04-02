import java.util.Random;

public class Luta {
    //aqui estou definindo os atibutos da classe luta, ela estará relacionada aos lutadores, pois cada lutador participa de uma luta x que tem: lutador desafiado, lutador desafiante, número de rounds do torneio e se a luta foi aprovada(pois ela tem regras)
    
    private Lutador desafiado;
    private  Lutador desafiante; //desafiante e desafiado será do tipo lutador, ou seja, do tipo abstrato.
    private int rounds;
    private boolean aprovada;


    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean isAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    //métodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria())&& l1!=l2) {
            this.aprovada=true;
            this.desafiado=l1;
            this.desafiante=l2;
        }
        else{
            this.aprovada=false;
            this.desafiado=null;
            this.desafiante=null;
        }
    }
    public void lutar(){
        if(this.aprovada==true){
            System.out.println("DESAFIADO");
            this.desafiado.apresentar();
            System.out.println("DESAFIANTE");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);//0, 1 ou 2
            switch (vencedor) {
                case 0://empate
                System.out.println("Empatou");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                    
                    break;
                case 1://desafiado vence
                System.out.println("Vitória do "+this.getDesafiado());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;
                case 2://desafiante vence
                System.out.println("Vitória do "+ this.getDesafiante());
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                    break;
            }
        }
        else{
            System.out.println("A luta não pode acontecer pois não foi aprovada.");
        }
    }

}

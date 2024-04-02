public class ControleRemoto implements Controlador {
  //atributos
  private int volume;
  private boolean ligado;
  private boolean tocando;
  //métodos especiais
  public ControleRemoto(){
    this.volume=50;
    this.ligado=false;
    this.tocando=false;
  }
  private int getVolume() {
    return volume;
  }
  private void setVolume(int volume) {
    this.volume = volume;
  }
  private boolean isLigado() {
    return ligado;
  }
  private void setLigado(boolean ligado) {
    this.ligado = ligado;
  }
  private boolean isTocando() {
    return tocando;
  }
  private void setTocando(boolean tocando) {
    this.tocando = tocando;
  }
  //desenvolvendo métodos abstratos (eles são desenvolvidos na classe)

  @Override//override significa que estamos sobreescrevendo o método ou seja, está considerando o código daqui e não o abstrato feito na interface controlador
  public void ligar() {
    this.setLigado(true);
  }
  @Override
  public void desligar() {  
    this.setLigado(false);
  }
  @Override
  public void abrirMenu() { 
    System.out.println("Está ligado? "+this.isLigado());
    System.out.println("Está tocando? "+this.isTocando());
    System.out.print("Volume = "+this.getVolume()+" ");
    for (int i =0; i<= this.getVolume(); i=i+10){
      System.out.print("[]");
    }
    

  }
  @Override
  public void fecharMenu() {  
    System.out.println("Fechando menu. ");
  }
  @Override
  public void maisVolume() {  
    if (this.isLigado()==true && this.getVolume()==100){
      this.setVolume(this.getVolume()+5);
    }
  }
  @Override
  public void menosVolume() { 
    if (this.isLigado()==false && this.getVolume()!=0){
      this.setVolume(this.getVolume()-5);
    }
  }
  @Override
  public void ligarMudo() { 
    if (this.getVolume()>0 && this.isLigado()==true){
      this.setVolume(0);
    }
  }
  @Override
  public void desligarMudo() {  
    if (this.getVolume()==0 && this.isLigado()==true){
      this.setVolume(50);
    }
  }
  @Override
  public void play() {
    if (this.isLigado()==true && !(this.isTocando()==true)){
      this.setTocando(true);
    }
  }
  @Override
  public void pause() {
    if (this.isLigado()==true && (this.isTocando()==true)){
      this.setTocando(false);
    }
  }

}

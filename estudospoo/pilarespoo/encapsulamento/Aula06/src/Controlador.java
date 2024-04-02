public interface Controlador {
    public abstract void ligar(); //método abstrato que só vai representar as funções da interface (botões do controle remoto)
    public abstract void desligar(); //os métodos abstratos da interface sempre serão públicos e apena serão desenvolvidos na classe
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}

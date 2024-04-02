public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    //método construtor
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome=no;
        this.nacionalidade=na;
        this.idade=id;
        this.altura=al;
        setPeso(pe);//peso, diferente dos outros atributos, vai ser atribuido pelo set nesse exemplo, para que a categoria seja definida pelo peso.
        this.vitorias=vi;
        this.derrotas=de;
        this.empates=em;
    }

    //métodos get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();//não recebe parâmetro
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {//não recebe parametro pois a categoria do lutador já é definida pelo seu peso
        if(peso<52.2){
            categoria="inválido";
        }
        else if(peso<=70.3){
            categoria="leve";
        }
        else if(peso<=83.9){
            categoria="médio";
        }
        else if(peso<=120.2){
            categoria="pesado";
        }
        else{
            categoria="invalido";
        }
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }

    //métodos especiais

    public void apresentar(){
        System.out.println("====================");
        System.out.println("Apresentando o lutador "+this.getNome());
        System.out.print("====================");
    }
    public void status(){
        System.out.println("Apresentando o lutador "+this.getNome());
        System.out.println("Nacionalidade: "+this.getNacionalidade());
        System.out.println("Idade:"+ this.getIdade());
        System.out.println("Altura: "+this.getAltura());
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Categoria de tamanho: "+this.getCategoria());
        System.out.println("Vitórias: "+this.getVitorias());
        System.out.println("Derrotas: "+this.getDerrotas());
        System.out.println("Empates em luta: "+this.getEmpates());      
    }
    public void ganharLuta(){
        setVitorias(getVitorias()+1); //sempre usar os métodos acessores para respeitar o encapsulamento pois o atributo é privado
    }
    public void perderLuta(){
        setDerrotas(getDerrotas()+1);
    }
    public void empatarLuta(){
        setEmpates(getEmpates()+1);
    }
}

package CursoEmVideoPOO.aula07;

public class Lutador {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

//    metodos publicos



    public  void apresentar(){
        System.out.println("-----------------------");
        System.out.println("Nome do Lutador: " + this.getNome() );
        System.out.println("Nacionalidade do lutador: " + this.getNacionalidade());
        System.out.println("Idade do lutador: " + this.getIdade());
        System.out.println("Altura DO lutador: " + this.getAltura());
        System.out.println("Peso do lutador: " + this.getPeso() + " KG.");
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }

    public  void status(){
        System.out.println("----- Status do Lutador -----");
        System.out.println("Nome: " + this.getNome());
        System.out.println("É categoria " + this.getCategoria());
        System.out.println("tem " + this.getVitorias() + " vitorias");
        System.out.println("tem " + this.getDerrotas() + " derrotas");
        System.out.println("tem " + this.getDerrotas() + " empates");
    }

    public  void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }

    public  void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }

    public  void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }


    //metodos especiais

    public Lutador(String nome, String nacionalidade, int idade, float altura,
                   float peso,int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

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

    public void setPeso(float pedo) {
        this.peso = pedo;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 0){
            this.categoria = "Invalido";
        }else if (this.peso <= 70.3 ){
            this.categoria ="Leve";
        }else if (this.peso <= 83.9){
            this.categoria = "Medio";
        }else if (this.peso <= 122.5){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Invalido";
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
}

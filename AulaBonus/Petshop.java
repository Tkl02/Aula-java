package AulaBonus;

public abstract class Petshop {
    private String nome;
    private String tipo;
    private String dataEntrada;
    private Arraylist<Animal> animais;
    private Arraylist<Dono> donos;

    // construtor
    public Petshop(String nome, String tipo, String dataEntrada, Arraylist<Animal> animais, Arraylist<Dono> donos) {
        this.nome = nome;
        this.tipo = tipo;
        this.dataEntrada = dataEntrada;
        this.animais = animais;
        this.donos = donos;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Arraylist<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(Arraylist<Animal> animais) {
        this.animais = animais;
    }

    public Arraylist<Dono> getDonos() {
        return donos;
    }

    public void setDonos(Arraylist<Dono> donos) {
        this.donos = donos;
    }

    
    public void addAnimal(Animal animal) {
        this.animais.add(animal);
    }

    public void removeAnimal(Animal animal) {
        this.animais.remove(animal);
    }

}

package AulaBonus;

import java.util.ArrayList;

public class Animal extends Petshop{
    private ArrayList<String> tipo = new ArrayList<String>();

    public Animal(String tipo, String dataEntrada, Arraylist<Animal> animais, ArrayList<String> tipo2) {
        super(tipo, dataEntrada, animais);
        tipo = tipo2;
    }

    public ArrayList<String> getTipo() {
        return tipo;
    }

    public void setTipo(ArrayList<String> tipo) {
        this.tipo = tipo;
    }
}

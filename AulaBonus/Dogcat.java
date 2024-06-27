package AulaBonus;

import java.util.ArrayList;

public class Dogcat extends Animal {
    private Boolean pelos = true;
    private boolean pulgas = false;
    private boolean unhasGrande = true;

    public Dogcat(String tipo, String dataEntrada, Arraylist<Animal> animais, ArrayList<String> tipo2, Boolean pelos,
            boolean pulgas, boolean unhasGrande) {
        super(tipo, dataEntrada, animais, tipo2);
        this.pelos = pelos;
        this.pulgas = pulgas;
        this.unhasGrande = unhasGrande;
    }

    public Boolean getPelos() {
        return pelos;
    }

    public void setPelos(Boolean pelos) {
        this.pelos = pelos;
    }

    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }

    public boolean isUnhasGrande() {
        return unhasGrande;
    }

    public void setUnhasGrande(boolean unhasGrande) {
        this.unhasGrande = unhasGrande;
    }
}

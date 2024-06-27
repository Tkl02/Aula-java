package AulaBonus;

import java.util.ArrayList;

public class Aves extends Animal {
    private Boolean voa = true;
    private boolean garraGrande = true;
    private boolean pulgas = false;
    private boolean penasGrandes = true;

    public Aves(String tipo, String dataEntrada, Arraylist<Animal> animais, ArrayList<String> tipo2, Boolean voa,
            boolean garraGrande, boolean pulgas, boolean penasGrandes) {
        super(tipo, dataEntrada, animais, tipo2);
        this.voa = voa;
        this.garraGrande = garraGrande;
        this.pulgas = pulgas;
        this.penasGrandes = penasGrandes;
    }

    public Boolean getVoa() {
        return voa;
    }

    public void setVoa(Boolean voa) {
        this.voa = voa;
    }

    public boolean isGarraGrande() {
        return garraGrande;
    }

    public void setGarraGrande(boolean garraGrande) {
        this.garraGrande = garraGrande;
    }

    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }

    public boolean isPenasGrandes() {
        return penasGrandes;
    }

    public void setPenasGrandes(boolean penasGrandes) {
        this.penasGrandes = penasGrandes;
    }

}

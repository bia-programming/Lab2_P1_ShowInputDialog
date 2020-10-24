package com.company;

public class Car {
    private String model;
    private int pret;
    private boolean isNew;

    public Car(String model, int pret, boolean isNew) {
        this.model = model;
        this.pret = pret;
        this.isNew = isNew;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", pret=" + pret +
                ", isNew=" + isNew +
                '}';
    }
}

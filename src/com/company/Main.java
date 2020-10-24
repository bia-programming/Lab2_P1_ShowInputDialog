package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Car car=new Car("Audi",10000,true);
        JOptionPane.showMessageDialog(null, "Model: "+car.getModel());
        JOptionPane.showMessageDialog(null, "Pret: " +car.getPret());
        JOptionPane.showMessageDialog(null, "Is new: "+car.isNew());

        String model=JOptionPane.showInputDialog(null,"Schimbati modelul:");
        car.setModel(model);
        int pret=Integer.parseInt(JOptionPane.showInputDialog(null,"Schimbati pretul:"));
        car.setPret(pret);
        boolean isNew=Boolean.parseBoolean(JOptionPane.showInputDialog(null,"Is new/is not new:"));
        car.setNew(isNew);

        JOptionPane.showMessageDialog(null, "Model: "+car.getModel());
        JOptionPane.showMessageDialog(null, "Pret: " +car.getPret());
        JOptionPane.showMessageDialog(null, "Is new: "+car.isNew());
    }
}

package com.example.focaap.model;

/*паттерн стратегия*/

import java.util.ArrayList;
import java.util.List;

public abstract class Piles {
    private AreaPiles A;
    private String formPiles;

    public AreaPiles calculationAreaPiles(String formPropAreaPile){
        AreaPiles arp;
        String[] fProp = formPropAreaPile.split(" ");
        switch (fProp.length){
            case 1 : arp = new AreaPiles(Double.parseDouble(fProp[0]));
            break;
            case 2 : arp = new AreaPiles(Double.parseDouble(fProp[0]),Double.parseDouble(fProp[1]));
            break;
            case 3 : arp = new AreaPiles(Double.parseDouble(fProp[0]),Double.parseDouble(fProp[1]),1);
            break;
            case 4 : arp = new AreaPiles(Double.parseDouble(fProp[0]),Double.parseDouble(fProp[1]),Double.parseDouble(fProp[2]),Double.parseDouble(fProp[3]));
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + fProp.length);
        }
        return arp;
    }




    /*private double Fd;
    private double Fdb;
    private double yc;
    private double R;

    private double Rm;
    private double Rcmn;
    private double yg;
    private double Rc;
    private double Ks;
    private double Rcn;*/
    //Вычисление площади поперечного сечения
    public abstract double bearingArea();

}

/*Свая стойка*/
class PileRack extends Piles {

    @Override
    public double bearingArea() {
        return 0;
    }
}
/*Висячая свая забивная*/
class PileHanding extends Piles{

    @Override
    public double bearingArea() {
        return 0;
    }
}
/*Висячая - набивная*/
class PileHandingStuffed extends Piles{

    @Override
    public double bearingArea() {
        return 0;
    }
}
/*Винтовая свая*/
class PileScrew extends Piles{

    @Override
    public double bearingArea() {
        return 0;
    }
}
/*Стальные трубчатые*/
class PileSteelTubular extends Piles{

    @Override
    public double bearingArea() {
        return 0;
    }
}
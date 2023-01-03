package com.example.focaap.model;

public class AreaPiles {
    public double getAreaP() {
        return areaP;
    }

    public void setAreaP(double areaP) {
        this.areaP = areaP;
    }

    private double areaP = 0;

    public AreaPiles (double a, double b){
        this.areaP = a*b;
    }
    public AreaPiles (double R){
        this.areaP = Math.PI*R*R;
    }
    public AreaPiles (double a1, double b1, double a2, double b2){
        this.areaP = (a1-a2)*(b1-b2);
    }
    public AreaPiles (double R, double r, int a){
        this.areaP = Math.PI*(R-r)*(R-r);
    }
}

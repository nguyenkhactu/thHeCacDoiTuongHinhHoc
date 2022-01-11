package com.company;

public class Square extends Rectangle {
    public Square() {
    }
    public Square(double side){
        super(side,side);
    }

    public Square(String color, boolean filled,double side) {
        super(color, filled, side, side);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double lenght) {
        setSide(lenght);
    }

    @Override
    public String toString() {
        return "A com.company.Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}


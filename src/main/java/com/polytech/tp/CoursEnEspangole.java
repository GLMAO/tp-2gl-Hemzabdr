package com.polytech.tp;

public class CoursEnEspangole extends CoursDecorator{
    public CoursEnEspangole(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        return coursDecorated.getDescription() + " (En espangole)";
    }

    @Override
    public double getDuree() {
        return coursDecorated.getDuree();
    }
}

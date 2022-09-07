package com.InputOutput.game;

public abstract class AbstractDecoratorUnit implements Unit {

    private final Unit unit;

    public AbstractDecoratorUnit(Unit unit) {
        this.unit = unit;
    }

    @Override
    public void move() {
    unit.move();
    afterMove();
    }

    protected abstract void afterMove();


}

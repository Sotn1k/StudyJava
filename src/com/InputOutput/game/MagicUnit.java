package com.InputOutput.game;

public class MagicUnit extends AbstractDecoratorUnit {
    public MagicUnit(Unit unit) {
        super(unit);
    }

    @Override
    protected void afterMove() {
        System.out.println("... added some magic ...");
    }
}

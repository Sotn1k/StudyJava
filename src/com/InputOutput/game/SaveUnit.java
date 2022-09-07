package com.InputOutput.game;

public class SaveUnit extends AbstractDecoratorUnit {
    public SaveUnit(Unit unit) {
        super(unit);
    }

    @Override
    protected void afterMove() {
        System.out.println(" ... added more protects ... ");
    }
}

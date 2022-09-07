package com.InputOutput.game;

public class Runner {
    public static void main(String[] args) {
        Unit[] units = {
                new Rider(),
                new Ork(),
               new MagicUnit(new Rider()),
               new SaveUnit( new Ork()),


        };

        for (Unit unit : units) {
            unit.move();
        }
    }
}

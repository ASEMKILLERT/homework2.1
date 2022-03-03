package com.company;

import java.awt.desktop.ScreenSleepEvent;

public class SecondLvl extends FirstLvl {

    public SecondLvl(String degree, String traps) {
        super(degree, traps);
    }
    private String name;
    private LevelDiffuculty difficulty;

    public String getName() {
        return name;
    }

    public LevelDiffuculty getDifficulty() {
        return difficulty;
    }
}
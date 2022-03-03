package com.company;

public class FirstLvl {
    private String degree;
    private String traps;

    public FirstLvl(String degree, String traps) {
        this.degree = degree;
        this.traps = traps;
    }

    public String getDegree() {
        return degree;
    }

    public String getTraps() {
        return traps;
    }

    public void finishLevel(){
        System.out.println("Уровень пройден");
    }
    public void finishLevel(String finish){
        System.out.println(finish);
    }
    }
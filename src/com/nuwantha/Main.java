package com.nuwantha;

public class Main {
    public static void main(String[] args) {
        Player1 player = new Player1("Manelka","T56", 100);
        System.out.println(player.getHealth());
        player.damageByGun1();
        player.damageByGun2();
        
        player.heal();
    }
}

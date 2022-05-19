package com.nuwantha;

public class Player2 extends Player1 {
    private boolean armour;
    private int health;

    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.armour = armour;
        this.health = health;
    }

    @Override
    public void damageByGun1() {
        if (armour) {
            this.health -= 20;
            if (this.health <= 0) this.health = 0;
            System.out.println("Armour is On.Got hit by gun1.Health is reduced by 20. New health is " + this.health);
        }
        if (!armour) {
            this.health -= 30;
            if (this.health <= 0) this.health = 0;
            System.out.println("Armour is Off.Got hit by gun1.Health is reduced by 30. New health is " + this.health);

        }
        if (this.health==0){
            System.out.println(getName() + " is dead.");
        }
    }

    @Override
    public void damageByGun2() {
        if(armour){
            this.health -= 40;
            if (this.health <= 0) this.health=0;
            System.out.println("Armour is On.Got hit by gun2.Health is reduced by 40. New health is " + this.health);
        }
        if (!armour){
            this.health -= 50;
            if (this.health <= 0) this.health=0;
            System.out.println("Armour is Off.Got hit by gun2.Health is reduced by 50. New health is " + this.health);
        }
        if(this.health == 0){
            System.out.println(getName() + "is dead.");
        }
    }

    @Override
    public void heal() {
        super.heal();
    }
}

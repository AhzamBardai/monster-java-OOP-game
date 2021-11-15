import java.lang.Math;


public class Monster {
    private String name;
    private int health;
    private Weapon weapon;

    public Monster(String name, int health, Weapon weapon){
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.health;
    }

    public String getWeaponName(){
        return this.weapon.getName();
    }

    public int attack(Monster monster){
        int weaponDamage = this.weapon.getMaxDamage();
        int random = (int)(Math.random() * weaponDamage );
        monster.health -= random;
        return random;
    }
}
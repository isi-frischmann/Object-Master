public class Wizard extends Human{
    public int health, strength, stealth, intelligence;

    public Wizard(){
        this.health = 50;
        this.intelligence = 8;
    }

    public void heal(Human heals){
        heals.intelligence -= this.intelligence;
    }

    public void fireball(Human, hitFireBall){
        int looseIntel = this.intelligence * 3;
        hitFireBall.health -= looseIntel;
    }
}
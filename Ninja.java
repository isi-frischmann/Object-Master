public class Ninja extends Human{
    public int health, strength, stealth, intelligence;

    public Ninja(){
        this.stealth = 10;
    }

    public void steal(Human stealing){
        stealing.stealth -= this.health;
    }

    public void runAway(){
        this.health -= 10;
    }
}
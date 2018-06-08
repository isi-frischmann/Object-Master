public class Human {
    public int health, strength, stealth, intelligence;

    public Human(){
        this.health = 100;
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
    }

    public Human(int health, int strength, int stealth, int intelligence){
        this.health = health;
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
    }

    public void attack(Human pain){
        pain.health -= this.strength;
        System.out.println("You attacked another Human! This Human is loosing " + pain.health + " years from health... - Too BAD!! And you're winning " + this.strength + " of strength.");
    }

    public void getHuman(){
        System.out.println("This human health is " + this.health);
        System.out.println("This human strength is " + this.strength);
        System.out.println("This human stealth is " + this.stealth);
        System.out.println("This human intelligence is " + this.intelligence);
    }
}
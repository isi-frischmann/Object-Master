public class Human {
    // create the member variables(attributes)
    public int health, strength, stealth, intelligence;

    // set the attributes for every Human
    public Human(){
        this.health = 100;
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
    }

    // if you want to add a Human but need to have flexible attributes
    public Human(int health, int strength, int stealth, int intelligence){
        this.health = health;
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
    }

    // method from the Human.
    // When the Human attach another Humann the strength should be change at that Human
    // --> That's why you need to set the Human as input
    public void attack(Human pain){
        pain.health -= this.strength;
        System.out.println("You attacked another Human! This Human is loosing " + pain.health + " years from health... - Too BAD!! And you're winning " + this.strength + " of strength.");
    }

    // get the Human and print there information
    public void getHuman(){
        System.out.println("This human health is " + this.health);
        System.out.println("This human strength is " + this.strength);
        System.out.println("This human stealth is " + this.stealth);
        System.out.println("This human intelligence is " + this.intelligence);
    }
}
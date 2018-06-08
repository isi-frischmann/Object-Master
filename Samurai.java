public class Samurai extends Human {
    public int health, strength, stealth, intelligence;

    public Samurai(){
        this.health = 200;
    }

    // Set others Human health to 0 and decrease the own health by half.
    // As we set the Human Java knows where do grab the informations that's why you 
    // can do death.health; It goes to the other Humans health
    public void deathBlow(Human death){
        death.health = 0;
        this.health = this.health / 2;
    }

    public void meditate(){
        int heals = this.health / 2;
        this.health = this.health + heals;
        System.out.println(this.health);
    }

    // public int howMany(){
    //     for(int i = 0; i < Samurai.length; i++){
            
    //     })
    // }

    public void getSamurai(){
        System.out.println("That's the health from the Samurai: " + this.health);
    }
}
public class HumanTest{
    
    public static void main(String[] args){
        Human h = new Human();
        h.getHuman();

        Human newHuman = new Human(350, 40, 40, 40);
        newHuman.getHuman();
        newHuman.attack(h);

        Samurai s = new Samurai();
        s.meditate();
        s.getSamurai();
    } 
}

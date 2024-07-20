public class Cow extends Animal implements Pettable {
    
    @Override
    void sound(){
        System.out.println("Moo");
    }
    
    public void pet() {
        System.out.println("You can pet the duck");
    }
}

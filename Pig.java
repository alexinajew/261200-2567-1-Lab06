public class Pig extends Animal implements Pettable {
    
    @Override
    void sound(){
        System.out.println("Oink");
    }

    public void pet() {
        System.out.println("You can pet the duck");
    }
    
}

public class Owl extends Animal implements Pettable {

    @Override
    void sound(){
        System.out.println("Hoot Hoot");
    }

    void fly(){
        System.out.println("I believe I can touch the sky!");
    }

    void glide(){
        System.out.println("I can also run");
    }

    public void pet() {
        System.out.println("You can pet");
    }
}

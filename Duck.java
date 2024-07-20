public class Duck extends Animal implements Flyable, Pettable {

    void clean(Animal cleanee){
        System.out.println(this + " is cleaning " + cleanee);
    }
    
    @Override
    public void sound(){
        System.out.println("Quack");
    }

    public void fly(){
        System.out.println("I believe I can fly!");
    }
    
    public void glide(){
        System.out.println("I can also run");
    }

    public void land(){
        System.out.println("I can land on water!");
    }

    public void pet() {
        System.out.println("You can pet");
    }
}

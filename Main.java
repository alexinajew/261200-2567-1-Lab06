public class Main{

    public static void main(String[] args) {

        Duck psyDuck = new Duck();
        Owl fluffy = new Owl();
        PekingDuck DonaltheDuck = new PekingDuck();
        Cow Msmoo = new Cow();
        Pig Papapig = new Pig();

        System.out.println("Owl");
        fluffy.sound(); 
        fluffy.fly();
        fluffy.glide();
        psyDuck.pet();
        System.out.println("Duck");
        psyDuck.sound();
        psyDuck.fly();
        psyDuck.glide();
        psyDuck.land();
        psyDuck.pet();
        psyDuck.clean(fluffy);            
        System.out.println("Donal the Duck");
        DonaltheDuck.clean(fluffy);
        DonaltheDuck.pet();   
        System.out.println("Cow");
        Msmoo.sound();  
        psyDuck.pet();
        System.out.println("Pig");      
        Papapig.sound();
        psyDuck.pet();
        

    }   

}

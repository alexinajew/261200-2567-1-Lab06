public class PekingDuck extends Duck {

    void beCrispy(){
        System.out.println("grob");
    }

    @Override
    void clean(Animal cleanee){
        System.out.println("I died already, sorry");
    }
    
}

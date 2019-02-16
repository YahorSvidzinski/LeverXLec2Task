import java.util.List;

public class TrainingRoom extends FarmDog{
    public static void train(List<Dog> dogs,int i){
        dogs.get(i).trained = true;
    }
}

import java.util.List;

public class Doctors {
    public void check(List<Dog> dogs){
        for (int i = 0; i < dogs.size(); i++) {
            if (!dogs.get(i).healthy) {
                dogs.get(i).healthy = true;
                System.out.println(dogs.get(i).name+" healed!!!");
            }
        }
    }
}

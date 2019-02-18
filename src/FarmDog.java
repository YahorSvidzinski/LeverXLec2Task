import java.util.ArrayList;
import java.util.List;

public class FarmDog {

    public static void main(String[] args) {

    List<Dog> dogs = new ArrayList<>();
    Personal personal = new Personal();
    Doctors doctors = new Doctors();
    dogs.add(Dog.newBuilder().setName("Jack").setAge(6).setHealthy(true).setTrained(true).build());
    dogs.add(Dog.newBuilder().setName("Tan").setAge(1).setHealthy(false).setTrained(false).build());
    dogs.add(Dog.newBuilder().setName("Roma").setAge(10).setHealthy(true).setTrained(false).build());
    dogs.add(Dog.newBuilder().setName("Kelly").setAge(4).setHealthy(false).setTrained(true).build());
    personal.feed(dogs);
    doctors.check(dogs);
    personal.clearHouse();
    personal.trainDogs(dogs);
    personal.feed(dogs);
    }
}

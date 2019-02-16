import java.util.ArrayList;
import java.util.List;

public class FarmDog {

    public static void main(String[] args) {

    List<Dog> dogs = new ArrayList<>();// List of dogs
    Personal personal = new Personal();//Creating personal
    Doctors doctors = new Doctors();//Creating doctors
         /*
    First argument = name
    Second argument = age
    Third argument = healthy or not
    Fourth argument = trained or not
    Fifth argument = fed or not
    Add in list with "new Dog(args)"
     */
    dogs.add(new Dog("Jack",5,true,true));
    dogs.add(new Dog("Kelly",10,false,true));
    dogs.add(new Dog("Johny",1,false,false));
    dogs.add(new Dog("Gera",4,true,false));
    //The day starts
    personal.feed(dogs);//Breakfast
    doctors.check(dogs);//Checking dogs health
    personal.clearHouse();//Clearing houses
    personal.trainDogs(dogs);//Train of dogs or sending them to work
    personal.feed(dogs);//Dinner
    }
}

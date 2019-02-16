import java.util.List;

public class Personal{
    public void feed(List<Dog> dogs) {
        for (int i = 0; i < dogs.size(); i++) {
            if (dogs.get(i).age == "puppy") {
                dogs.get(i).fed = true;
                System.out.println(dogs.get(i).name + " fed with Milk");
            } else if (dogs.get(i).age == "adult") {
                dogs.get(i).fed = true;
                System.out.println(dogs.get(i).name + " fed with meat");
            } else if (dogs.get(i).age == "old") {
                dogs.get(i).fed = true;
                System.out.println(dogs.get(i).name + " fed with A LOT OF MEAT");
            }
        }
    }
    public void clearHouse(){
        House.cleared = true;
        System.out.println("Houses cleared");
    }
    public void trainDogs(List<Dog> dogs){
        for (int i = 0; i < dogs.size() ; i++) {
            if (dogs.get(i).age == "puppy") {
                if (!dogs.get(i).trained) {
                    TrainingRoom.train(dogs, i);
                    System.out.println(dogs.get(i).name+"had trained");
                }
            }
            if (dogs.get(i).age == "adult"){
                System.out.println(dogs.get(i).name+" had gone to cops(");
            }
        }
    }

}

public class Dog {
    protected String name;
    protected String age;
    protected boolean healthy;
    protected boolean trained;
    protected boolean fed = false;
    Dog(String name,int age,boolean healthy,boolean trained) {
        this.name = name;
        if (age < 2) {
            this.age = "puppy";
        }
        else if (age < 8) {
            this.age = "adult";
        }
        else if (age > 8) {
            this.age = "old";
        }
        this.healthy = healthy;
        this.trained = trained;
    }

}

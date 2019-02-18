public class Dog {

    public String name;
    public String age;
    public boolean healthy;
    public boolean trained;

    public boolean fed;
    private Dog() {

    }
    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }
    public boolean getHealthy(){
        return healthy;
    }
    public boolean getTrained(){
        return trained;
    }
    public static Builder newBuilder(){
        return new Dog().new Builder();
    }
    public class Builder {

        private Builder(){

        }
        public Builder setName(String name){
            Dog.this.name = name;
            return this;
        }
        public Builder setAge(int age){
            if (age < 2) {
                Dog.this.age = "puppy";
            }
            else if (age < 8) {
                Dog.this.age = "adult";
            }
            else if (age > 8) {
                Dog.this.age = "old";
            }
            return this;
        }
        public Builder setHealthy(boolean healthy){
            Dog.this.healthy = healthy;
            return this;
        }
        public Builder setTrained(boolean trained){
            Dog.this.trained = trained;
            return this;
        }
        public Dog build(){
            Dog dog = new Dog();
            dog.name = name;
            dog.age = age;
            dog.healthy = healthy;
            dog.trained = trained;
            return dog;
        }
    }
}

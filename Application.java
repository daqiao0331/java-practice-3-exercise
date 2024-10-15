abstract class Animal {
    abstract void cry(); 
    abstract String getAnimalName(); 
}

class Simulator{
        void playSound(Animal animal){
        animal.cry();
        System.out.println(animal.getAnimalName() + " is crying.");
    }
}

class Dog extends Animal {
    void cry() {
        System.out.println("wang");
    }
    String getAnimalName() {
        return "Dog";
    }
}

class Cat extends Animal {
    void cry() {
        System.out.println("miao");
    }
    String getAnimalName() {
        return "Cat";
    }
}

public class Application {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.playSound(new Dog());
        simulator.playSound(new Cat());
    }
}

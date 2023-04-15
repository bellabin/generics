import java.util.*;

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound(){
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    void sound(){
        System.out.println("Meow");
    }
}

public class Main {
    public static void animalSound(List <? extends Animal> animal){
        for(Animal animal1 : animal){
            animal1.sound();
        }
    }
    public static void main(String[] args) {
        List <Dog> list1 = new ArrayList<>();
        List <Cat> list2 = new ArrayList<>();
        list1.add(new Dog());
        list2.add(new Cat());
        animalSound(list1);
        animalSound(list2);
    }
}
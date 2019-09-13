package factory.factory_method;

import factory.simple_factory.Animal;

public class Client {
    public static void main(String[] args) {
        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.create();
        dog.eat();

        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.create();
        cat.eat();
    }
}
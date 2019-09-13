package factory.factory_method;

import factory.simple_factory.Animal;
import factory.simple_factory.Dog;

public class DogFactory implements AnimalFactory {
    @Override
    public Animal create() {
        return new Dog();
    }
}
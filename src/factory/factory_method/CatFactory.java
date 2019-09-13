package factory.factory_method;

import factory.simple_factory.Animal;
import factory.simple_factory.Cat;

public class CatFactory implements AnimalFactory {
    @Override
    public Animal create() {
        return new Cat();
    }
}
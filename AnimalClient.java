/* Suppose you have an interface Animal and several classes 
    that implement it, such as Dog, Cat, and Fish.

    Now suppose you want to create an AnimalFactory class 
    that provides a method to create Animal objects based 
    on a given type. You can implement the Factory Method 
    Pattern to create the objects without specifying their 
    exact class.

    Now you can use the AnimalFactory to create Animal 
    objects without needing to know the exact class that 
    will be instantiated.

    This way, the AnimalClient can create Animal objects 
    without knowing their exact implementation classes, 
    thanks to the AnimalFactory class that creates the 
    objects based on a given type. This is the essence of 
    the Factory Method Pattern - creating objects without 
    specifying their exact class by delegating the object 
    creation to a factory object.
*/

public class AnimalClient {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        // create a dog and make it speak
        Animal dog = animalFactory.createAnimal("dog");
        dog.speak();

        // create a cat and make it speak
        Animal cat = animalFactory.createAnimal("cat");
        cat.speak();

        // create a fish and make it speak
        Animal fish = animalFactory.createAnimal("fish");
        fish.speak();
    }
}

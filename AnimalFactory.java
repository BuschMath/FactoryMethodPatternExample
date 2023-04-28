public class AnimalFactory {
    public Animal createAnimal(String type) {
        if ("dog".equals(type)) {
            return new Dog();
        } else if ("cat".equals(type)) {
            return new Cat();
        } else if ("fish".equals(type)) {
            return new Fish();
        } else {
            throw new IllegalArgumentException("Invalid animal type: " + type);
        }
    }
}

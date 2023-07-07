package Class_0707.P328;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        // 매개변수 다형성
        animalSound(new Dog());
        animalSound(new Cat());
    }

    public static void animalSound(Dog animal) {
        animal.sound();
    }
}

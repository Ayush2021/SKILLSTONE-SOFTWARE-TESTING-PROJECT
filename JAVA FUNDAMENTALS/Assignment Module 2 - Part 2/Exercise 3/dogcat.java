class Dog {
    String name;
    String colour;
    String breed;
    int age;
}
class Cat {
    String name;
    String colour;
    String breed;
    int age;
}
public class dogcat {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Buddy";
        dog1.colour = "Brown";
        dog1.breed = "Golden Retriever";
        dog1.age = 5;
        Cat cat1 = new Cat();
        cat1.name = "Whiskers";
        cat1.colour = "Black";
        cat1.breed = "Siamese";
        cat1.age = 3;
        System.out.println("dog1 is instance of Dog: " + (dog1 instanceof Dog));
        System.out.println("cat1 is instance of Cat: " + (cat1 instanceof Cat));
    }
} 
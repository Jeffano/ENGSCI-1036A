/**
 * Name: Jeffano John
 * Date: Dec. 4th 2021
 * Student Number: 251230759
 * Description: Creating a class with a default output but overridden when a different class with the same method is called
 */
public class Task2Demo {
    public static void main(String[] args) {

        //Creating an object for each class
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal duck = new Duck();

        //Printing the output for each animal
        System.out.println("Cat says:");
        //Calls the cat say method
        System.out.println(cat.say());

        //Printing the output for each animal
        System.out.println("\nDog says:");
        //Calls the dog say method
        System.out.println(dog.say());

        //Printing the output for each animal
        System.out.println("\nDuck says:");
        //Calls the duck say method
        System.out.println(duck.say());
    }

}

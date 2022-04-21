/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package AnimalShelter;

public class App {

    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.enqueue(new Cat("cat1"));
        animalShelter.enqueue(new Cat("Cat2"));
        animalShelter.enqueue(new Cat("Cat3"));
        animalShelter.enqueue(new Dog("dog1"));
        animalShelter.enqueue(new Dog("dog2"));
        animalShelter.enqueue(new Dog("dog3"));
        animalShelter.print();
        System.out.println("");
        System.out.println(animalShelter.dequeue("cat"));
        System.out.println(animalShelter.dequeue("dog"));
    }
}

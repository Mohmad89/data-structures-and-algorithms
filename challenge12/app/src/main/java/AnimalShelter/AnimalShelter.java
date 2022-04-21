package AnimalShelter;


import AnimalShelter.Queue.Queue;
import AnimalShelter.Queue.QueueNode;

public class AnimalShelter <T>{

    private Queue<Animal <T>> dogQueue = new Queue<>();
    private Queue<Animal <T>> catQueue = new Queue<>();
    private Queue<Animal <T>> allAnimal= new Queue<>();
    private int size = 0;

    public AnimalShelter () {}

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void enqueue(Animal animal) {

        if (animal instanceof Cat) {
            catQueue.enqueue(animal);
            allAnimal.enqueue(animal);
            size++;
        }else if (animal instanceof Dog) {
            dogQueue.enqueue(animal);
            allAnimal.enqueue(animal);
            size++;
        }
    }
    public void print (){
        QueueNode pointer = allAnimal.getBack();
        while (pointer != null) {
            System.out.print(pointer.getValue() + " => ");
            pointer = pointer.getNext();
        }
    }

    public String dequeue (String pref){
        if (size == 0 || pref != "cat" & pref != "dog")
            return null;
        else if (pref == "cat"){
                size--;
                return catQueue.dequeue()+" ";
        }else if (pref == "dog"){
                size--;
                return dogQueue.dequeue()+"";
        }
        return null;
    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "dogQueue=" + dogQueue +
                ", catQueue=" + catQueue +
                '}';
    }
}
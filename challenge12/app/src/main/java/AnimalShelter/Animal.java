package AnimalShelter;

import AnimalShelter.Queue.QueueNode;

class Animal<T> extends QueueNode<T> {

    public Animal (T name){
        super(name);
    }

}
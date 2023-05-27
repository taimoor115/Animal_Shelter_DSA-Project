import java.util.LinkedList;

public class QueueAnimal {
    LinkedList<Dogs> dogs = new LinkedList<>();
    LinkedList<Cats> cats = new LinkedList<>();
    private int order = 0;

    public void enQueue(Animal a) {
        a.setOrder(0);
        order++;
        if (a instanceof Dogs) {
            dogs.addLast((Dogs) a);
        } else if (a instanceof Cats) {
            cats.addLast((Cats) a);
        }
    }

    public int size() {
        return dogs.size() + cats.size();
    }

    //DeQueue Dogs
    public Dogs deQueueDogs() {
        return dogs.poll();
    }

    public Dogs peekDogs() {
        return dogs.peek();
    }
    //DeQueue Cats
    public Cats deQueueCats() {
        return cats.poll();
    }

    public Cats peekCats() {
        return cats.peek();
    }

    public Animal deQueueAny() {
        if (dogs.size() == 0) {
            return deQueueCats();
        } else if (cats.size() == 0) {
            return deQueueCats();
        }
        Dogs dog = dogs.peek();
        Cats cat = cats.peek();

        if (dog.isOlderThan(cat)) {
            return dogs.poll();
        } else {
            return cats.poll();
        }
    }

    //PEEK
    public Animal peek() {
        if (dogs.size() == 0) {
            return deQueueCats();
        } else if (cats.size() == 0) {
            return deQueueCats();
        }
        Dogs dog = dogs.peek();
        Cats cat = cats.peek();

        if (dog.isOlderThan(cat)) {
            return dogs.peek();
        } else {
            return cats.peek();
        }
    }
}

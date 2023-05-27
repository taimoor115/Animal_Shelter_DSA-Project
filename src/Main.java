class Main {
    public static void main(String[] args) {
        QueueAnimal q = new QueueAnimal();
        q.enQueue(new Cats("Mano"));
        q.enQueue(new Cats("Muphins"));
        q.enQueue(new Dogs("Mabby"));
        q.enQueue(new Cats("Catty"));
        q.enQueue(new Dogs("Katty"));

        System.out.println(q.deQueueAny().name);
        System.out.println(q.deQueueDogs().name);
    }
}
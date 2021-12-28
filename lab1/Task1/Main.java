package Task1;
class Main {
    public static void main(String[] args) {
        HardIterator iterator = new HardIterator();
        
        HardIteratorWorker worker1 = new HardIteratorWorker(iterator, 10);
        HardIteratorWorker worker2 = new HardIteratorWorker(iterator, 20);
        HardIteratorWorker worker3 = new HardIteratorWorker(iterator, 30);

        worker1.start();
        worker2.start();
        worker3.start();

        HardIteratorWorker.waitFor(worker1);
        HardIteratorWorker.waitFor(worker2);
        HardIteratorWorker.waitFor(worker3);

        System.out.println(iterator.i == (10 + 20 + 30)); // must be true
        System.out.println(iterator.i);
    }
}
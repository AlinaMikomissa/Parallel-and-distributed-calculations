package com.company;

public class ThreadTest implements Runnable {

    private SkipList<String> skipList;

    public ThreadTest(SkipList<String> skipList) {
        this.skipList = skipList;
    }

    @Override
    public void run() {
        String currThreadName = Thread.currentThread().getName();
        while (!skipList.add(currThreadName)) {
            System.out.println("Add " + currThreadName + ": false");
        }

        System.out.println("Add " + currThreadName + ": true");

        if (currThreadName.equals("Thread-6")) {
            System.out.println("Remove " + currThreadName + ": " + skipList.remove(currThreadName));
        }
    }
}

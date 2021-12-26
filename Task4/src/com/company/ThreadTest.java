package com.company;


public class ThreadTest implements Runnable {

    private HarrisList<String> harrisList;

    public ThreadTest(HarrisList<String> harrisList) {
        this.harrisList = harrisList;
    }

    @Override
    public void run() {
        String currThreadName = Thread.currentThread().getName();
        harrisList.add(currThreadName);

        if (currThreadName.equals("Thread-4")) {
            System.out.println("Remove: " + harrisList.remove(currThreadName));
        }
    }
}

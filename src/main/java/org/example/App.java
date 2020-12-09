package org.example;


public class App {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group =new ThreadGroup("group-1");

        Thread thr1 = new MyFirstThread(group,"Hero-01");
        Thread thr2 = new MyFirstThread(group, "Hero-02");
        Thread thr3 = new MyFirstThread(group, "Hero-03");
        Thread thr4 = new MyFirstThread(group, "Hero-04");

        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();

        Thread.sleep(15000);
        group.interrupt();
    }
}

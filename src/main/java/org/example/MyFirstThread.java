package org.example;

import java.util.Random;

public class MyFirstThread extends Thread{
    public MyFirstThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Random random = new Random();
                Thread.sleep(random.nextInt(5000));
                System.out.println(this.getName() + ": Всем привет!" );
            }
        } catch (InterruptedException err) {

        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }
}

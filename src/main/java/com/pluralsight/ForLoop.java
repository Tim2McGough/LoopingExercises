package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        int count =0;
        for (count =10 ;count > 0; count--) {
            System.out.println("Count: " + count);
            Thread.sleep(500);
        }
        if (count == 0){
            System.out.println("Launch!");
        }
    }
}

package com.company;

/*

1601 my first thread
Create a public static class TestThread - a thread with the Runnable interface.
TestThread should print “My first thread“ to the console.

Requirements:
1. Add the public static class TestThread to the Solution class.
2. The TestThread class must implement the Runnable interface.
3. The run method of the TestThread class should output "My first thread".
4. The program should output "My first thread".
5. The main method should not be changed.


 */

public class Solution {
    public static void main(String[] args) {
        TestThread task = new TestThread();
        new Thread(task).start();
    }

    public static class TestThread implements Runnable {
        public void run (){
            System.out.println("My first thread");
        }

    }
}





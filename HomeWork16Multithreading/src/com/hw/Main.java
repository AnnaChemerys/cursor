package com.hw;

public class Main {

    private static int counter = 1;

    public static void main(String[] args) {

        Board board = new Board();

        for (int i = 1; i < 3; i++) {
            new Thread(new MyThreads(board, i % 2), "Thread" + i).start();
        }
    }

    static class MyThreads implements Runnable {

        private final Board board;
        private final int balance;


        public MyThreads(Board board, int balance) {
            this.board = board;
            this.balance = balance;
        }

        @Override
        public void run() {
            while (counter <= 20) {
                synchronized (board) {
                    while (counter % 2 != balance) {
                        try {
                            board.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (counter % 2 == balance && counter <= 20) {
                        System.out.print(Thread.currentThread().getName()
                                + "-" + counter + "\n");
                    }
                    counter++;
                    board.notify();
                }
            }
        }
    }
}

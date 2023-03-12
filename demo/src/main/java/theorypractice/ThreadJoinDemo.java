package theorypractice;

public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 thread2 = new MyThread1(1,2,3);
        MyThread1 thread1 = new MyThread1(4,5,6);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(thread1.result- thread2.result);


    }
    public static class MyThread1 extends Thread {
        private int result;
        int a;
        int b;
        int c;
        public MyThread1(int a, int b, int c)
        {
            this.a=a;
            this.b=b;
            this.c=c;
        }
        

        @Override
        public void run ()
        {
            result= a+b+c;

        }
    }

}

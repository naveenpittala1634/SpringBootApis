package theorypractice;

public class CustomThread {
    public static void main(String[] args) {
        Animal a1=new Animal("A","B");
        Animal a2=new Animal("C","D");
        Animal a3=new Animal("E","F");
        Animal a4=new Animal("G","H");
        MyThread thread1 = new MyThread(a1);
        MyThread thread2 = new MyThread(a1);
        MyThread thread3 = new MyThread(a2);
        MyThread thread4 = new MyThread(a2);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


    }
    private static class MyThread extends Thread {
        Animal animal;

        MyThread(Animal animal) {
            this.animal = animal;
        }
           @Override
            public void run ()
            {
                synchronized(this.animal)
                {
                System.out.println("current thread " + currentThread().getName() + ",animal :" + this.animal);
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
                }

        }
    }


}

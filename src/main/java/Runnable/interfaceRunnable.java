package Runnable;

import static java.lang.Thread.sleep;

public class interfaceRunnable {
    static class enumeration implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                try{
                    sleep(10);		//Приостанавливает поток на 1 секунду
                }catch(InterruptedException e){}
                System.out.println("Hello Twen");
            }
        }
    }
        static enumeration mThing;

    public static void main(String[] args) {

        mThing = new enumeration();
        Thread thread =new Thread(mThing);
        thread.start();
            for (int i = 0; i < 100; i++) {
                try{
                    sleep(10);		//Приостанавливает поток на 1 секунду
                }catch(InterruptedException e){}
                System.out.println("Hello Mark");
            }
    }

}


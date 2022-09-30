package Runnable;

import java.util.ArrayList;
import java.util.List;

public class ARunnable {
    public static void runInSameTime (Runnable... tasks){
        for (Runnable task : tasks)
            new Thread(task).start();
    }

    public static void runInOrder (Runnable... tasks){
    for (Runnable  task : tasks)
        task.run();
    }

    public static void main(String[] args) throws InterruptedException{
        Runnable[] tasks = createTasks(5, 100);

        System.out.println("-----------------START RUN IN ORDER:-----------------");
        runInOrder(tasks);
        System.out.println("-----------------START RUN TOGETHER:-----------------");
        runInSameTime(tasks);
    }

    private static Runnable[] createTasks(int countTasks, int countTime) {
        List<Runnable> tasks = new ArrayList<>();
        for (int i = 0; i < countTasks; i++) {
            tasks.add(new Greeter(countTime, "Hello, " + (i==0? "Mark1":
                    i==1? "Carl2":
                            i==2?"Tommy3":
                                    i==3?"Mari4":
                                            i==4?"Frodo5":
                                                    i==5?"Anderson6":
                                                            i==6?"Anton7":
                                                                    i==7?"Po8":
                                                                            i==8?"Katty9":
                                                                                    "Sammy10")));
        }
        return tasks.toArray(new Runnable[0]);
    }
}
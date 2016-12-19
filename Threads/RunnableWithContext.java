package ru.sbt.Threads;

public class RunnableWithContext implements Runnable {
    private Context context;
    private Runnable runnable;

    public RunnableWithContext(Context context, Runnable runnable) {
        this.context = context;
        this.runnable = runnable;
    }

    @Override
    public void run() {
        try {
            runnable.run();
            context.incrementSuccessTask();
        }
        catch (Exception e) {
            context.incrementFailedTask();
        }
    }
}

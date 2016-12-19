package ru.sbt.Threads;

import java.util.concurrent.Callable;

public class Task<T> {
    private T result;
    private final Callable<T> callable;
    private volatile boolean finished;
    private Exception exception;

    public Task(Callable<T> callable) {
        this.callable = callable;
    }

    public T get() throws Exception {
        if (!finished) {
            synchronized (this) {
                if (!finished) {
                    try {
                        result = callable.call();
                    } catch (Exception e) {
                        exception = e;
                        throw e;
                    } finally {
                        finished = true;
                    }
                }
            }
        }
        if (exception != null) throw exception;
        return result;

    }
}

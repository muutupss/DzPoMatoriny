package ru.sbt.Threads;

public interface TaskManager {
    Context execute(Runnable... runnables);
}

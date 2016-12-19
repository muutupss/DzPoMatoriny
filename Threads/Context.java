package ru.sbt.Threads;

public interface Context {
    int getFinishedTaskCount();

    void stop();

    int getFailedTaskCount();

    void incrementFailedTask();

    int getSuccessfinishedTaskCount();

    void incrementSuccessTask();
}

package com.github.butterbrother.ews.redirector.service;

/**
 * Сервис с плавной остановкой
 */
public abstract class SafeStopService
        implements Runnable{
    private boolean active = true;
    private boolean done = false;
    private Thread currentThread = null;

    /**
     * Прекращает активность сервиса
     */
    public void safeStop() {
        active = false;
        if (currentThread != null)
            currentThread.interrupt();
    }

    /**
     * Проверка активности сервиса
     * @return  текущий статус
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Проверка завершения работы сервиса
     * @return  текущий статус
     */
    public boolean isDone() {
        return done;
    }

    /**
     * Установка флага завершения работы сервиса
     * Вызов выполняется по завершению работы потока.
     */
    protected void wellDone() {
        done = true;
        active = false;
    }

    /**
     * Запуск сервиса
     */
    public void runService() {
        currentThread = new Thread(this);
        currentThread.start();
    }
}

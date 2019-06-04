package edu.iis.mto.multithread;

import java.util.concurrent.Executor;

public class BetterRadar implements Runnable {

    private PatriotBattery patriotBattery;

    private Executor executor;

    private int numberOfRockets;

    public BetterRadar(PatriotBattery patriotBattery, Executor executor, int numberOfRockets) {
        this.patriotBattery = patriotBattery;
        this.executor = executor;
        this.numberOfRockets = numberOfRockets;
    }

    public void notice(Scud enemyMissle) {
        launchPatriot();
    }

    private void launchPatriot() {
        executor.execute(this);
    }

    @Override
    public void run() {
        for(int i = 0; i < numberOfRockets; i++) {
            patriotBattery.launchPatriot();
        }
    }
}

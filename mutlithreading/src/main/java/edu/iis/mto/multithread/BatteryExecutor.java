package edu.iis.mto.multithread;

import java.util.concurrent.Executor;

public class BatteryExecutor implements Executor {

    private boolean launchInTheSameThread;

    public BatteryExecutor(boolean launchInTheSameThread) {
        this.launchInTheSameThread = launchInTheSameThread;
    }

    @Override
    public void execute(Runnable command) {
        if(launchInTheSameThread) {
            command.run();
        }
        else {
            new Thread(command).start();
        }
    }
}

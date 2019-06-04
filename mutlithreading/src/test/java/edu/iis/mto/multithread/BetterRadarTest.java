package edu.iis.mto.multithread;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BetterRadarTest {

    @Test
    public void patriotBatteryShouldCallLaunchPatriotOnce() {
        PatriotBattery patriotBatteryMock = mock(PatriotBattery.class);
        BetterRadar betterRadar = new BetterRadar(patriotBatteryMock, new BatteryExecutor(true), 1);
        betterRadar.notice(new Scud());
        verify(patriotBatteryMock, times(1)).launchPatriot();
    }

}
package edu.iis.mto.multithread;

import org.junit.Rule;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BetterRadarTest {

    @Rule
    public RepeatRule repeatRule = new RepeatRule();

    @Test
    @RepeatRule.Repeat(times = 100)
    public void patriotBatteryShouldCallLaunchPatriotOnce() {
        PatriotBattery patriotBatteryMock = mock(PatriotBattery.class);
        BetterRadar betterRadar = new BetterRadar(patriotBatteryMock, new BatteryExecutor(true), 1);
        betterRadar.notice(new Scud());
        verify(patriotBatteryMock, times(1)).launchPatriot();
    }

}
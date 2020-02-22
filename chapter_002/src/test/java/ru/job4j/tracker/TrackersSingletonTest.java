package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;

import static org.junit.Assert.assertThat;
public class TrackersSingletonTest {
@Test
    public void whenUsedFirst() {
    FirstTrackerSingleton trackerOne = FirstTrackerSingleton.getInstance();
    FirstTrackerSingleton trackerTwo = FirstTrackerSingleton.getInstance();
    assertThat(trackerOne == trackerTwo, is(true));
}
    @Test
    public void whenUsedSecond() {
        SecondTrackerSingleton trackerOne = SecondTrackerSingleton.getInstance();
        SecondTrackerSingleton trackerTwo = SecondTrackerSingleton.getInstance();
        assertThat(trackerOne == trackerTwo, is(true));
    }
    @Test
    public void whenUsedThird() {
        ThirdTrackerSingleton trackerOne = ThirdTrackerSingleton.instance;
        ThirdTrackerSingleton trackerTwo = ThirdTrackerSingleton.instance;
        assertThat(trackerOne == trackerTwo, is(true));
    }
    @Test
    public void whenUsedFourth() {
        FourthTrackerSingleton trackerOne = FourthTrackerSingleton.getInstance();
        FourthTrackerSingleton trackerTwo = FourthTrackerSingleton.getInstance();
        assertThat(trackerOne == trackerTwo, is(true));
    }
}

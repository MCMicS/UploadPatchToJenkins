package de.mcmics.jenkins;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SorterTest {

    private Collection<Data> unsorted = new ArrayList<>();
    private Collection<Data> sorted = new ArrayList<>();

    @Before
    public void createSorted() {
        sorted.add(new SimpleData(1L));
        sorted.add(new SimpleData(10L));
        sorted.add(new SimpleData(10L, 1));
        sorted.add(new TestData(5L, 2));
        sorted.add(new TestData(1L, 50));
        sorted.add(new SimpleData(2L, 50));
    }

    @Before
    public void createUnsorted() {
        unsorted.add(new SimpleData(1L));
        unsorted.add(new SimpleData(10L));
        unsorted.add(new TestData(1L, 50));
        unsorted.add(new SimpleData(2L, 50));
        unsorted.add(new SimpleData(10L, 1));
        unsorted.add(new TestData(5L, 2));
    }

    @Test
    public void sort() {
        Assertions.assertThat(Sorter.sort(unsorted)).isEqualTo(sorted);
    }

    @Test
    public void failure() {
        Assertions.assertThat(unsorted).isEqualTo(sorted);
    }

    @Test
    public void fixItWithPatch() {
        SimpleData data = new SimpleData(1L);
        Assertions.assertThat(Sorter.sort(Collections.singleton(data))).doesNotContain(data);
        //Assertions.assertThat(Sorter.sort(Collections.singleton(data))).containsOnly(data);
    }
}

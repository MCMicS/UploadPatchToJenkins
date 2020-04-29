package de.mcmics.jenkins;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Sorter {

    public static Collection<Data> sort(Collection<Data> datas) {
        return datas.stream().sorted(Comparator.comparingInt(Data::getPosition).thenComparingLong(Data::getId)).collect(Collectors.toList());
    }

    public static SortedSet<Data> sortedSet(Collection<Data> datas) {
        return sort(datas).stream().collect(Collectors.toCollection(TreeSet::new));
    }

    private static Comparator<Data> comparator() {
        return Comparator.comparingInt(Data::getPosition).thenComparingLong(Data::getId);
    }

    int test(int a, long b) {
        return 2;
    }


    @FunctionalInterface
    public interface ByPositionFunction {

        /**
         * Applies this function to the given arguments.
         *
         * @param t the first function argument
         * @param u the second function argument
         * @return the function result
         */
        int applyAsInt(Data t, Data u);
    }

}

package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3Numbers() {
        int[] data = new int[] {5, 7, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 5, 7};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort5Numbers() {
        int[] data = new int[] {12, 43, 10, 2, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 6, 10, 12, 43};
        Assert.assertArrayEquals(expected, result);
    }
}

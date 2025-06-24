package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemSortByNameTest {

    @Test
    void itemAscByNameTest() {
        List<Item> items = Arrays.asList(
                new Item(10, "BBBB"),
                new Item(20, "AAAA"),
                new Item(30, "CCCC")
        );
        List<Item> expected = new ArrayList<>();
        expected.add(items.get(1));
        expected.add(items.get(0));
        expected.add(items.get(2));

        Collections.sort(items, new ItemAscByName());
        assertThat(items).isEqualTo(expected);
    }

    @Test
    void itemDescByNameTest() {
        List<Item> items = Arrays.asList(
                new Item(10, "BBBB"),
                new Item(20, "AAAA"),
                new Item(30, "CCCC")
        );
        List<Item> expected = new ArrayList<>();
        expected.add(items.get(2));
        expected.add(items.get(0));
        expected.add(items.get(1));

        Collections.sort(items, new ItemDescByName());
        assertThat(items).isEqualTo(expected);
    }
}
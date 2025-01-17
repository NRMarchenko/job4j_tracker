package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int size = 0;
        for (int i = 0; i < this.size; i++) {
            if (items[i].getName() == key) {
                result[size] = items[i];
                size++;
            }
        }
        result = Arrays.copyOf(result, size);
        return result;
    }

    public Item[] findAll() {
        Item[] result = new Item[size];
        int size = 0;
        for (int i = 0; i < this.size; i++) {
            if (items[i] != null) {
                result[size] = items[i];
                size++;
            }
        }
        result = Arrays.copyOf(result, size);
        return result;
    }

    public boolean replace(int id, Item updateItem) {
        int index = indexOf(id);
        if (index != -1) {
            updateItem.setId(id);
            items[index] = updateItem;
            return true;
        }
        return false;

    }
}
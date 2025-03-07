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
        int temp = 0;
        for (int i = 0; i < this.size; i++) {
            if (items[i].getName().equals(key)) {
                result[temp] = items[i];
                temp++;
            }
        }
        result = Arrays.copyOf(result, temp);
        return result;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public boolean replace(int id, Item updateItem) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            updateItem.setId(id);
            items[index] = updateItem;
        }
        return result;
    }

    public void delete(int id) {
        int delPos = indexOf(id);
        boolean result = delPos != -1;
        if (result) {
            System.arraycopy(items, delPos + 1, items, delPos, size - delPos - 1);
            items[size - 1] = null;
            size--;
        }
    }
}